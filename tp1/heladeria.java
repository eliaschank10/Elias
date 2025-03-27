/*
Escribe un programa que consulte si un determinado gusto de helado está disponible.

>Crear una variable para almacenar el gusto de helado ingresado por el usuario, obtenido mediante Scanner y almacenado como una cadena de texto (String).

>Implementar una estructura condicional if para verificar si el gusto ingresado es uno de los siguientes: "chocolate", "vainilla", "frutilla" o "dulce de leche".

>>Si el gusto está disponible, mostrar: "Sí, hay ____" (completando con el gusto ingresado).

>>Si el gusto no está disponible, mostrar: "No hay ____" (completando con el gusto ingresado).

 */

package tp1;

import java.util.Scanner;

/**
 * < > [ ]
 * @author Elias
 */
public class heladeria {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        String gusto;
     
        System.out.println("Ingrese un gusto de helado: ");
        gusto=leer.nextLine().toLowerCase();
        
        if(gusto.equals("chocolate") || gusto.equals("vainilla") || gusto.equals("frutilla") || gusto.equals("dulce de leche") ){
            System.out.println("Sí, hay "+gusto);
    }else {
            System.out.println("No, hay "+gusto);
        }
  }
}
