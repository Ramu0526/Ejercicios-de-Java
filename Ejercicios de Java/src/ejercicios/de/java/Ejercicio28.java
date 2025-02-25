package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio28 {

    public Ejercicio28() {
    }

    void Ejecutar() {
        System.out.println("\nGeneración de Factura");
        CrearFactura();
    }

    public void CrearFactura() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIngrese el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese el tipo de cliente (A, B, C, etc.): ");
        char tipoCliente = scanner.next().charAt(0);
        scanner.nextLine(); 

        System.out.print("Ingrese el nombre del producto: ");
        String producto = scanner.nextLine();

        System.out.print("Ingrese la cantidad de productos: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada no válida. Ingrese una cantidad válida: ");
            scanner.next();
        }
        int cantidad = scanner.nextInt();

        System.out.print("Ingrese el precio unitario: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada no válida. Ingrese un precio válido: ");
            scanner.next();
        }
        double precioUnitario = scanner.nextDouble();

        System.out.print("¿El cliente es estudiante? (si/no): ");
        scanner.nextLine();
        String esEstudiante = scanner.nextLine().toLowerCase();

        // Cálculos
        double subtotal = cantidad * precioUnitario;
        double impuesto = esEstudiante.equals("si") ? subtotal * 0.05 : subtotal * 0.13;
        double total = subtotal + impuesto;

        // Mostrar factura
        System.out.println("\n===== FACTURA =====");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Tipo de Cliente: " + tipoCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Total a Pagar: $" + total);
        System.out.println("===================");
    }
}
