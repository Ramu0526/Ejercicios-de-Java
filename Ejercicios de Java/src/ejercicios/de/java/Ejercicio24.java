package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio24 {

    public Ejercicio24() {
    }

    void Ejecutar() {
        System.out.println("\nBienvenido a la tienda virtual");
        TiendaVirtual();
    }

    public void TiendaVirtual() {
        Scanner scanner = new Scanner(System.in);
        String listaProductos = "";
        double totalCompra = 0;
        String continuar;

        do {
            System.out.print("\nIngrese el nombre del producto: ");
            String producto = scanner.nextLine();
            
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();

            totalCompra += precio;
            listaProductos += producto + " - $" + precio + "\n";

            System.out.print("¿Desea agregar otro producto? (si/no): ");
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("\nResumen de la compra:");
        System.out.println(listaProductos);
        System.out.println("Total a pagar: $" + totalCompra);
        System.out.println("¡Gracias por su compra!");
    }
}
