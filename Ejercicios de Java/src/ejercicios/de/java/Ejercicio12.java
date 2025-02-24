package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio12 {

    public Ejercicio12() {
    }

    void Ejecutar() {
        System.out.println("\nBienvenido a la tienda en línea");
        ProcesarCompra();
    }

    public void ProcesarCompra() {
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0;
        int opcion;

        do {
            double precio = TomarPrecio();
            int cantidad = TomarCantidad();
            totalCompra += precio * cantidad;

            System.out.println("\nSubtotal actual: $" + totalCompra);
            System.out.println("\n¿Desea agregar otro producto?");
            System.out.println("1 - Sí");
            System.out.println("2 - No");
            opcion = scanner.nextInt();

        } while (opcion == 1);

        MostrarTotal(totalCompra);
    }

    public double TomarPrecio() {
        Scanner scanner = new Scanner(System.in);
        double precio;

        do {
            System.out.print("\nIngrese el precio del producto: ");
            precio = scanner.nextDouble();
            if (precio <= 0) {
                System.out.println("Error: El precio debe ser mayor a 0.");
            }
        } while (precio <= 0);

        return precio;
    }

    public int TomarCantidad() {
        Scanner scanner = new Scanner(System.in);
        int cantidad;

        do {
            System.out.print("Ingrese la cantidad deseada: ");
            cantidad = scanner.nextInt();
            if (cantidad <= 0) {
                System.out.println("Error: La cantidad debe ser mayor a 0.");
            }
        } while (cantidad <= 0);

        return cantidad;
    }

    public void MostrarTotal(double total) {
        System.out.println("\nTotal de la compra: $" + total);
        System.out.println("Gracias por su compra!");
    }
}
