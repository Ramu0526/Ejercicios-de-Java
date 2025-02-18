
package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio2 {

    public Ejercicio2(){
    }   
    
    void Ejecutar() {
        System.out.println(" ");
        System.out.println("Desarrolla un programa que simule un ascensor que tiene un limite de peso.");
        System.out.println("El usuario ingresa peso y el piso al que desea ir. El programa debe verificar si el peso está dentro del limite permitido.");
        System.out.println("Si es asi, el ascensor se mueve al piso deseado. Si no, muestra un mensaje de que el ascensor esta sobrecargado.");
        System.out.println(" ");
        TomarDatos();
    }
    
    public static void TomarDatos(){ 
        System.out.println("Bienvenido señor usuario, si deseas subir al ascensor primero debemos verificar su peso,");
        System.out.println("y asi saber si esta apto para el ingreso de este mismo señor (0kg-160kg).");
        System.out.println(" ");
        Scanner PedirPeso = new Scanner(System.in);
        int Peso = PedirPeso.nextInt();
        System.out.println("El peso ingresado señor usuario es: " + Peso + "kg");
        System.out.println(" ");
        
        ProcesarDatos(Peso);
    }
    
    public static void ProcesarDatos(int Peso){
        if (Peso >= 0 && Peso <= 160){
            System.out.println("Felicidades señor su peso es apto para subir al ascensor.");
            System.out.println("Selecciona al piso que deseas ir (1-10)");
            Scanner PedirPiso = new Scanner(System.in);
            int Piso = PedirPiso.nextInt();
            System.out.println("Piso seleccionado: " + Piso);
            System.out.println(" ");
            
            DarResultados(Peso,Piso);
        }
        else{
            System.out.println("El peso que ingresaste excede lo permitido, lo siento señor");
            System.out.println(" ");
        }
    }
    
    public static void DarResultados(int Peso, int Piso){
        if (Piso >= 1 && Piso <= 10){
            System.out.println("Felicidades señor por ser apto con un peso de " + Peso + "kg, comenzando a subir al piso " + Piso);
        }
        else{
            System.out.println("El peso que ingresaste excede lo permitido, lo siento señor");
            System.out.println("Piso invalido, no existe");
        }
    }
    
}

