
package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio3 {
 
    public Ejercicio3(){
    }   
    
    void Ejecutar() {
        System.out.println(" ");
        System.out.println("Crea un programa que simule un sensor de temperatura ambiente. El usuario ingresa la temperatura actual");
        System.out.println("y el programa verifica si la temperatura esta dentro de un rango aceptable (por ejemplo, entre 18°C y 25°C).");
        System.out.println("Si esta dentro del rango, muestra un mensaje indicando que la temperatura es adecuada.");
        System.out.println("Si no, muestra un mensaje de que la temperatura esta fuera del rango deseado.");
        System.out.println(" ");
        TomarDatos();
    }
    
    public static void TomarDatos(){ 
        System.out.println("Este es un sensor de temperatura ambiente actual (18-25 grados).");
        System.out.println("Ingresa la temperatura actaul");
        Scanner scanner = new Scanner(System.in);
        int Temperatura = scanner.nextInt();
        System.out.println("La temperatura registrada fue: " + Temperatura);
        System.out.println(" ");
        
        ProcesarDatos(Temperatura);
    }
    
    public static void ProcesarDatos(int Temperatura){
        if (Temperatura >= 18 && Temperatura <= 25 ){
            System.out.println("La temperatura: " + Temperatura + ", esta en el rango permitido");
            System.out.println("");
            
            DarResultados(Temperatura);
        }
        else{
            System.out.println("ERROR, temperatura fuera del rango normal");
            System.out.println("");
        }
    }
    
    public static void DarResultados(int Temperatura){
        System.out.println("Felicidades por tener una temperatura adecuada, temperatura registrada de: " + Temperatura + " grados");
        System.out.println("");
    }
    
}
