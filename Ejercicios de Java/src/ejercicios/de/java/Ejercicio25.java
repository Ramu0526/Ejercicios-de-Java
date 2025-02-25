package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio25 {

    public Ejercicio25() {
    }

    void Ejecutar() {
        System.out.println("\nBienvenido a la agenda de contactos");
        AgendaContactos();
    }

    public void AgendaContactos() {
        Scanner scanner = new Scanner(System.in);
        String listaContactos = "";
        String continuar;

        do {
            System.out.print("\nIngrese el nombre del contacto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el número de teléfono: ");
            String telefono = scanner.nextLine();

            listaContactos += nombre + " - " + telefono + "\n";

            System.out.print("¿Desea agregar otro contacto? (si/no): ");
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("\nLista de contactos:");
        System.out.println(listaContactos);
        System.out.println("Agenda guardada correctamente.");
    }
}
