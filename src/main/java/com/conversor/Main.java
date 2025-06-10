package main.java.com.conversor;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExchangeRateService service = new ExchangeRateService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Conversor de Monedas ===");
        System.out.print("Ingrese el monto en USD: ");
        double monto = scanner.nextDouble();

        try {
            double resultado = service.convertirMoneda("USD", "ARS", monto);
            System.out.println(monto + " USD son " + resultado + " ARS");
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al convertir moneda.");
            e.printStackTrace();
        }
    }
}
