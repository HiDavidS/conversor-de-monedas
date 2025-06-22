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

                String base = "";
                String destino = "";

                switch (opcion) {
                    case 1 -> {
                        base = "USD";
                        destino = "ARS";
                    }
                    case 2 -> {
                        base = "ARS";
                        destino = "USD";
                    }
                    case 3 -> {
                        base = "USD";
                        destino = "JPY";
                    }
                    case 4 -> {
                        base = "JPY";
                        destino = "USD";
                    }
                    case 5 -> {
                        base = "USD";
                        destino = "KRW";
                    }
                    case 6 -> {
                        base = "KRW";
                        destino = "USD";
                    }
                }

                try {
                    double resultado = service.convertirMoneda(base, destino, monto);
                    System.out.println("El monto de " + monto + " " + base + " corresponde a " + resultado + " " + destino);
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
