/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp2;
import java.util.Random;
import java.util.Scanner;
/**
 * < > [ ]
 * @author Elias
 */
public class ej6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner leer = new Scanner(System.in);
        
        int op;
        
        do {
            System.out.println("Ingrese su opción: ");
            System.out.println("1. Lanzar el dado");
            System.out.println("2. Salir");
            op = leer.nextInt();

            switch (op) {
                case 1:
                   int numero = random.nextInt(6)+1; 
                    System.out.println("El dado ha caído en: " + numero);
                    break;
                case 2:
                    System.out.println("Saliste del juego");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese 1 o 2.");
            }
        } while (op != 2);
    }

}
