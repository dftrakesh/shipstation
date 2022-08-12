package io.github.dftrakesh.shipstation.accounts;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.HttpMethod;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.github.dftrakesh.shipstation.ShipStationStore;

public class ListTags {
	private static final String ENDPOINT_ORDERS = "/accounts/listtags";
	ShipStationStore shipStationStore;
	public ListTags() {}
	public ListTags(ShipStationStore shipStationStore) {
		this.shipStationStore = shipStationStore;
	}
	
	public List<Tags> getAllTags() {
		List<Tags> listTags = new ArrayList<Tags>();
		String response  = shipStationStore.getJSONResponse(ENDPOINT_ORDERS, HttpMethod.GET);
		listTags = new Gson().fromJson(response,new TypeToken<List<Tags>>() {}.getType() );
		return listTags;
	}
}
