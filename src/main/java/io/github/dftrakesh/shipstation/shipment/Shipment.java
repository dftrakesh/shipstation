
package io.github.dftrakesh.shipstation.shipment;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Shipment {

    @SerializedName("shipmentId")
    @Expose
    private Long shipmentId;
    @SerializedName("orderId")
    @Expose
    private Long orderId;
    @SerializedName("orderKey")
    @Expose
    private String orderKey;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("customerEmail")
    @Expose
    private String customerEmail;
    @SerializedName("orderNumber")
    @Expose
    private String orderNumber;
    @SerializedName("createDate")
    @Expose
    private String createDate;
    @SerializedName("shipDate")
    @Expose
    private String shipDate;
    @SerializedName("shipmentCost")
    @Expose
    private Double shipmentCost;
    @SerializedName("insuranceCost")
    @Expose
    private Double insuranceCost;
    @SerializedName("trackingNumber")
    @Expose
    private String trackingNumber;
    @SerializedName("isReturnLabel")
    @Expose
    private Boolean isReturnLabel;
    @SerializedName("batchNumber")
    @Expose
    private String batchNumber;
    @SerializedName("carrierCode")
    @Expose
    private String carrierCode;
    @SerializedName("serviceCode")
    @Expose
    private String serviceCode;
    @SerializedName("packageCode")
    @Expose
    private String packageCode;
    @SerializedName("confirmation")
    @Expose
    private String confirmation;
    @SerializedName("warehouseId")
    @Expose
    private Long warehouseId;
    @SerializedName("voided")
    @Expose
    private Boolean voided;
    @SerializedName("voidDate")
    @Expose
    private Object voidDate;
    @SerializedName("marketplaceNotified")
    @Expose
    private Boolean marketplaceNotified;
    @SerializedName("notifyErrorMessage")
    @Expose
    private String notifyErrorMessage;
    @SerializedName("shipTo")
    @Expose
    private ShipTo shipTo;
    @SerializedName("weight")
    @Expose
    private Weight weight;
    @SerializedName("dimensions")
    @Expose
    private Object dimensions;
    @SerializedName("insuranceOptions")
    @Expose
    private InsuranceOptions insuranceOptions;
    @SerializedName("advancedOptions")
    @Expose
    private AdvancedOptions advancedOptions;
    @SerializedName("shipmentItems")
    @Expose
    private Object shipmentItems;
    @SerializedName("labelData")
    @Expose
    private Object labelData;
    @SerializedName("formData")
    @Expose
    private Object formData;

    public Long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderKey() {
        return orderKey;
    }

    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getShipDate() {
        return shipDate;
    }

    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    public Double getShipmentCost() {
        return shipmentCost;
    }

    public void setShipmentCost(Double shipmentCost) {
        this.shipmentCost = shipmentCost;
    }

    public Double getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(Double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Boolean getIsReturnLabel() {
        return isReturnLabel;
    }

    public void setIsReturnLabel(Boolean isReturnLabel) {
        this.isReturnLabel = isReturnLabel;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    public String getConfirmation() {
        return confirmation;
    }

    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Boolean getVoided() {
        return voided;
    }

    public void setVoided(Boolean voided) {
        this.voided = voided;
    }

    public Object getVoidDate() {
        return voidDate;
    }

    public void setVoidDate(Object voidDate) {
        this.voidDate = voidDate;
    }

    public Boolean getMarketplaceNotified() {
        return marketplaceNotified;
    }

    public void setMarketplaceNotified(Boolean marketplaceNotified) {
        this.marketplaceNotified = marketplaceNotified;
    }

    public String getNotifyErrorMessage() {
        return notifyErrorMessage;
    }

    public void setNotifyErrorMessage(String notifyErrorMessage) {
        this.notifyErrorMessage = notifyErrorMessage;
    }

    public ShipTo getShipTo() {
        return shipTo;
    }

    public void setShipTo(ShipTo shipTo) {
        this.shipTo = shipTo;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public Object getDimensions() {
        return dimensions;
    }

    public void setDimensions(Object dimensions) {
        this.dimensions = dimensions;
    }

    public InsuranceOptions getInsuranceOptions() {
        return insuranceOptions;
    }

    public void setInsuranceOptions(InsuranceOptions insuranceOptions) {
        this.insuranceOptions = insuranceOptions;
    }

    public AdvancedOptions getAdvancedOptions() {
        return advancedOptions;
    }

    public void setAdvancedOptions(AdvancedOptions advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    public Object getShipmentItems() {
        return shipmentItems;
    }

    public void setShipmentItems(Object shipmentItems) {
        this.shipmentItems = shipmentItems;
    }

    public Object getLabelData() {
        return labelData;
    }

    public void setLabelData(Object labelData) {
        this.labelData = labelData;
    }

    public Object getFormData() {
        return formData;
    }

    public void setFormData(Object formData) {
        this.formData = formData;
    }

}
