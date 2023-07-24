package io.github.dftrakesh.shipstation.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class InternationalOptions {

    private String contents;
    private List<CustomsItems> customsItems;
    private String nonDelivery;
}