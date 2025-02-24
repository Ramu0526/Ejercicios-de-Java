package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio13 {

    private int papelDisponible = 100; // Capacidad inicial de la impresora

    public Ejercicio13() {
    }

    void Ejecutar() {
        System.out.println("\nBienvenido al sistema de impresión️");
        ProcesarImpresion();
    }

    public void ProcesarImpresion() {
        Scanner scanner = new Scanner(System.in);
        int paginasAImprimir;

        do {
            paginasAImprimir = TomarCantidad();
            
            if (paginasAImprimir <= papelDisponible) {
                papelDisponible -= paginasAImprimir;
                System.out.println("\nSe han impreso " + paginasAImprimir + " páginas.");
                System.out.println("Papel restante: " + papelDisponible);
            } else {
                System.out.println("\nError: No hay suficiente papel.");
                System.out.println("Papel disponible: " + papelDisponible);
            }

            if (papelDisponible > 0) {
                System.out.println("\n¿Desea imprimir más páginas?");
                System.out.println("1 - Sí");
                System.out.println("2 - No");
            }

        } while (papelDisponible > 0 && scanner.nextInt() == 1);

        MostrarEstadoFinal();
    }

    public int TomarCantidad() {
        Scanner scanner = new Scanner(System.in);
        int cantidad;

        do {
            System.out.print("\nIngrese la cantidad de páginas a imprimir: ");
            cantidad = scanner.nextInt();
            if (cantidad <= 0) {
                System.out.println("Error: La cantidad debe ser mayor a 0.");
            }
        } while (cantidad <= 0);

        return cantidad;
    }

    public void MostrarEstadoFinal() {
        if (papelDisponible == 0) {
            System.out.println("\nLa impresora se ha quedado sin papel.");
        }
        System.out.println("¡Gracias por usar el sistema de impresión!");
    }
}
