package ejercicios.de.java;

import java.util.Scanner;
import java.util.Random;

class Ejercicio16 {

    public Ejercicio16() {
    }

    void Ejecutar() {
        System.out.println("\nBienvenido al juego de adivinanza!");
        JugarAdivinanza();
    }

    public void JugarAdivinanza() {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        int intentos = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nHe elegido un número entre 1 y 100. ¡Intenta adivinarlo!");
        
        do {
            System.out.print("\nIngresa tu número: ");
            intento = scanner.nextInt();
            intentos++;

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor. Intenta de nuevo.");
            } else {
                System.out.println("\nFelicidades! Adivinaste el número " + numeroSecreto + " en " + intentos + " intentos.");
            }

        } while (intento != numeroSecreto);
    }
}
