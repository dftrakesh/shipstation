package io.github.dftrakesh.shipstation.model.shipment;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShipOrderRequest {
    private Integer orderId;
    private String carrierCode;
    private String shipDate;
    private String trackingNumber;
    private Boolean notifyCustomer;
    private Boolean notifySalesChannel;
}
