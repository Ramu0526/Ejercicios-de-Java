
package ejercicios.de.java;

import java.util.Scanner;

public class EjerciciosDeJava {

    public static void main(String[] args) {
    
        System.out.println("Bienvenido al sistema de los ejercicios de Ramu");
        System.out.println("");
        System.out.println("Ingresa el numero del ejercico que deseas revisar,");
        System.out.println("los ejercios disponibles son del 1 al 30");
        System.out.println("");
        Scanner TomaDatos = new Scanner(System.in);
        int opcion = TomaDatos.nextInt();
        
        if (opcion >= 0 && opcion <= 30){
        
            if (opcion == 1) {Ejercicio1 obj = new Ejercicio1();}
            if (opcion == 2) {Ejercicio2 obj = new Ejercicio2();}
            System.out.println("");
        }
    }   
}
