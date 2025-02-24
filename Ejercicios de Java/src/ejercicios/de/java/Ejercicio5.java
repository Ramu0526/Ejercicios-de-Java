
package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio5 {

    public Ejercicio5(){
    }   
    
    void Ejecutar() {
        System.out.println(" ");
        System.out.println("Combina las dos simulaciones anteriores. El programa debe simular un ascensor que lleva al usuario a un piso deseado.");
        System.out.println("Antes de moverse, el programa verifica si la temperatura ambiente esta dentro del rango aceptable.");
        System.out.println("Si la temperatura está dentro del rango, el ascensor se mueve piso deseado. Si la temperatura está fuera del rango,");
        System.out.println("muestra un mensaje de que la temperatura no es adecuada y no permite el movimiento del ascensor.");
        System.out.println(" ");
        TomarDatos();
    }
    
    public static void TomarDatos(){ 
        System.out.println("Bienvenido señor usuario, si deseas subir al ascensor primero debemos verificar su Temperatura,");
        System.out.println("y asi saber si esta apto para el ingreso de este mismo señor (36,1 - 37,02 grados).");
        System.out.println(" ");
        Scanner PedirTemperatura = new Scanner(System.in);
        float Temperatura = PedirTemperatura.nextFloat();
        System.out.println("La temperatura ingresado señor usuario es: " + Temperatura + "grados");
        System.out.println(" ");
        
        ProcesarDatos(Temperatura);
    }
    
    public static void ProcesarDatos(float Temperatura){
        if (Temperatura >= 0 && Temperatura <= 160){
            System.out.println("Felicidades señor su temperatura es apto para subir al ascensor.");
            System.out.println("Selecciona al piso que deseas ir (1-10)");
            System.out.println(" ");
            Scanner PedirPiso = new Scanner(System.in);
            int Piso = PedirPiso.nextInt();
            System.out.println("Piso seleccionado: " + Piso);
            System.out.println(" ");
            
            DarResultados(Temperatura,Piso);
        }
        else{
            System.out.println("La temperatura que ingresaste excede lo permitido, lo siento señor");
            System.out.println(" ");
        }
    }
    
    public static void DarResultados(float Temperatura, int Piso){
        if (Piso >= 1 && Piso <= 10){
            System.out.println("Felicidades señor por ser apto con un peso de " + Temperatura + " grados, comenzando a subir al piso " + Piso);
            System.out.println(" ");
        }
        else{
            System.out.println("La temperatura que ingresaste excede lo permitido, lo siento señor");
            System.out.println("Piso invalido, no existe");
            System.out.println(" ");
        }
    }
    
}
