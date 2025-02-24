package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio20 {

    public Ejercicio20() {
    }

    void Ejecutar() {
        System.out.println("\nSistema de Cálculo de Promedio de Exámenes");
        CalcularPromedio();
    }

    public void CalcularPromedio() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double suma = 0;
        double nota;
        String continuar;

        do {
            System.out.print("\nIngrese la nota del examen: ");
            nota = scanner.nextDouble();
            suma += nota;
            contador++;

            System.out.print("¿Desea ingresar otra nota? (si/no): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("si"));

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("\nPromedio de notas: " + promedio);

            if (promedio >= 3.0) {
                System.out.println("Estado: Aprobado");
            } else {
                System.out.println("Estado: Reprobado");
            }
        } else {
            System.out.println("\nNo se ingresaron notas.");
        }
    }
}
