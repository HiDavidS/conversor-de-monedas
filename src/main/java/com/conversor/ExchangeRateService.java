package main.java.com.conversor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateService {

    private static final String API_KEY = "TU_API_KEY_AQUI"; // Colocar tu API key aquí
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    private final HttpClient client;

    public ExchangeRateService() {
        this.client = HttpClient.newHttpClient();
    }

    public double convertirMoneda(String base, String destino, double monto) throws IOException, InterruptedException {
        String url = BASE_URL + API_KEY + "/pair/" + base + "/" + destino;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        com.google.gson.JsonObject json = com.google.gson.JsonParser.parseString(response.body()).getAsJsonObject();
        double tasa = json.get("conversion_rate").getAsDouble();

        return monto * tasa;
    }

}

