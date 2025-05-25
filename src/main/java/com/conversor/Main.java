package main.java.com.conversor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ExchangeRateService service = new ExchangeRateService();

        try {
            String json = service.getRates("USD");
            System.out.println(json); // Acá deberías ver el JSON crudo en consola
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
