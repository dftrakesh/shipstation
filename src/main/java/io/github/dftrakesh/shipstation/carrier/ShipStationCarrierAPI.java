package io.github.dftrakesh.shipstation.carrier;

import io.github.dftrakesh.shipstation.ShipStationStore;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.jbt.constants.BCConstants;

public class ShipStationCarrierAPI {
	private ShipStationStore store;
	private static final Logger logger = LogManager.getLogger();
	private static final String ENDPOINT_CARRIERS = "/carriers";
	
	public ShipStationCarrierAPI(){}
	public ShipStationCarrierAPI(ShipStationStore store) {
		this.store = store;
	}
	
	public void listCarriers() {
		String response  = store.getJSONResponse(ENDPOINT_CARRIERS, BCConstants.HTTP_REQUEST_METHOD_GET);
		logger.debug("Response : " + response);
	}
}
