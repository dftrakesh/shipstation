package io.github.dftrakesh.shipstation;

import io.github.dftrakesh.shipstation.model.order.Order;
import io.github.dftrakesh.shipstation.model.order.OrdersResponse;
import lombok.SneakyThrows;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.client.utils.URIBuilder;
import java.net.URI;
import java.net.http.HttpRequest;
import java.util.HashMap;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.BASE_END_POINT;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.ORDERS_LIST_END_POINT;

public class OrderAPI extends ShipStationSDK {

    private final String authentication;

    public OrderAPI(String userName, String password) {
        String authString = userName + ":" + password;
        byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
        this.authentication = new String(authEncBytes);
    }

    @SneakyThrows
    public OrdersResponse getOrders(HashMap<String, String> params) {

        URIBuilder uriBuilder = new URIBuilder(BASE_END_POINT + ORDERS_LIST_END_POINT);
        addParameters(uriBuilder, params);

        HttpRequest request = HttpRequest.newBuilder(new URI(BASE_END_POINT + ORDERS_LIST_END_POINT))
                                         .header("Authorization", "Basic " + authentication)
                                         .GET()
                                         .build();
        return getRequestWrapped(request, OrdersResponse.class);
    }

    @SneakyThrows
    public Order getOrder(Integer orderId) {

        HttpRequest request = HttpRequest.newBuilder(new URI(BASE_END_POINT + ORDERS_LIST_END_POINT + "/" + orderId))
                                         .header("Authorization", "Basic " + authentication)
                                         .GET()
                                         .build();
        return getRequestWrapped(request, Order.class);
    }
}