package io.github.dftrakesh.shipstation.model.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvancedOptions {

    private Integer warehouseId;
    private Boolean nonMachinable;
    private Boolean saturdayDelivery;
    private Boolean containsAlcohol;
    private Boolean mergedOrSplit;
    private List<Integer> mergedIds;
    private String parentId;
    private Integer storeId;
    private String customField1;
    private String customField2;
    private String customField3;
    private String source;
    private String billToParty;
    private String billToAccount;
    private String billToPostalCode;
    private String billToCountryCode;
    private String billToMyOtherAccount;
}