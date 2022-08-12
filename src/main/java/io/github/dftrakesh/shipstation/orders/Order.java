package io.github.dftrakesh.shipstation.orders;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Order {

    @SerializedName("orderId")
    @Expose
    private String orderId;
    
    @SerializedName("orderNumber")
    @Expose
    private String orderNumber;
    
    @SerializedName("orderKey")
    @Expose
    private String orderKey;
    
    @SerializedName("orderDate")
    @Expose
    private String orderDate;
    
    @SerializedName("createDate")
    @Expose
    private String createDate;
    
    @SerializedName("modifyDate")
    @Expose
    private String modifyDate;
    
    @SerializedName("paymentDate")
    @Expose
    private String paymentDate;
    
    @SerializedName("shipByDate")
    @Expose
    private String shipByDate;
    
    @SerializedName("orderStatus")
    @Expose
    private String orderStatus;
    
    @SerializedName("customerId")
    @Expose
    private String customerId;
    
    @SerializedName("customerUsername")
    @Expose
    private String customerUsername;
    
    @SerializedName("customerEmail")
    @Expose
    private String customerEmail;
    
    @SerializedName("billTo")
    @Expose
    private BillTo billTo;
    
    @SerializedName("shipTo")
    @Expose
    private ShipTo shipTo;
    
    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();
    
    @SerializedName("orderTotal")
    @Expose
    private Double orderTotal;
    
    @SerializedName("amountPaid")
    @Expose
    private Double amountPaid;
    
    @SerializedName("taxAmount")
    @Expose
    private String taxAmount;
    
    @SerializedName("shippingAmount")
    @Expose
    private String shippingAmount;
    
    @SerializedName("customerNotes")
    @Expose
    private String customerNotes;
    
    @SerializedName("internalNotes")
    @Expose
    private String internalNotes;
    
    @SerializedName("gift")
    @Expose
    private Boolean gift;
    
    @SerializedName("giftMessage")
    @Expose
    private String giftMessage;
    
    @SerializedName("paymentMethod")
    @Expose
    private String paymentMethod;
    
    @SerializedName("requestedShippingService")
    @Expose
    private String requestedShippingService;
    
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
    
    @SerializedName("shipDate")
    @Expose
    private String shipDate;
    
    @SerializedName("holdUntilDate")
    @Expose
    private String holdUntilDate;
    
    @SerializedName("weight")
    @Expose
    private Weight weight;
    
    @SerializedName("advancedOptions")
    @Expose
    private AdvancedOptions advancedOptions;
    
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 
     * @return
     *     The orderKey
     */
    public String getOrderKey() {
        return orderKey;
    }

    /**
     * 
     * @param orderKey
     *     The orderKey
     */
    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
    }

    /**
     * 
     * @return
     *     The orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * 
     * @param orderDate
     *     The orderDate
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
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

    /**
     * 
     * @return
     *     The paymentDate
     */
    public String getPaymentDate() {
        return paymentDate;
    }

    /**
     * 
     * @param paymentDate
     *     The paymentDate
     */
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * 
     * @return
     *     The shipByDate
     */
    public String getShipByDate() {
        return shipByDate;
    }

    /**
     * 
     * @param shipByDate
     *     The shipByDate
     */
    public void setShipByDate(String shipByDate) {
        this.shipByDate = shipByDate;
    }

    /**
     * 
     * @return
     *     The orderStatus
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 
     * @param orderStatus
     *     The orderStatus
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 
     * @return
     *     The customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 
     * @param customerId
     *     The customerId
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 
     * @return
     *     The customerUsername
     */
    public String getCustomerUsername() {
        return customerUsername;
    }

    /**
     * 
     * @param customerUsername
     *     The customerUsername
     */
    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    /**
     * 
     * @return
     *     The customerEmail
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * 
     * @param customerEmail
     *     The customerEmail
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    /**
     * 
     * @return
     *     The billTo
     */
    public BillTo getBillTo() {
        return billTo;
    }

    /**
     * 
     * @param billTo
     *     The billTo
     */
    public void setBillTo(BillTo billTo) {
        this.billTo = billTo;
    }

    /**
     * 
     * @return
     *     The shipTo
     */
    public ShipTo getShipTo() {
        return shipTo;
    }

    /**
     * 
     * @param shipTo
     *     The shipTo
     */
    public void setShipTo(ShipTo shipTo) {
        this.shipTo = shipTo;
    }

    /**
     * 
     * @return
     *     The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     * 
     * @return
     *     The orderTotal
     */
    public Double getOrderTotal() {
        return orderTotal;
    }

    /**
     * 
     * @param orderTotal
     *     The orderTotal
     */
    public void setOrderTotal(Double orderTotal) {
        this.orderTotal = orderTotal;
    }

    /**
     * 
     * @return
     *     The amountPaid
     */
    public Double getAmountPaid() {
        return amountPaid;
    }

    /**
     * 
     * @param amountPaid
     *     The amountPaid
     */
    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
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
     *     The customerNotes
     */
    public String getCustomerNotes() {
        return customerNotes;
    }

    /**
     * 
     * @param customerNotes
     *     The customerNotes
     */
    public void setCustomerNotes(String customerNotes) {
        this.customerNotes = customerNotes;
    }

    /**
     * 
     * @return
     *     The internalNotes
     */
    public String getInternalNotes() {
        return internalNotes;
    }

    /**
     * 
     * @param internalNotes
     *     The internalNotes
     */
    public void setInternalNotes(String internalNotes) {
        this.internalNotes = internalNotes;
    }

    /**
     * 
     * @return
     *     The gift
     */
    public Boolean getGift() {
        return gift;
    }

    /**
     * 
     * @param gift
     *     The gift
     */
    public void setGift(Boolean gift) {
        this.gift = gift;
    }

    /**
     * 
     * @return
     *     The giftMessage
     */
    public String getGiftMessage() {
        return giftMessage;
    }

    /**
     * 
     * @param giftMessage
     *     The giftMessage
     */
    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    /**
     * 
     * @return
     *     The paymentMethod
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 
     * @param paymentMethod
     *     The paymentMethod
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 
     * @return
     *     The requestedShippingService
     */
    public String getRequestedShippingService() {
        return requestedShippingService;
    }

    /**
     * 
     * @param requestedShippingService
     *     The requestedShippingService
     */
    public void setRequestedShippingService(String requestedShippingService) {
        this.requestedShippingService = requestedShippingService;
    }

    /**
     * 
     * @return
     *     The carrierCode
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * 
     * @param carrierCode
     *     The carrierCode
     */
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    /**
     * 
     * @return
     *     The serviceCode
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * 
     * @param serviceCode
     *     The serviceCode
     */
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    /**
     * 
     * @return
     *     The packageCode
     */
    public String getPackageCode() {
        return packageCode;
    }

    /**
     * 
     * @param packageCode
     *     The packageCode
     */
    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode;
    }

    /**
     * 
     * @return
     *     The confirmation
     */
    public String getConfirmation() {
        return confirmation;
    }

    /**
     * 
     * @param confirmation
     *     The confirmation
     */
    public void setConfirmation(String confirmation) {
        this.confirmation = confirmation;
    }

    /**
     * 
     * @return
     *     The shipDate
     */
    public String getShipDate() {
        return shipDate;
    }

    /**
     * 
     * @param shipDate
     *     The shipDate
     */
    public void setShipDate(String shipDate) {
        this.shipDate = shipDate;
    }

    /**
     * 
     * @return
     *     The holdUntilDate
     */
    public String getHoldUntilDate() {
        return holdUntilDate;
    }

    /**
     * 
     * @param holdUntilDate
     *     The holdUntilDate
     */
    public void setHoldUntilDate(String holdUntilDate) {
        this.holdUntilDate = holdUntilDate;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Weight getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Weight weight) {
        this.weight = weight;
    }

    public AdvancedOptions getAdvancedOptions() {
    	return advancedOptions == null ? new AdvancedOptions() : advancedOptions;
	}

	public void setAdvancedOptions(AdvancedOptions advancedOptions) {
		this.advancedOptions = advancedOptions;
	}
}
