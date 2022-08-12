package io.github.dftrakesh.shipstation.orders;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class InsuranceOptions {

    @SerializedName("provider")
    @Expose
    private Object provider;
    @SerializedName("insureShipment")
    @Expose
    private Boolean insureShipment;
    @SerializedName("insuredValue")
    @Expose
    private Integer insuredValue;

    /**
     * 
     * @return
     *     The provider
     */
    public Object getProvider() {
        return provider;
    }

    /**
     * 
     * @param provider
     *     The provider
     */
    public void setProvider(Object provider) {
        this.provider = provider;
    }

    /**
     * 
     * @return
     *     The insureShipment
     */
    public Boolean getInsureShipment() {
        return insureShipment;
    }

    /**
     * 
     * @param insureShipment
     *     The insureShipment
     */
    public void setInsureShipment(Boolean insureShipment) {
        this.insureShipment = insureShipment;
    }

    /**
     * 
     * @return
     *     The insuredValue
     */
    public Integer getInsuredValue() {
        return insuredValue;
    }

    /**
     * 
     * @param insuredValue
     *     The insuredValue
     */
    public void setInsuredValue(Integer insuredValue) {
        this.insuredValue = insuredValue;
    }

}
