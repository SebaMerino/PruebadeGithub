package introj_ej9;

import java.util.Scanner;
import sun.security.util.Length;

public class IntroJ_Ej9 {

    // Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
    //largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
    //un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
    //imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String frase;

        int longuitud = 8;

        System.out.println("Ingrese una frase de 8 caracteres");
        frase = leer.nextLine();

        if (frase.length() == longuitud) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
