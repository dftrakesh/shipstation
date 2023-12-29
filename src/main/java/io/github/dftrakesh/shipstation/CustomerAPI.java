package io.github.dftrakesh.shipstation;

import io.github.dftrakesh.shipstation.handler.JsonBodyHandler;
import io.github.dftrakesh.shipstation.model.customer.CustomerResponse;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.BASE_END_POINT;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.CUSTOMER_LIST_END_POINT;

public class CustomerAPI extends ShipStationSDK {

    public CustomerAPI(String userName, String password) {
        super(userName, password);
    }

    @SneakyThrows
    public CustomerResponse getCustomerById(Integer customerId) {
        URI uri = new URI(BASE_END_POINT + CUSTOMER_LIST_END_POINT + customerId);
        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<CustomerResponse> handler = new JsonBodyHandler<>(CustomerResponse.class);
        return getRequestWrapped(request, handler);
    }
}
