
package io.github.dftrakesh.shipstation.model.shipment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipmentResponse {

    private List<Shipment> shipments = null;
    private Long total;
    private Long page;
    private Long pages;
}
