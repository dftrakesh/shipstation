package io.github.dftrakesh.shipstation.stores;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusMapping {

    @SerializedName("orderStatus")
    @Expose
    private String orderStatus;
    @SerializedName("statusKey")
    @Expose
    private String statusKey;

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getStatusKey() {
        return statusKey;
    }

    public void setStatusKey(String statusKey) {
        this.statusKey = statusKey;
    }

}
