package io.github.dftrakesh.shipstation.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    private Integer orderItemId;
    private String lineItemKey;
    private String sku;
    private String name;
    private String imageUrl;
    private Weight weight;
    private Integer quantity;
    private Double unitPrice;
    private Double taxAmount;
    private Double shippingAmount;
    private String warehouseLocation;
    private List<ItemOption> options;
    private Integer productId;
    private String fulfillmentSku;
    private Boolean adjustment;
    private String upc;
    private String createDate;
    private String modifyDate;
}