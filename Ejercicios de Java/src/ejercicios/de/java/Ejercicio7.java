package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio7 {

    public Ejercicio7() {
    }

    void Ejecutar() {
        System.out.println("\nBienvenido al asistente nutricional.");
        System.out.println("Este programa calculará su Índice de Masa Corporal (IMC) y le indicará su categoría.\n");
        
        double peso = TomarPeso();
        double altura = TomarAltura();
        double imc = CalcularIMC(peso, altura);
        String categoria = ClasificarIMC(imc);
        
        DarResultados(imc, categoria);
    }

    public static double TomarPeso() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su peso en kg: ");
        return scanner.nextDouble();
    }

    public static double TomarAltura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su altura en metros: ");
        return scanner.nextDouble();
    }

    public static double CalcularIMC(double peso, double altura) {
        return peso / (altura * altura);  
    }

    public static String ClasificarIMC(double imc) {
        int categoria = (imc < 18.5) ? 1 : (imc < 24.9) ? 2 : (imc < 29.9) ? 3 : 4;

        switch (categoria) {
            case 1:
                return "Bajo peso";
            case 2:
                return "Peso normal";
            case 3:
                return "Sobrepeso";
            case 4:
                return "Obesidad";
            default:
                return "Categoría desconocida";
        }
    }

    public static void DarResultados(double imc, String categoria) {
        System.out.printf("\nSu IMC es: %.2f\n", imc); 
        System.out.println("Clasificación: " + categoria);
    }
}
