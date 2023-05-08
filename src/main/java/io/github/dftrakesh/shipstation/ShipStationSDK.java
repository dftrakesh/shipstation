package io.github.dftrakesh.shipstation;

import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.AUTHORIZATION;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.MAX_ATTEMPTS;
import static io.github.dftrakesh.shipstation.constantcode.ConstantCodes.TIME_OUT_DURATION;

public class ShipStationSDK {

    protected HttpClient client;
    protected String authentication;

    public ShipStationSDK(String userName, String password) {
        client = HttpClient.newHttpClient();
        String authString = userName + ":" + password;
        byte[] authEncBytes = Base64.getEncoder().encode(authString.getBytes());
        this.authentication = new String(authEncBytes);
    }

    @SneakyThrows
    protected HttpRequest get(URI uri) {
        return HttpRequest.newBuilder(uri)
                .header(AUTHORIZATION, "Basic " + this.authentication)
                .GET()
                .build();
    }

    @SneakyThrows
    protected HttpRequest post(URI uri, final String jsonBody) {
        return HttpRequest.newBuilder(uri)
                .header(AUTHORIZATION, "Basic " + this.authentication)
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();
    }

    @SneakyThrows
    protected HttpRequest put(URI uri, final String jsonBody) {
        return HttpRequest.newBuilder(uri)
                .header(AUTHORIZATION, "Basic " + this.authentication)
                .PUT(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();
    }

    @SneakyThrows
    protected HttpRequest delete(URI uri) {
        return HttpRequest.newBuilder(uri)
                .header(AUTHORIZATION, "Basic " + this.authentication)
                .DELETE()
                .build();
    }

    @SneakyThrows
    protected URI addParameters(URI uri, HashMap<String, String> params) {
        String query = uri.getQuery();
        StringBuilder builder = new StringBuilder();
        if (query != null)
            builder.append(query);

        for (Map.Entry<String, String> entry : params.entrySet()) {
            String keyValueParam = entry.getKey() + "=" + entry.getValue();
            if (!builder.toString().isEmpty())
                builder.append("&");
            builder.append(keyValueParam);
        }
        return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), builder.toString(), uri.getFragment());
    }

    @SneakyThrows
    public <T> T getRequestWrapped(HttpRequest request, HttpResponse.BodyHandler<T> handler) {
        return client.sendAsync(request, handler)
                .thenComposeAsync(response -> tryResend(client, request, handler, response, 1))
                .get()
                .body();
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
}