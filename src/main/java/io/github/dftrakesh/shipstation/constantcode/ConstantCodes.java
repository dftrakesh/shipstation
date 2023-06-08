package io.github.dftrakesh.shipstation.constantcode;

public interface ConstantCodes {

    String BASE_END_POINT = "https://ssapi.shipstation.com";
    String ORDERS_LIST_END_POINT = "/orders";
    String ORDER_MARK_AS_SHIPPED = "/orders/markasshipped";
    String ORDER_SHIPMENT_LIST = "/shipments";
    String AUTHORIZATION = "Authorization";
    String HTTP_REQUEST_PROPERTY_CONTENT_TYPE = "Content-Type";
    String HTTP_REQUEST_CONTENT_TYPE_JSON = "application/json";
    int MAX_ATTEMPTS = 40;
    int TIME_OUT_DURATION = 1500;
}