package io.github.dftrakesh.shipstation;

import io.github.dftrakesh.shipstation.handler.JsonBodyHandler;
import io.github.dftrakesh.shipstation.model.webhook.CreateWebhookRequest;
import io.github.dftrakesh.shipstation.model.webhook.CreateWebhookResponse;
import io.github.dftrakesh.shipstation.model.webhook.Webhooks;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.BASE_END_POINT;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.END_POINT_WEBHOOKS;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.END_POINT_WEBHOOKS_SUBSCRIBE;

public class WebhookAPI extends ShipStationSDK {

    public WebhookAPI(String userName, String password) {
        super(userName, password);
    }

    public Webhooks listWebhooks() {

        URI uri = URI.create(BASE_END_POINT + END_POINT_WEBHOOKS);
        HttpRequest request = get(uri);
        HttpResponse.BodyHandler<Webhooks> handler = new JsonBodyHandler<>(Webhooks.class);
        return getRequestWrapped(request, handler);
    }

    @SneakyThrows
    public void deleteWebhook(String webhookId) {
        URI uri = URI.create(BASE_END_POINT + END_POINT_WEBHOOKS + "/" + webhookId);
        client.send(delete(uri), HttpResponse.BodyHandlers.ofString());
    }

    public CreateWebhookResponse createWebhook(CreateWebhookRequest createWebhookRequest) {
        URI uri = URI.create(BASE_END_POINT + END_POINT_WEBHOOKS_SUBSCRIBE);
        HttpRequest request = post(uri, createWebhookRequest);
        HttpResponse.BodyHandler<CreateWebhookResponse> handler = new JsonBodyHandler<>(CreateWebhookResponse.class);
        return getRequestWrapped(request, handler);
    }
}