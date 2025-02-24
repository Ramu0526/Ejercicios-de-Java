package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio11 {

    private double saldoDisponible = 500000; // Saldo inicial en la cuenta

    public Ejercicio11() {
    }

    void Ejecutar() {
        System.out.println("\n Bienvenido al Cajero Automático ");
        System.out.println("Saldo disponible: $" + saldoDisponible);
        System.out.println("");

        double montoRetiro = TomarMonto();
        ProcesarRetiro(montoRetiro);
    }

    public double TomarMonto() {
        Scanner scanner = new Scanner(System.in);
        double monto;
        
        do {
            System.out.print("Ingrese el monto que desea retirar: ");
            monto = scanner.nextDouble();

            if (monto <= 0) {
                System.out.println("Error: El monto debe ser mayor a 0.");
            }
        } while (monto <= 0);

        return monto;
    }

    public void ProcesarRetiro(double monto) {
        switch (monto <= saldoDisponible ? 1 : 2) {
            case 1:
                saldoDisponible -= monto;
                MostrarSaldo(monto, saldoDisponible);
                break;
            case 2:
                System.out.println("Error: Saldo insuficiente. No se puede retirar $" + monto);
                break;
        }
    }

    public void MostrarSaldo(double monto, double saldoRestante) {
        System.out.println("\nRetiro exitoso: $" + monto);
        System.out.println("Saldo restante: $" + saldoRestante);
    }
}
