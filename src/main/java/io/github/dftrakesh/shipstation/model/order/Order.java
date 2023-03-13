package io.github.dftrakesh.shipstation.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {

    private Integer orderId;
    private String orderNumber;
    private String orderKey;
    private String orderDate;
    private String createDate;
    private String modifyDate;
    private String paymentDate;
    private String shipByDate;
    private String orderStatus;
    private Integer customerId;
    private String customerUsername;
    private String customerEmail;
    private Address billTo;
    private Address shipTo;
    private List<Item> items;
    private Integer orderTotal;
    private Double amountPaid;
    private Double taxAmount;
    private Double shippingAmount;
    private String customerNotes;
    private String internalNotes;
    private Boolean gift;
    private String giftMessage;
    private String paymentMethod;
    private String requestedShippingService;
    private String carrierCode;
    private String serviceCode;
    private String packageCode;
    private String confirmation;
    private String shipDate;
    private String holdUntilDate;
    private Weight weight;
    private Dimensions dimensions;
    private InsuranceOptions insuranceOptions;
    private InternationalOptions internationalOptions;
    private AdvancedOptions advancedOptions;
    private Integer tagIds;
    private String userId;
    private Boolean externallyFulfilled;
    private String externallyFulfilledBy;
    private String externallyFulfilledById;
    private String externallyFulfilledByName;
    private String labelMessages;
}