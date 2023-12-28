package io.github.dftrakesh.shipstation.model.stores;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stores {
    private int storeId;
    private String storeName;
    private int marketplaceId;
    private String marketplaceName;
    private boolean active;
    private String companyName;
    private boolean autoRefresh;
}