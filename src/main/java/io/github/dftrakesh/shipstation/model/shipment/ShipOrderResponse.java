package io.github.dftrakesh.shipstation.model.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipOrderResponse {
    private Integer orderId;
    private String orderNumber;
}
