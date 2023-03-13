package io.github.dftrakesh.shipstation.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InternationalOptions {

    private String contents;
    private CustomsItems customsItems;
    private String nonDelivery;
}