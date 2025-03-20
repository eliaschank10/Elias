/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package condicionales;

import java.util.Scanner;

/**
 * < > [ ]
 * @author Elias
 */
public class condicionalSwitch {
    
    public static void main(String[] args) {
        int opcion, n1 = 3, n2 = 6; // Valor fijo asignado
        
        Scanner num = new Scanner(System.in);
        System.out.print("ingrese '1' para realizar una suma, ingrese '2' para realizar una resta, ingrese '3' para una multiplicacio o ingrese '4' para realizar una division:");
        opcion = num.nextInt();
        
        // Evaluamos la opción con switch
        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste la opción 1. y el resultado es: "+(n1+n2));
                break;
            case 2:
                System.out.println("Seleccionaste la opción 2. y el resultado es: "+(n1-n2));
                break;
            case 3:
                System.out.println("Seleccionaste la opción 3. y el resultado es: "+(n1*n2));
                break;
            case 4:
                System.out.println("Seleccionaste la opción 3. y el resultado es: "+(n1/n2));
                break;    
            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Fin del programa.");
    }
    
}
