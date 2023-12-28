package io.github.dftrakesh.shipstation;

import io.github.dftrakesh.shipstation.handler.JsonBodyHandler;
import io.github.dftrakesh.shipstation.model.stores.StoresResponseWrapper;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.BASE_END_POINT;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.STORE_LIST_END_POINT;

public class StoreAPI extends ShipStationSDK {
    public StoreAPI(String userName, String password) {
        super(userName, password);
    }

    @SneakyThrows
    public StoresResponseWrapper getStoreList() {
        URI uri = new URI(BASE_END_POINT + STORE_LIST_END_POINT);
        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<StoresResponseWrapper> handler = new JsonBodyHandler<>(StoresResponseWrapper.class);
        return getRequestWrapped(request, handler);
    }
}
