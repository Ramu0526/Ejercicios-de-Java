package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio27 {

    public Ejercicio27() {
    }

    void Ejecutar() {
        System.out.println("\nBienvenido al sistema de ventas");
        RegistrarVentas();
    }

    public void RegistrarVentas() {
        Scanner scanner = new Scanner(System.in);
        double totalVentas = 0;
        String resumenVentas = "";
        String continuar;

        do {
            System.out.print("\nIngrese el nombre del producto: ");
            String producto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Entrada no válida. Ingrese un precio válido: ");
                scanner.next();
            }
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad vendida: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada no válida. Ingrese una cantidad válida: ");
                scanner.next();
            }
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            double subtotal = precio * cantidad;
            totalVentas += subtotal;
            resumenVentas += producto + " - Cantidad: " + cantidad + " - Total: $" + subtotal + "\n";

            System.out.print("¿Desea registrar otra venta? (si/no): ");
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("\nResumen de ventas:");
        System.out.println(resumenVentas);
        System.out.println("Total de ventas: $" + totalVentas);
    }
}
