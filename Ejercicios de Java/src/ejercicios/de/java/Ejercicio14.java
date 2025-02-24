package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio14 {

    public Ejercicio14() {
    }

    void Ejecutar() {
        System.out.println("\nBienvenido al simulador de viajes en coche");
        ProcesarViaje();
    }

    public void ProcesarViaje() {
        Scanner scanner = new Scanner(System.in);
        double distancia, velocidad, tiempo;

        do {
            distancia = TomarDistancia();
            velocidad = TomarVelocidad();
            tiempo = distancia / velocidad;

            System.out.printf("\nEl tiempo estimado de viaje es: %.2f horas.\n", tiempo);

            System.out.println("\n¿Desea simular otro viaje?");
            System.out.println("1 - Sí");
            System.out.println("2 - No");
        } while (scanner.nextInt() == 1);

        System.out.println("\nGracias por usar el simulador de viajes!");
    }

    public double TomarDistancia() {
        Scanner scanner = new Scanner(System.in);
        double distancia;

        do {
            System.out.print("\nIngrese la distancia total del viaje en km: ");
            distancia = scanner.nextDouble();
            if (distancia <= 0) {
                System.out.println("Error: La distancia debe ser mayor a 0.");
            }
        } while (distancia <= 0);

        return distancia;
    }

    public double TomarVelocidad() {
        Scanner scanner = new Scanner(System.in);
        double velocidad;

        do {
            System.out.print("\nIngrese la velocidad promedio del coche en km/h: ");
            velocidad = scanner.nextDouble();
            if (velocidad <= 0) {
                System.out.println("Error: La velocidad debe ser mayor a 0.");
            }
        } while (velocidad <= 0);

        return velocidad;
    }
}
