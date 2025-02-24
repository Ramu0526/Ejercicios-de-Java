package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio19 {

    public Ejercicio19() {
    }

    void Ejecutar() {
        System.out.println("\nSistema de Sensor de Temperatura");
        SensorTemperatura();
    }

    public void SensorTemperatura() {
        Scanner scanner = new Scanner(System.in);
        double temperatura;

        do {
            System.out.print("\nIngrese la temperatura actual en °C: ");
            temperatura = scanner.nextDouble();

            if (temperatura < 18) {
                System.out.println("Alerta: Temperatura demasiado baja. Ajuste necesario.");
            } else if (temperatura > 25) {
                System.out.println("Alerta: Temperatura demasiado alta. Ajuste necesario.");
            } else {
                System.out.println("Temperatura dentro del rango aceptable.");
            }

        } while (temperatura < 18 || temperatura > 25);

        System.out.println("Sistema estable. Temperatura correcta.");
    }
}
