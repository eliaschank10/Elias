/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package tp2;

import java.util.Scanner;
/**
 * < > [ ]
 * @author Elias
 */
public class ej5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String n1, n2;
        
        System.out.println("Ingrese un valor: ");
        n1 = leer.next();
        
        System.out.println("Ingrese un valor: ");
        n2 = leer.next();
        
        int num1= Integer.parseInt(n1);
        int num2= Integer.parseInt(n2);
        
        if(num1==num2){
            System.out.println("Los numeros ingresados son iguales");
        } else {
            System.out.println("Los numeros ingresados no son iguales");
        }
    }
    
}
