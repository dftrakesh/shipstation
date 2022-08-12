
package io.github.dftrakesh.shipstation.shipment;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class InsuranceOptions {

    @SerializedName("provider")
    @Expose
    private Object provider;
    @SerializedName("insureShipment")
    @Expose
    private Boolean insureShipment;
    @SerializedName("insuredValue")
    @Expose
    private Double insuredValue;

    public Object getProvider() {
        return provider;
    }

    public void setProvider(Object provider) {
        this.provider = provider;
    }

    public Boolean getInsureShipment() {
        return insureShipment;
    }

    public void setInsureShipment(Boolean insureShipment) {
        this.insureShipment = insureShipment;
    }

    public Double getInsuredValue() {
        return insuredValue;
    }

    public void setInsuredValue(Double insuredValue) {
        this.insuredValue = insuredValue;
    }

}
