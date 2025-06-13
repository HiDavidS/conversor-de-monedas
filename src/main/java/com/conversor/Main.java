package main.java.com.conversor;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeRateService service = new ExchangeRateService();
        int opcion;

        do {
            System.out.println("=== Conversor de Monedas ===");
            System.out.println("1. Dólar (USD) → Peso argentino (ARS)");
            System.out.println("2. Peso argentino (ARS) → Dólar (USD)");
            System.out.println("3. Dólar (USD) → Yen japonés (JPY)");
            System.out.println("4. Yen japonés (JPY) → Dólar (USD)");
            System.out.println("5. Dólar (USD) → Won surcoreano (KRW)");
            System.out.println("6. Won surcoreano (KRW) → Dólar (USD)");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingrese el monto: ");
                double monto = scanner.nextDouble();

                try {
                    double resultado = switch (opcion) {
                        case 1 -> service.convertirMoneda("USD", "ARS", monto);
                        case 2 -> service.convertirMoneda("ARS", "USD", monto);
                        case 3 -> service.convertirMoneda("USD", "JPY", monto);
                        case 4 -> service.convertirMoneda("JPY", "USD", monto);
                        case 5 -> service.convertirMoneda("USD", "KRW", monto);
                        case 6 -> service.convertirMoneda("KRW", "USD", monto);
                        default -> 0.0;
                    };
                    //System.out.println(monto + " " + base + " equivalen a " + resultado + " " + destino);

                } catch (IOException | InterruptedException e) {
                    System.out.println("Error al convertir moneda.");
                    e.printStackTrace();
                }

                System.out.println();
            } else if (opcion != 7) {
                System.out.println("Opción inválida.");
            }

        } while (opcion != 7);

        System.out.println("Gracias por usar el conversor.");

    }
}