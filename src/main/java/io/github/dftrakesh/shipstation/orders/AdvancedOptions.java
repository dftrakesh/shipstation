package io.github.dftrakesh.shipstation.orders;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class AdvancedOptions {

    @SerializedName("warehouseId")
    @Expose
    private Integer warehouseId;
    @SerializedName("nonMachinable")
    @Expose
    private Boolean nonMachinable;
    @SerializedName("saturdayDelivery")
    @Expose
    private Boolean saturdayDelivery;
    @SerializedName("containsAlcohol")
    @Expose
    private Boolean containsAlcohol;
    @SerializedName("mergedOrSplit")
    @Expose
    private Boolean mergedOrSplit;
    @SerializedName("mergedIds")
    @Expose
    private List<String> mergedIds = new ArrayList<String>();
    @SerializedName("parentId")
    @Expose
    private String parentId;
    @SerializedName("storeId")
    @Expose
    private Integer storeId;
    @SerializedName("customField1")
    @Expose
    private String customField1;
    @SerializedName("customField2")
    @Expose
    private String customField2;
    @SerializedName("customField3")
    @Expose
    private String customField3;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("billToParty")
    @Expose
    private String billToParty;
    @SerializedName("billToAccount")
    @Expose
    private String billToAccount;
    @SerializedName("billToPostalCode")
    @Expose
    private String billToPostalCode;
    @SerializedName("billToCountryCode")
    @Expose
    private String billToCountryCode;
    @SerializedName("billToMyOtherAccount")
    @Expose
    private String billToMyOtherAccount;

    /**
     * 
     * @return
     *     The warehouseId
     */
    public Integer getWarehouseId() {
        return warehouseId;
    }

    /**
     * 
     * @param warehouseId
     *     The warehouseId
     */
    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    /**
     * 
     * @return
     *     The nonMachinable
     */
    public Boolean getNonMachinable() {
        return nonMachinable;
    }

    /**
     * 
     * @param nonMachinable
     *     The nonMachinable
     */
    public void setNonMachinable(Boolean nonMachinable) {
        this.nonMachinable = nonMachinable;
    }

    /**
     * 
     * @return
     *     The saturdayDelivery
     */
    public Boolean getSaturdayDelivery() {
        return saturdayDelivery;
    }

    /**
     * 
     * @param saturdayDelivery
     *     The saturdayDelivery
     */
    public void setSaturdayDelivery(Boolean saturdayDelivery) {
        this.saturdayDelivery = saturdayDelivery;
    }

    /**
     * 
     * @return
     *     The containsAlcohol
     */
    public Boolean getContainsAlcohol() {
        return containsAlcohol;
    }

    /**
     * 
     * @param containsAlcohol
     *     The containsAlcohol
     */
    public void setContainsAlcohol(Boolean containsAlcohol) {
        this.containsAlcohol = containsAlcohol;
    }

    /**
     * 
     * @return
     *     The mergedOrSplit
     */
    public Boolean getMergedOrSplit() {
        return mergedOrSplit;
    }

    /**
     * 
     * @param mergedOrSplit
     *     The mergedOrSplit
     */
    public void setMergedOrSplit(Boolean mergedOrSplit) {
        this.mergedOrSplit = mergedOrSplit;
    }

    /**
     * 
     * @return
     *     The mergedIds
     */
    public List<String> getMergedIds() {
        return mergedIds;
    }

    /**
     * 
     * @param mergedIds
     *     The mergedIds
     */
    public void setMergedIds(List<String> mergedIds) {
        this.mergedIds = mergedIds;
    }

    /**
     * 
     * @return
     *     The parentId
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 
     * @param parentId
     *     The parentId
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 
     * @return
     *     The storeId
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 
     * @param storeId
     *     The storeId
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 
     * @return
     *     The customField1
     */
    public String getCustomField1() {
        return customField1;
    }

    /**
     * 
     * @param customField1
     *     The customField1
     */
    public void setCustomField1(String customField1) {
        this.customField1 = customField1;
    }

    /**
     * 
     * @return
     *     The customField2
     */
    public String getCustomField2() {
        return customField2;
    }

    /**
     * 
     * @param customField2
     *     The customField2
     */
    public void setCustomField2(String customField2) {
        this.customField2 = customField2;
    }

    /**
     * 
     * @return
     *     The customField3
     */
    public String getCustomField3() {
        return customField3 != null ? customField3 : null;
    }

    /**
     * 
     * @param customField3
     *     The customField3
     */
    public void setCustomField3(String customField3) {
        this.customField3 = customField3;
    }

    /**
     * 
     * @return
     *     The source
     */
    public String getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The billToParty
     */
    public String getBillToParty() {
        return billToParty;
    }

    /**
     * 
     * @param billToParty
     *     The billToParty
     */
    public void setBillToParty(String billToParty) {
        this.billToParty = billToParty;
    }

    /**
     * 
     * @return
     *     The billToAccount
     */
    public String getBillToAccount() {
        return billToAccount;
    }

    /**
     * 
     * @param billToAccount
     *     The billToAccount
     */
    public void setBillToAccount(String billToAccount) {
        this.billToAccount = billToAccount;
    }

    /**
     * 
     * @return
     *     The billToPostalCode
     */
    public String getBillToPostalCode() {
        return billToPostalCode;
    }

    /**
     * 
     * @param billToPostalCode
     *     The billToPostalCode
     */
    public void setBillToPostalCode(String billToPostalCode) {
        this.billToPostalCode = billToPostalCode;
    }

    /**
     * 
     * @return
     *     The billToCountryCode
     */
    public String getBillToCountryCode() {
        return billToCountryCode;
    }

    /**
     * 
     * @param billToCountryCode
     *     The billToCountryCode
     */
    public void setBillToCountryCode(String billToCountryCode) {
        this.billToCountryCode = billToCountryCode;
    }

    /**
     * 
     * @return
     *     The billToMyOtherAccount
     */
    public String getBillToMyOtherAccount() {
        return billToMyOtherAccount;
    }

    /**
     * 
     * @param billToMyOtherAccount
     *     The billToMyOtherAccount
     */
    public void setBillToMyOtherAccount(String billToMyOtherAccount) {
        this.billToMyOtherAccount = billToMyOtherAccount;
    }

}
