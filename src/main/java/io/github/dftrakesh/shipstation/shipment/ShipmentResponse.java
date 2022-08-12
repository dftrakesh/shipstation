
package io.github.dftrakesh.shipstation.shipment;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class ShipmentResponse {

    @SerializedName("shipments")
    @Expose
    private List<Shipment> shipments = null;
    @SerializedName("total")
    @Expose
    private Long total;
    @SerializedName("page")
    @Expose
    private Long page;
    @SerializedName("pages")
    @Expose
    private Long pages;

    public List<Shipment> getShipments() {
        return shipments;
    }

    public void setShipments(List<Shipment> shipments) {
        this.shipments = shipments;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

}
