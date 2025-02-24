package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio6 {

    public Ejercicio6() {
    }

    void Ejecutar() {
        System.out.println("\nEn una tienda se venden tres tipos de productos: \"A\" (alimentos), \"V\" (vestimenta) y \"E\" (electrónicos).");
        System.out.println("Cada producto tiene un precio base diferente. Si el cliente compra productos de tipo \"A\", obtiene un 10% de descuento.");
        System.out.println("Si compra productos de tipo \"V\", obtiene un 5% de descuento. Si compra productos de tipo \"E\", no hay descuento.");
        System.out.println("Finalmente, muestra el costo total de la compra con el descuento aplicado y el costo sin descuento.\n");
        
        TomarDatos();
    }

    public static void TomarDatos() {
        System.out.println("Bienvenido a la tienda RamuStore.");
        System.out.println("Categorías disponibles:");
        System.out.println("A - Alimento");
        System.out.println("V - Vestimenta");
        System.out.println("E - Electrónico");
        
        System.out.print("Seleccione la categoría (A, V o E): ");
        Scanner scanner = new Scanner(System.in);
        String categoria = scanner.nextLine().toUpperCase();
        
        ProcesarDatos(categoria);
    }

    public static void ProcesarDatos(String categoria) {
        Scanner scanner = new Scanner(System.in);
        double precioUnitario = 0;
        double descuento = 0;
        
        switch (categoria) {
            case "A":
                precioUnitario = 3000;
                descuento = 0.10;
                break;
            case "V":
                precioUnitario = 2500;
                descuento = 0.05;
                break;
            case "E":
                precioUnitario = 2500;
                descuento = 0;
                break;
            default:
                System.out.println("Error: Opción inválida.");
                return;
        }

        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser un número positivo.");
            return;
        }

        double precioSinDesc = cantidad * precioUnitario;
        double precioConDesc = precioSinDesc * (1 - descuento);

        DarResultados(precioConDesc, precioSinDesc);
    }

    public static void DarResultados(double precioCon, double precioSin) {
        System.out.println("\nEl precio sin descuento es: " + precioSin);
        System.out.println("El precio con descuento es: " + precioCon);
    }

}
