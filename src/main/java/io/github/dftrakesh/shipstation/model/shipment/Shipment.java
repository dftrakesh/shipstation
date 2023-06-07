package io.github.dftrakesh.shipstation.model.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.github.dftrakesh.shipstation.model.order.*;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shipment {

    private Long shipmentId;
    private Long orderId;
    private String orderKey;
    private String userId;
    private String orderNumber;
    private String customerEmail;
    private String createDate;
    private String shipDate;
    private Double shipmentCost;
    private Double insuranceCost;
    private String trackingNumber;
    private Boolean isReturnLabel;
    private String batchNumber;
    private String carrierCode;
    private String serviceCode;
    private String packageCode;
    private String confirmation;
    private Long warehouseId;
    private Boolean voided;
    private String voidDate;
    private Boolean marketplaceNotified;
    private String notifyErrorMessage;
    private ShipTo shipTo;
    private Weight weight;
    private Dimensions dimensions;
    private InsuranceOptions insuranceOptions;
    private AdvancedOptions advancedOptions;
    private Item shipmentItems;
}
