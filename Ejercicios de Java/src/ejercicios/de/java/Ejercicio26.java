package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio26 {

    public Ejercicio26() {
    }

    void Ejecutar() {
        System.out.println("\nBienvenido al sumador de números");
        SumarNumeros();
    }

    public void SumarNumeros() {
        Scanner scanner = new Scanner(System.in);
        double sumaTotal = 0;
        String continuar;

        do {
            System.out.print("\nIngrese un número: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Entrada no válida. Ingrese un número: ");
                scanner.next();
            }
            double numero = scanner.nextDouble();
            scanner.nextLine();

            sumaTotal += numero;

            System.out.print("¿Desea ingresar otro número? (si/no): ");
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("\nLa suma total de los números ingresados es: " + sumaTotal);
    }
}
