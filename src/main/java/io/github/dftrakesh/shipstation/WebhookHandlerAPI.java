package io.github.dftrakesh.shipstation;

import io.github.dftrakesh.shipstation.constantcode.ConstantCodes;
import io.github.dftrakesh.shipstation.handler.JsonBodyHandler;
import io.github.dftrakesh.shipstation.model.shipment.Shipment;
import io.github.dftrakesh.shipstation.model.shipment.ShipmentResponse;
import lombok.SneakyThrows;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.BASE_END_POINT;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.ORDER_SHIPMENT_LIST;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.QUERY_PARAM_PAGE;

public class WebhookHandlerAPI extends ShipStationSDK {

    public WebhookHandlerAPI(String userName, String password) {
        super(userName, password);
    }

    @SneakyThrows
    public List<Shipment> getShipments(String resourceUrl) {
        List<Shipment> shipmentList = new ArrayList<>();
        HashMap<String, String> queryParamMap = getQueryParamMap(resourceUrl);

        int i = 1;
        ShipmentResponse shipmentResponse;
        URI uri = new URI(BASE_END_POINT + ORDER_SHIPMENT_LIST);
        do {
            queryParamMap.put(QUERY_PARAM_PAGE, String.valueOf(i));
            URI finalUri = addParameters(uri, queryParamMap);
            HttpRequest request = get(finalUri);

            HttpResponse.BodyHandler<ShipmentResponse> handler = new JsonBodyHandler<>(ShipmentResponse.class);
            shipmentResponse = getRequestWrapped(request, handler);
            shipmentList.addAll(shipmentResponse.getShipments());
        } while (++i <= shipmentResponse.getPages());

        return shipmentList;
    }
}