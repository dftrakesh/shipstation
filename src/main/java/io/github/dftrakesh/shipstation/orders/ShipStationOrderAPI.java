package io.github.dftrakesh.shipstation.orders;

import java.util.HashMap;

import javax.ws.rs.HttpMethod;

import io.github.dftrakesh.shipstation.ShipStationStore;
import io.github.dftrakesh.shipstation.shipment.ShipmentResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jbt.constants.BCConstants;

public class ShipStationOrderAPI {
	private ShipStationStore store;
	private static final Logger logger = LogManager.getLogger();
	private static final String ENDPOINT_ORDERS = "/orders";
	private static final String ENDPOINT_CREATE_OR_UPDATE_ORDER = "/orders/createorder";
	private static final String ENDPOINT_MARK_ORDER_AS_SHIPPED = "/orders/markasshipped";
	private static final String ENDPOINT_MARK_ORDER_ADD_TAGS = "/orders/addtag";
	private static final String ENDPOINT_SHIPMENT = "/shipments";
	
	public ShipStationOrderAPI(){}
	public ShipStationOrderAPI(ShipStationStore store) {
		this.store = store;
	}
	
	public ShipStationOrder listOrders(HashMap<String, String> map) {
		int iRetry = 1;
		ShipStationOrder temp = null;
		String mapToParameterString = store.mapToParameterString(map);
		while (iRetry <= 5) {
			try {
				String response  = store.getJSONResponse(ENDPOINT_ORDERS +"?" + mapToParameterString, BCConstants.HTTP_REQUEST_METHOD_GET);
				temp = new Gson().fromJson(response, ShipStationOrder.class);
				break;
			} catch (Exception e) {				
				logger.debug("ship station Order API Retry : " + iRetry + " Error :" + e.getMessage());
				iRetry++;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) { 
					e1.printStackTrace();
				}
			}
		}			
		return temp;
	}
	
	public Order getOrder(String orderId){
		String jsonResponse  = store.getJSONResponse(ENDPOINT_ORDERS +"/" + orderId, BCConstants.HTTP_REQUEST_METHOD_GET);
		return new Gson().fromJson(jsonResponse, Order.class);
	}
	
	public Order updateProduct(Order order) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json =  gson.toJson(order);
		//logger.debug("json : " + json);
		String jsonResponse = store.getJSONResponse(ENDPOINT_CREATE_OR_UPDATE_ORDER,BCConstants.HTTP_REQUEST_METHOD_POST,json);
		return new Gson().fromJson(jsonResponse, Order.class);
	}
	
	public String markasshipped(String orderId, String trackingNumber, String strCarrierCode) {
		String json = "{\"orderId\": " + orderId + ",\"trackingNumber\": \"" + trackingNumber + "\",\"notifyCustomer\": true,\"notifySalesChannel\": true,\"carrierCode\":\""+strCarrierCode+"\"}";		
		logger.debug("json : " + json);
		String jsonResponse = store.getJSONResponse(ENDPOINT_MARK_ORDER_AS_SHIPPED,BCConstants.HTTP_REQUEST_METHOD_POST,json);
		return jsonResponse;
	}
	public String addTag(String orderId, Integer tagId) {		
		String json = "{\"orderId\": " + orderId + ",\"tagId\": " + tagId + "}";
		logger.debug("addTag jsonReq : " + json);
		String jsonResponse = null;
		int iRetryCount = 1;
		while(iRetryCount <= 5) {
			try {
				jsonResponse = store.getJSONResponse(ENDPOINT_MARK_ORDER_ADD_TAGS,HttpMethod.POST,json);
				break;
			}
			catch (Exception e) {
				iRetryCount++;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}				
			}
		}
		logger.debug("addTag jsonResponse : " + jsonResponse);
		return jsonResponse;
	}
	
	
	public ShipmentResponse getShipment(String orderNumber, String shipstationOrderId){
		String jsonResponse  = store.getJSONResponse(ENDPOINT_SHIPMENT +"?orderNumber="+orderNumber+"&orderId=" + shipstationOrderId, BCConstants.HTTP_REQUEST_METHOD_GET);
		return new Gson().fromJson(jsonResponse, ShipmentResponse.class);
	}
}
