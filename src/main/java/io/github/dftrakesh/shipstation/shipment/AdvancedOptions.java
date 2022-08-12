
package io.github.dftrakesh.shipstation.shipment;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class AdvancedOptions {

    @SerializedName("billToParty")
    @Expose
    private Object billToParty;
    @SerializedName("billToAccount")
    @Expose
    private Object billToAccount;
    @SerializedName("billToPostalCode")
    @Expose
    private Object billToPostalCode;
    @SerializedName("billToCountryCode")
    @Expose
    private Object billToCountryCode;
    @SerializedName("storeId")
    @Expose
    private Long storeId;

    public Object getBillToParty() {
        return billToParty;
    }

    public void setBillToParty(Object billToParty) {
        this.billToParty = billToParty;
    }

    public Object getBillToAccount() {
        return billToAccount;
    }

    public void setBillToAccount(Object billToAccount) {
        this.billToAccount = billToAccount;
    }

    public Object getBillToPostalCode() {
        return billToPostalCode;
    }

    public void setBillToPostalCode(Object billToPostalCode) {
        this.billToPostalCode = billToPostalCode;
    }

    public Object getBillToCountryCode() {
        return billToCountryCode;
    }

    public void setBillToCountryCode(Object billToCountryCode) {
        this.billToCountryCode = billToCountryCode;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

}
