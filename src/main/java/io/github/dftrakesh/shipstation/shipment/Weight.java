
package io.github.dftrakesh.shipstation.shipment;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Weight {

    @SerializedName("value")
    @Expose
    private Double value;
    @SerializedName("units")
    @Expose
    private String units;
    @SerializedName("WeightUnits")
    @Expose
    private Long weightUnits;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public Long getWeightUnits() {
        return weightUnits;
    }

    public void setWeightUnits(Long weightUnits) {
        this.weightUnits = weightUnits;
    }

}
