package ejercicios.de.java;

import java.util.Scanner;

public class EjerciciosDeJava {

    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de los ejercicios de Ramu");
        System.out.println("");
        Scanner tomaDatos = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingresa el numero del ejercico que deseas revisar,");
            System.out.println("los ejercios disponibles son del 1 al 30");
            System.out.println("Si deseas finalizar ingresa el numero 0");
            System.out.println("");
            opcion = tomaDatos.nextInt();

            if (opcion >= 1 && opcion <= 30) {
                switch (opcion) {
                    case 1:
                        Ejercicio1 obj1 = new Ejercicio1();
                        obj1.Ejecutar();
                        break;
                    case 2:
                        Ejercicio2 obj2 = new Ejercicio2();
                        obj2.Ejecutar();
                        break;
                    case 3:
                        Ejercicio3 obj3 = new Ejercicio3();
                        obj3.Ejecutar();
                        break;
                    case 4:
                        Ejercicio4 obj4 = new Ejercicio4();
                        obj4.Ejecutar();
                        break;
                    case 5:
                        Ejercicio5 obj5 = new Ejercicio5();
                        obj5.Ejecutar();
                        break;
                    case 6:
                        Ejercicio6 obj6 = new Ejercicio6();
                        obj6.Ejecutar();
                        break;
                    case 7:
                        Ejercicio7 obj7 = new Ejercicio7();
                        obj7.Ejecutar();
                        break;
                    case 8:
                        Ejercicio8 obj8 = new Ejercicio8();
                        obj8.Ejecutar();
                        break;
                    case 9:
                        Ejercicio9 obj9 = new Ejercicio9();
                        obj9.Ejecutar();
                        break;
                    case 10:
                        Ejercicio10 obj10 = new Ejercicio10();
                        obj10.Ejecutar();
                        break;
                        
                    default:
                        System.out.println("Ejercicio aun no implementado.");
                        break;
                }
            } else if (opcion != 0) {
                System.out.println("El numero ingresado no existe como ejercicio.");
                System.out.println("");
            }
        } while (opcion != 0);
        
        System.out.println("Finalizando");
        tomaDatos.close();
    }
}
