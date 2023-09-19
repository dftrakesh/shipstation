package io.github.dftrakesh.shipstation.model.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CreateWebhookRequest {

    @JsonProperty("targetUrl")
    private String target_url;

    private String event;

    @JsonProperty("store_id")
    private String storeId;

    @JsonProperty("friendly_name")
    private String friendlyName;
}
