package io.github.dftrakesh.shipstation;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.apache.http.client.utils.URIBuilder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.MAX_ATTEMPTS;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.TIME_OUT_DURATION;

public class ShipStationSDK {

    protected HttpClient client;

    public ShipStationSDK() {
        client = HttpClient.newHttpClient();
    }

    @SneakyThrows
    protected <T> T getRequestWrapped(HttpRequest request, Class<T> tClass) {

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                     .thenComposeAsync(response -> tryResend(client, request, HttpResponse.BodyHandlers.ofString(), response, 1))
                     .thenApplyAsync(HttpResponse::body)
                     .thenApplyAsync(responseBody -> convertBody(responseBody, tClass))
                     .get();
    }

    @SneakyThrows
    private <T> T convertBody(String body, Class<T> tClass) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(body, tClass);
    }

    @SneakyThrows
    public <T> CompletableFuture<HttpResponse<T>> tryResend(HttpClient client,
                                                            HttpRequest request,
                                                            HttpResponse.BodyHandler<T> handler,
                                                            HttpResponse<T> resp, int count) {
        if (resp.statusCode() == 409 && count < MAX_ATTEMPTS) {
            Thread.sleep(TIME_OUT_DURATION);
            return client.sendAsync(request, handler)
                         .thenComposeAsync(response -> tryResend(client, request, handler, response, count + 1));
        }
        return CompletableFuture.completedFuture(resp);
    }

    protected void addParameters(URIBuilder uriBuilder, HashMap<String, String> params) {
        if (params == null || params.isEmpty()) return;
        for (String key : params.keySet()) {
            uriBuilder.addParameter(key, params.get(key));
        }
    }
}