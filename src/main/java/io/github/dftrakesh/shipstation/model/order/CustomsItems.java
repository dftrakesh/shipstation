package io.github.dftrakesh.shipstation.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomsItems {

    private String customsItemId;
    private String description;
    private Integer quantity;
    private Integer values;
    private String harmonizedTariffCode;
    private String countryOfOrigin;
}