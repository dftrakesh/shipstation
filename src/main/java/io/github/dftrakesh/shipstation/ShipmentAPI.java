package io.github.dftrakesh.shipstation;

import io.github.dftrakesh.shipstation.handler.JsonBodyHandler;
import io.github.dftrakesh.shipstation.model.shipment.ShipmentResponse;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.BASE_END_POINT;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.ORDER_SHIPMENT_LIST;

public class ShipmentAPI extends ShipStationSDK {


    public ShipmentAPI(String userName, String password) {
        super(userName, password);
    }

    @SneakyThrows
    public ShipmentResponse getShipment(HashMap<String, String> params) {
        URI uri = new URI(BASE_END_POINT + ORDER_SHIPMENT_LIST);
        uri = addParameters(uri, params);

        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<ShipmentResponse> handler = new JsonBodyHandler<>(ShipmentResponse.class);
        return getRequestWrapped(request, handler);
    }

}