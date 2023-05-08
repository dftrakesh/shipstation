package io.github.dftrakesh.shipstation.model.shipment;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ShipOrderResponse {
    private Integer orderId;
    private String orderNumber;
}
