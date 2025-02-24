package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio22 {

    public Ejercicio22() {
    }

    void Ejecutar() {
        System.out.println("\nRegistro de Ventas");
        RegistrarVentas();
    }

    public void RegistrarVentas() {
        Scanner scanner = new Scanner(System.in);
        String resumenVentas = "";
        String producto, continuar;
        double precio, totalVentas = 0;

        do {
            System.out.print("\nIngrese el nombre del producto: ");
            producto = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            precio = scanner.nextDouble();
            scanner.nextLine(); 

            totalVentas += precio;
            resumenVentas += "Producto: " + producto + " - Precio: $" + precio + "\n";

            System.out.print("¿Desea registrar otra venta? (si/no): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        if (!resumenVentas.isEmpty()) {
            System.out.println("\nResumen de Ventas:");
            System.out.println(resumenVentas);
            System.out.println("Total de Ventas: $" + totalVentas);
        } else {
            System.out.println("\nNo se registraron ventas.");
        }
    }
}
