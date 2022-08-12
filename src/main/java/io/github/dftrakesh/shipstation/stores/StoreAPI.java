package io.github.dftrakesh.shipstation.stores;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.github.dftrakesh.shipstation.ShipStationStore;
import com.jbt.constants.BCConstants;

public class StoreAPI {
	private ShipStationStore store;
	private static final String ENDPOINT_STORES = "/stores";
	private static final String ENDPOINT_STORE_BY_ID = "/orders/%s";
	
	public StoreAPI(){}
	public StoreAPI(ShipStationStore store) {
		this.store = store;
	}
	
	public List<SSStore> getAllStores() {
		String response  = store.getJSONResponse(ENDPOINT_STORES , BCConstants.HTTP_REQUEST_METHOD_GET);
		List<SSStore> listShipStationStore = new Gson().fromJson(response,new TypeToken<List<SSStore>>() {}.getType() );
		return listShipStationStore;
	}

	public List<SSStore> getStore(String id) {
		String response  = store.getJSONResponse(String.format(ENDPOINT_STORE_BY_ID, id) , BCConstants.HTTP_REQUEST_METHOD_GET);
		List<SSStore> listShipStationStore = new Gson().fromJson(response,new TypeToken<List<SSStore>>() {}.getType() );
		return listShipStationStore;
	}
}
