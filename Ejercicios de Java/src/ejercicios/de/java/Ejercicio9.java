package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio9 {
    private int puntos = 0;

    public Ejercicio9() {
    }

    void Ejecutar() {
        System.out.println("\nBienvenido al sistema de clasificación del campeonato deportivo.");
        System.out.println("Ingresa el resultado de tu equipo para actualizar la clasificación.\n");

        String resultado = TomarResultado();
        ActualizarPuntos(resultado);
        MostrarClasificacion();
    }

    public static String TomarResultado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el resultado del partido (Ganado, Perdido, Empatado): ");
        return scanner.nextLine().trim().toLowerCase();
    }

    public void ActualizarPuntos(String resultado) {
        switch (resultado) {
            case "ganado":
                puntos += 3;
                break;
            case "empatado":
                puntos += 1;
                break;
            case "perdido":
                // No suma puntos en caso de derrota.
                break;
            default:
                System.out.println("Resultado inválido. Intenta nuevamente.");
        }
    }

    public void MostrarClasificacion() {
        System.out.println("\nClasificación actual del equipo:");
        System.out.println("Puntos totales: " + puntos);
    }
}
