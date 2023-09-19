package io.github.dftrakesh.shipstation.model.webhook;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Webhook {

    @JsonProperty("IsLabelAPIHook")
    private String isLabelAPIHook;

    @JsonProperty("WebHookID")
    private String webHookID;

    @JsonProperty("SellerID")
    private String sellerID;

    @JsonProperty("StoreID")
    private String storeID;

    @JsonProperty("HookType")
    private String hookType;

    @JsonProperty("MessageFormat")
    private String messageFormat;

    @JsonProperty("Url")
    private String url;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("BulkCopyBatchID")
    private String bulkCopyBatchID;

    @JsonProperty("BulkCopyRecordID")
    private String bulkCopyRecordID;

    @JsonProperty("Active")
    private String active;

    @JsonProperty("Seller")
    private String seller;

    @JsonProperty("Store")
    private String store;
}
