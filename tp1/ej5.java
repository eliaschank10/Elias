/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp1;

import java.util.Scanner;

/**
 * < > [ ]
 * @author Elias
 */
public class ej5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int edad;
        
        System.out.println("Ingrese su edad: ");
        edad =leer.nextInt();
        
        if(edad>=18){
            System.out.println("Tienes permitido conducir.");
        } else {
            System.out.println("No tienes permitido conducir.");
        }
    }
}
