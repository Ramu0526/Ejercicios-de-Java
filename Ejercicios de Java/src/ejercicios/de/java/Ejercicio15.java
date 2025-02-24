package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio15 {

    public Ejercicio15() {
    }

    void Ejecutar() {
        System.out.println("\nBienvenido al simulador de cuenta regresiva");
        IniciarCuentaRegresiva();
    }

    public void IniciarCuentaRegresiva() {
        int numero = TomarNumero();
        System.out.println("\nIniciando cuenta regresiva");

        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 0);

        System.out.println("\nTiempo cumplido");
    }

    public int TomarNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("\nIngrese un número entero positivo para la cuenta regresiva: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Error: Debe ingresar un número mayor a 0.");
            }
        } while (numero <= 0);

        return numero;
    }
}
