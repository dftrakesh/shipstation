package io.github.dftrakesh.shipstation.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weight {

    private Double value;
    private String units;

    @JsonProperty("WeightUnits")
    private Double weightUnits;
}