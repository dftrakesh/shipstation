package io.github.dftrakesh.shipstation.orders;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class InternationalOptions {

    @SerializedName("contents")
    @Expose
    private Object contents;
    @SerializedName("customsItems")
    @Expose
    private Object customsItems;
    @SerializedName("nonDelivery")
    @Expose
    private Object nonDelivery;

    /**
     * 
     * @return
     *     The contents
     */
    public Object getContents() {
        return contents;
    }

    /**
     * 
     * @param contents
     *     The contents
     */
    public void setContents(Object contents) {
        this.contents = contents;
    }

    /**
     * 
     * @return
     *     The customsItems
     */
    public Object getCustomsItems() {
        return customsItems;
    }

    /**
     * 
     * @param customsItems
     *     The customsItems
     */
    public void setCustomsItems(Object customsItems) {
        this.customsItems = customsItems;
    }

    /**
     * 
     * @return
     *     The nonDelivery
     */
    public Object getNonDelivery() {
        return nonDelivery;
    }

    /**
     * 
     * @param nonDelivery
     *     The nonDelivery
     */
    public void setNonDelivery(Object nonDelivery) {
        this.nonDelivery = nonDelivery;
    }

}
