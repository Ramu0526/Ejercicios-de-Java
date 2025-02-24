package ejercicios.de.java;

import java.util.Scanner;

class Ejercicio8 {

    public Ejercicio8() {
    }

    void Ejecutar() {
        System.out.println("\nBienvenido al asistente virtual de cine.");
        System.out.println("Te recomendaremos una película según tu edad.\n");

        int edad = TomarEdad();
        String recomendacion = ObtenerRecomendacion(edad);

        MostrarRecomendacion(edad, recomendacion);
    }

    public static int TomarEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu edad: ");
        return scanner.nextInt();
    }

    public static String ObtenerRecomendacion(int edad) {
        int categoria = (edad < 7) ? 1 : (edad <= 17) ? 2 : (edad <= 30) ? 3 : 4;

        switch (categoria) {
            case 1:
                return "Te recomendamos películas animadas y educativas, como 'Toy Story' o 'Coco'.";
            case 2:
                return "Te sugerimos películas familiares, de aventuras y comedias, como 'Los Increíbles' o 'Jumanji'.";
            case 3:
                return "Puedes disfrutar de acción, drama, comedia y ciencia ficción, como 'Inception' o 'John Wick'.";
            case 4:
                return "Las películas clásicas y dramas pueden ser de tu interés, como 'El Padrino' o 'Forrest Gump'.";
            default:
                return "Edad no válida. Intenta nuevamente.";
        }
    }

    public static void MostrarRecomendacion(int edad, String recomendacion) {
        System.out.println("\nTu edad: " + edad + " años.");
        System.out.println("Recomendación: " + recomendacion);
    }
}
