package tp1;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * < > [ ]
 * @author Elias
 */
public class solicite_al_usuario_ingresar_sus_datos_de_empleado {
    public static void main(String[] args) {
        String nombreEmpleado;
        int edad;
        double salario;

        Scanner nom = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombreEmpleado = nom.nextLine();
        
        Scanner ed = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = ed.nextInt();
        
        Scanner sal = new Scanner(System.in);
        System.out.print("Ingrese su salario: ");
        salario = sal.nextDouble();
        
        System.out.println("Su nombre es: "+nombreEmpleado);
        System.out.println("Su edad es: "+edad);
        System.out.println("Su salario es: "+salario);
        
    }

}
