package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio10 {

    public Ejercicio10() {
    }

    void Ejecutar() {
        System.out.println("\nBienvenido al menú del restaurante.");
        System.out.println("Seleccione los platos y bebidas que desea pedir.\n");

        double total = TomarPedido();
        String metodoPago = TomarMetodoPago();
        double totalConDescuento = AplicarDescuento(total, metodoPago);

        MostrarCuenta(total, totalConDescuento, metodoPago);
    }

    public static double TomarPedido() {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Hamburguesa - $15.000");
            System.out.println("2. Pizza - $20.000");
            System.out.println("3. Ensalada - $12.000");
            System.out.println("4. Jugo natural - $5.000");
            System.out.println("5. Refresco - $4.000");
            System.out.println("6. Terminar pedido");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    total += 15000;
                    break;
                case 2:
                    total += 20000;
                    break;
                case 3:
                    total += 12000;
                    break;
                case 4:
                    total += 5000;
                    break;
                case 5:
                    total += 4000;
                    break;
                case 6:
                    System.out.println("Pedido finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida, intenta nuevamente.");
            }
        } while (opcion != 6);

        return total;
    }

    public static String TomarMetodoPago() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMétodos de pago disponibles:");
        System.out.println("1. Efectivo (10% de descuento)");
        System.out.println("2. Tarjeta de crédito (5% de descuento)");
        System.out.println("3. Cheque (sin descuento)");
        System.out.print("Seleccione su método de pago: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                return "Efectivo";
            case 2:
                return "Tarjeta de Crédito";
            case 3:
                return "Cheque";
            default:
                System.out.println("Opción inválida, seleccionando Cheque por defecto.");
                return "Cheque";
        }
    }

    public static double AplicarDescuento(double total, String metodoPago) {
        switch (metodoPago) {
            case "Efectivo":
                return total * 0.90; // 10% de descuento
            case "Tarjeta de Crédito":
                return total * 0.95; // 5% de descuento
            default:
                return total; // Sin descuento
        }
    }

    public static void MostrarCuenta(double total, double totalConDescuento, String metodoPago) {
        System.out.println("\nResumen de la cuenta:");
        System.out.println("Total sin descuento: $" + total);
        System.out.println("Método de pago: " + metodoPago);
        System.out.println("Total con descuento: $" + totalConDescuento);
    }
}
