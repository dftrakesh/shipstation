package io.github.dftrakesh.shipstation;

import io.github.dftrakesh.shipstation.handler.JsonBodyHandler;
import io.github.dftrakesh.shipstation.model.order.Order;
import io.github.dftrakesh.shipstation.model.order.OrdersResponse;
import lombok.SneakyThrows;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.ORDERS_LIST_END_POINT;

public class OrderAPI extends ShipStationSDK {

    public OrderAPI(String userName, String password) {
        super(userName, password);
    }

    @SneakyThrows
    public OrdersResponse getOrders(HashMap<String, String> params) {
        String path = addParameters(ORDERS_LIST_END_POINT, params);
        HttpRequest request = get(path);
        HttpResponse.BodyHandler<OrdersResponse> handler = new JsonBodyHandler<>(OrdersResponse.class);
        return getRequestWrapped(request, handler);
    }

    @SneakyThrows
    public Order getOrder(Integer orderId) {
        String path = ORDERS_LIST_END_POINT + "/" + orderId;
        HttpRequest request = get(path);
        HttpResponse.BodyHandler<Order> handler = new JsonBodyHandler<>(Order.class);
        return getRequestWrapped(request, handler);
    }
}