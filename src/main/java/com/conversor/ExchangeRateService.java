package main.java.com.conversor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateService {

    private static final String API_KEY = "672f66dcdd0f2f24dd2ae410";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    private final HttpClient client;

    public ExchangeRateService() {
        this.client = HttpClient.newHttpClient();
    }

    public String getRates(String baseCurrency) throws IOException, InterruptedException {
        // Ejemplo de baseCurrency: "USD"
        String url = BASE_URL + API_KEY + "/latest/" + baseCurrency;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body(); // Devuelve el JSON como String
    }
}

