package io.github.dftrakesh.shipstation.model.shipment;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ShipOrderResponse {
    private int orderId;
    private String orderNumber;
}
