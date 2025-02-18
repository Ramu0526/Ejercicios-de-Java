package ejercicios.de.java;

import java.util.Scanner;


public class Ejercicio1 {
    
    public Ejercicio1(){
    }   
    
    void Ejecutar() {
        System.out.println(" ");
        System.out.println("Escribe un programa que simule el funcionamiento de un ascensor. El usuario ingresa el piso al que desea ir,");
        System.out.println(" y el programa verifica si es un piso valido (usar un rango de numero). Si es valido,");
        System.out.println("el ascensor se mueve al piso deseado. Si no es valido, muestra un mensaje de error.");
        System.out.println(" ");
        
        TomarDatos();
    }
    
    public static void TomarDatos(){ 
        System.out.println("Ingresa al piso que deseas ir cliente (1-10): ");
        
        Scanner TomarResultados = new Scanner(System.in);
        int Numero = TomarResultados.nextInt();        
        System.out.println("Piso seleccionado: " + Numero);
        System.out.println("");
        
        ProcesarDatos(Numero);
    }
    
    public static void ProcesarDatos(int Numero){
        if (Numero >= 1 && Numero <= 10){
            System.out.println("Moviendose al piso: " + Numero);
            System.out.println("");
            
            DarResultados(Numero);
        }
        else{
            System.out.println("Piso invalido, no existe");
            System.out.println("");
        }
    }
    
    public static void DarResultados(int Numero){
        System.out.println("Has llegado al piso, " + Numero + " que tengas una buena hospedada");
        System.out.println("");
    }
    
    
}
