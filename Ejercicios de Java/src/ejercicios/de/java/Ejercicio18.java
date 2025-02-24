package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio18 {

    public Ejercicio18() {
    }

    void Ejecutar() {
        System.out.println("\n¡Bienvenido al menú de comidas rápidas!");
        MenuComidasRapidas();
    }

    public void MenuComidasRapidas() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double total = 0;

        do {
            System.out.println("\nMenú de Comidas Rápidas:");
            System.out.println("1️ Hamburguesa - $10.000");
            System.out.println("2️ Perro Caliente - $8.000");
            System.out.println("3️ Pizza - $12.000");
            System.out.println("4️ Papas Fritas - $5.000");
            System.out.println("5️ Bebida - $3.000");
            System.out.println("0️ Finalizar pedido");
            System.out.print("\n Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    total += 10000;
                    System.out.println("Agregaste una Hamburguesa.");
                    break;
                case 2:
                    total += 8000;
                    System.out.println("Agregaste un Perro Caliente.");
                    break;
                case 3:
                    total += 12000;
                    System.out.println("Agregaste una Pizza.");
                    break;
                case 4:
                    total += 5000;
                    System.out.println("Agregaste Papas Fritas.");
                    break;
                case 5:
                    total += 3000;
                    System.out.println("Agregaste una Bebida.");
                    break;
                case 0:
                    System.out.println("Finalizando pedido...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

        } while (opcion != 0);

        System.out.println("\nTotal a pagar: $" + total);
        System.out.println("¡Gracias por tu compra! Vuelve pronto.");
    }
}
