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
            System.out.println("los ejercicios disponibles son del 1 al 30");
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
                    case 11:
                        Ejercicio11 obj11 = new Ejercicio11();
                        obj11.Ejecutar();
                        break;
                    case 12:
                        Ejercicio12 obj12 = new Ejercicio12();
                        obj12.Ejecutar();
                        break;
                    case 13:
                        Ejercicio13 obj13 = new Ejercicio13();
                        obj13.Ejecutar();
                        break;
                    case 14:
                        Ejercicio14 obj14 = new Ejercicio14();
                        obj14.Ejecutar();
                        break;
                    case 15:
                        Ejercicio15 obj15 = new Ejercicio15();
                        obj15.Ejecutar();
                        break;
                    case 16:
                        Ejercicio16 obj16 = new Ejercicio16();
                        obj16.Ejecutar();
                        break;
                    case 17:
                        Ejercicio17 obj17 = new Ejercicio17();
                        obj17.Ejecutar();
                        break;
                    case 18:
                        Ejercicio18 obj18 = new Ejercicio18();
                        obj18.Ejecutar();
                        break;
                    case 19:
                        Ejercicio19 obj19 = new Ejercicio19();
                        obj19.Ejecutar();
                        break;
                    case 20:
                        Ejercicio20 obj20 = new Ejercicio20();
                        obj20.Ejecutar();
                        break;
                    case 21:
                        Ejercicio21 obj21 = new Ejercicio21();
                        obj21.Ejecutar();
                        break;
                    case 22:
                        Ejercicio22 obj22 = new Ejercicio22();
                        obj22.Ejecutar();
                        break;
                    case 23:
                        Ejercicio23 obj23 = new Ejercicio23();
                        obj23.Ejecutar();
                        break;
                    case 24:
                        Ejercicio24 obj24 = new Ejercicio24();
                        obj24.Ejecutar();
                        break;
                    case 25:
                        Ejercicio25 obj25 = new Ejercicio25();
                        obj25.Ejecutar();
                        break;
                    case 26:
                        Ejercicio26 obj26 = new Ejercicio26();
                        obj26.Ejecutar();
                        break;
                    case 27:
                        Ejercicio27 obj27 = new Ejercicio27();
                        obj27.Ejecutar();
                        break;
                    case 28:
                        Ejercicio28 obj28 = new Ejercicio28();
                        obj28.Ejecutar();
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
