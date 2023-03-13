package io.github.dftrakesh.shipstation;

import io.github.dftrakesh.shipstation.handler.JsonBodyHandler;
import io.github.dftrakesh.shipstation.model.order.Order;
import io.github.dftrakesh.shipstation.model.order.OrdersResponse;
import lombok.SneakyThrows;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.BASE_END_POINT;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.ORDERS_LIST_END_POINT;

public class OrderAPI extends ShipStationSDK {

    public OrderAPI(String userName, String password) {
        super(userName, password);
    }

    @SneakyThrows
    public OrdersResponse getOrders(HashMap<String, String> params) {
        URI uri = new URI(BASE_END_POINT + ORDERS_LIST_END_POINT);
        uri = addParameters(uri, params);

        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<OrdersResponse> handler = new JsonBodyHandler<>(OrdersResponse.class);
        return getRequestWrapped(request, handler);
    }

    @SneakyThrows
    public Order getOrder(Integer orderId) {
        URI uri = new URI(BASE_END_POINT + ORDERS_LIST_END_POINT + "/" + orderId);

        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<Order> handler = new JsonBodyHandler<>(Order.class);
        return getRequestWrapped(request, handler);
    }
}