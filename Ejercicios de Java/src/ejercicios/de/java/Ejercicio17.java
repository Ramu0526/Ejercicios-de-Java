package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio17 {

    public Ejercicio17() {
    }

    void Ejecutar() {
        System.out.println("\n¡Bienvenido al registro de la biblioteca!");
        RegistrarLibros();
    }

    public void RegistrarLibros() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder listaLibros = new StringBuilder();
        String continuar;

        do {
            System.out.print("\nIngresa el título del libro: ");
            String titulo = scanner.nextLine();

            System.out.print("Ingresa el autor del libro: ");
            String autor = scanner.nextLine();

            System.out.print("Ingresa el número de páginas: ");
            int paginas = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            listaLibros.append("\nLibro: ").append(titulo)
                        .append("\nAutor: ").append(autor)
                        .append("\nPáginas: ").append(paginas)
                        .append("\n----------------------------");

            System.out.print("\n¿Deseas registrar otro libro? (si/no): ");
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar.equals("si"));

        System.out.println("\nLista de libros registrados:");
        System.out.println(listaLibros.toString());
    }
}
