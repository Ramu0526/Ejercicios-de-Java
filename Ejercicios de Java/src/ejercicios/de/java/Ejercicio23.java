package ejercicios.de.java;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Ejercicio23 {

    public Ejercicio23() {
    }

    void Ejecutar() {
        System.out.println("\nRegistro de Vehículos en el Parqueadero");
        RegistrarVehiculos();
    }

    public void RegistrarVehiculos() {
        Scanner scanner = new Scanner(System.in);
        String resumenVehiculos = "";
        int numVehiculos;

        System.out.print("\nIngrese el número de vehículos a registrar: ");
        numVehiculos = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= numVehiculos; i++) {
            System.out.print("\nIngrese la placa del vehículo " + i + ": ");
            String placa = scanner.nextLine();

            String horaIngreso = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            resumenVehiculos += "Vehículo " + i + " - Placa: " + placa + " - Hora de Ingreso: " + horaIngreso + "\n";
        }

        if (!resumenVehiculos.isEmpty()) {
            System.out.println("\nResumen de Vehículos Registrados:");
            System.out.println(resumenVehiculos);
        } else {
            System.out.println("\nNo se registraron vehículos.");
        }
    }
}
