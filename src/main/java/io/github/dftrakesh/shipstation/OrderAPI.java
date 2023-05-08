package io.github.dftrakesh.shipstation;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.dftrakesh.shipstation.handler.JsonBodyHandler;
import io.github.dftrakesh.shipstation.model.order.Order;
import io.github.dftrakesh.shipstation.model.order.OrdersResponse;
import io.github.dftrakesh.shipstation.model.shipment.ShipOrderRequest;
import io.github.dftrakesh.shipstation.model.shipment.ShipOrderResponse;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.*;

public class OrderAPI extends ShipStationSDK {

    private final ObjectMapper objectMapper;

    public OrderAPI(String userName, String password) {
        super(userName, password);
        objectMapper = new ObjectMapper();
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

    @SneakyThrows
    public ShipOrderResponse markAsShipped(ShipOrderRequest shipOrderRequest) {
        URI uri = new URI(BASE_END_POINT + ORDER_MARK_AS_SHIPPED);
        String jsonBody = objectMapper.writeValueAsString(shipOrderRequest);
        HttpRequest request = post(uri, jsonBody);
        HttpResponse.BodyHandler<ShipOrderResponse> handler = new JsonBodyHandler<>(ShipOrderResponse.class);
        return getRequestWrapped(request, handler);
    }
}