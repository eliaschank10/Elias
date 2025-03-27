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
public class receta {
    
    public static void main(String[] args) {
        String nombre;
        String ingredientes;
        int Tiempo;
        String Dificultad;

        Scanner nom = new Scanner(System.in);
        System.out.print("Ingrese el nombre dela receta: ");
        nombre = nom.next();
        
        System.out.print("Ingrese el ingrediente pricipal de la receta: ");
        ingredientes = nom.next();
        
        System.out.print("Ingrese el tiempo de coccion en minutos: ");
        Tiempo = nom.nextInt();
        
        System.out.print("Ingrese la dificultad de la receta: ");
        Dificultad = nom.next();
        
        System.out.println("El nombre de la receta es: "+nombre);
        System.out.println("El ingrediente principal es: "+ingredientes);
        System.out.println("El timepo de coccion es: "+Tiempo);
        System.out.println("La dificultad es: "+Dificultad);
    }
    
    
}
