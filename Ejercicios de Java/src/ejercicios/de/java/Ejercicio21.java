package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio21 {

    public Ejercicio21() {
    }

    void Ejecutar() {
        System.out.println("\nSistema de Gestión de Tareas");
        GestionarTareas();
    }

    public void GestionarTareas() {
        Scanner scanner = new Scanner(System.in);
        String tareas = "";
        String descripcion, fechaVencimiento, continuar;

        do {
            System.out.print("\nIngrese la descripción de la tarea: ");
            descripcion = scanner.nextLine();

            System.out.print("Ingrese la fecha de vencimiento (dd/mm/aaaa): ");
            fechaVencimiento = scanner.nextLine();

            tareas += "Tarea: " + descripcion + " - Fecha de vencimiento: " + fechaVencimiento + "\n";

            System.out.print("¿Desea agregar otra tarea? (si/no): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        if (!tareas.isEmpty()) {
            System.out.println("\nLista de tareas registradas:");
            System.out.println(tareas);
        } else {
            System.out.println("\nNo se registraron tareas.");
        }
    }
}
