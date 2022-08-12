package io.github.dftrakesh.shipstation.orders;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Item {

    @SerializedName("orderItemId")
    @Expose
    private String orderItemId;
    @SerializedName("lineItemKey")
    @Expose
    private String lineItemKey;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("weight")
    @Expose
    private Object weight;
    @SerializedName("quantity")
    @Expose
    private String quantity;
    @SerializedName("unitPrice")
    @Expose
    private Double unitPrice;
    @SerializedName("taxAmount")
    @Expose
    private String taxAmount;
    @SerializedName("shippingAmount")
    @Expose
    private String shippingAmount;
    @SerializedName("warehouseLocation")
    @Expose
    private Object warehouseLocation;
    @SerializedName("options")
    @Expose
    private List<Object> options = new ArrayList<Object>();
    @SerializedName("productId")
    @Expose
    private String productId;
    @SerializedName("fulfillmentSku")
    @Expose
    private Object fulfillmentSku;
    @SerializedName("adjustment")
    @Expose
    private Boolean adjustment;
    @SerializedName("upc")
    @Expose
    private Object upc;
    @SerializedName("createDate")
    @Expose
    private String createDate;
    @SerializedName("modifyDate")
    @Expose
    private String modifyDate;

    /**
     * 
     * @return
     *     The orderItemId
     */
    public String getOrderItemId() {
        return orderItemId;
    }

    /**
     * 
     * @param orderItemId
     *     The orderItemId
     */
    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * 
     * @return
     *     The lineItemKey
     */
    public String getLineItemKey() {
        return lineItemKey;
    }

    /**
     * 
     * @param lineItemKey
     *     The lineItemKey
     */
    public void setLineItemKey(String lineItemKey) {
        this.lineItemKey = lineItemKey;
    }

    /**
     * 
     * @return
     *     The sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * 
     * @param sku
     *     The sku
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Object getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Object weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @return
     *     The unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * 
     * @param unitPrice
     *     The unitPrice
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 
     * @return
     *     The taxAmount
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * 
     * @param taxAmount
     *     The taxAmount
     */
    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    /**
     * 
     * @return
     *     The shippingAmount
     */
    public String getShippingAmount() {
        return shippingAmount;
    }

    /**
     * 
     * @param shippingAmount
     *     The shippingAmount
     */
    public void setShippingAmount(String shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    /**
     * 
     * @return
     *     The warehouseLocation
     */
    public Object getWarehouseLocation() {
        return warehouseLocation;
    }

    /**
     * 
     * @param warehouseLocation
     *     The warehouseLocation
     */
    public void setWarehouseLocation(Object warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    /**
     * 
     * @return
     *     The options
     */
    public List<Object> getOptions() {
        return options;
    }

    /**
     * 
     * @param options
     *     The options
     */
    public void setOptions(List<Object> options) {
        this.options = options;
    }

    /**
     * 
     * @return
     *     The productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId
     *     The productId
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * 
     * @return
     *     The fulfillmentSku
     */
    public Object getFulfillmentSku() {
        return fulfillmentSku;
    }

    /**
     * 
     * @param fulfillmentSku
     *     The fulfillmentSku
     */
    public void setFulfillmentSku(Object fulfillmentSku) {
        this.fulfillmentSku = fulfillmentSku;
    }

    /**
     * 
     * @return
     *     The adjustment
     */
    public Boolean getAdjustment() {
        return adjustment;
    }

    /**
     * 
     * @param adjustment
     *     The adjustment
     */
    public void setAdjustment(Boolean adjustment) {
        this.adjustment = adjustment;
    }

    /**
     * 
     * @return
     *     The upc
     */
    public Object getUpc() {
        return upc;
    }

    /**
     * 
     * @param upc
     *     The upc
     */
    public void setUpc(Object upc) {
        this.upc = upc;
    }

    /**
     * 
     * @return
     *     The createDate
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * 
     * @param createDate
     *     The createDate
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * 
     * @return
     *     The modifyDate
     */
    public String getModifyDate() {
        return modifyDate;
    }

    /**
     * 
     * @param modifyDate
     *     The modifyDate
     */
    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

}
