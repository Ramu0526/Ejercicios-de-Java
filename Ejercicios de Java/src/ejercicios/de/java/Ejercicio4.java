
package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio4 {

    public Ejercicio4(){
    }   
    
    void Ejecutar() {
        System.out.println(" ");
        System.out.println("Escribe un programa que simule un sensor de temperatura ambiente y un umbral de alerta.");
        System.out.println("El usuario ingresa la temperatura actual, y el programa verifica si la temperatura esta por encima del umbral de alerta.");
        System.out.println("Si es asi, muestra un mensaje de alerta. Si no, muestra un mensaje de que la temperatura es normal.");
        System.out.println(" ");
        
        TomarDatos();
    }
    
    public static void TomarDatos(){ 
        System.out.println("Este es un sensor de temperatura ambiente con umbral de alerta");
        System.out.println("Este umbral de temperatura tiene varios Avisos");
        System.out.println("Seguro(Verde) - Precaucion(Amarrillo) - Precaucion extrema(Naranja) - Peligro(Rojo) - Peligro extremo(Morado)");
        System.out.println("Ingresa la temperatura actaul");
        Scanner scanner = new Scanner(System.in);
        int Temperatura = scanner.nextInt();
        System.out.println("La temperatura registrada fue: " + Temperatura);
        System.out.println(" ");
        
        ProcesarDatos(Temperatura);
    }
    
    public static void ProcesarDatos(int Temperatura){
        if (Temperatura >= 0 && Temperatura <= 26){
            System.out.println("Aviso: Verde");
            System.out.println("La temperatura: " + Temperatura + ", esta en un rango seguro");
            System.out.println(" ");
        }
        if (Temperatura >= 27 && Temperatura <= 32){
            System.out.println("Aviso: Amarrillo");
            System.out.println("La temperatura: " + Temperatura + ", esta en un rango de precaucion");
            System.out.println(" ");
        }
        if (Temperatura >= 33 && Temperatura <= 40){
            System.out.println("Aviso: Naranja");
            System.out.println("La temperatura: " + Temperatura + ", esta en un rango de precaucion extrema");
            System.out.println(" "); 
        }
        if (Temperatura >= 41 && Temperatura <= 51){
            System.out.println("Aviso: Rojo");
            System.out.println("La temperatura: " + Temperatura + ", esta en un rango de peligro");
            System.out.println(" "); 
        }
        if (Temperatura >= 52 && Temperatura <= 92){
            System.out.println("Aviso: Morado");
            System.out.println("La temperatura: " + Temperatura + ", esta en un rango de peligro extremo");
            System.out.println(" "); 
        }
        else if (Temperatura >= 93){
            System.out.println("Mas alla del umbral humano");
            System.out.println(" ");
        }
        
        DarResultados(Temperatura);
    }
    
    public static void DarResultados(int Temperatura){
        System.out.println("Tu temperatura fue registrada exitoxamente, temperatura: " + Temperatura + " grados");
        System.out.println("");
    }
}
