/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8;
import java.util.Scanner;

public class Persona {
    Scanner teclado=new Scanner(System.in);
    protected String nombre;
    protected int edad;
    public void cargaDatos(){
        System.out.print("Ingrese nombre:");
        nombre=teclado.nextLine();
        System.out.print("Ingrese edad:");
        edad=teclado.nextInt();
    }
    public void mostarDatos(){
        System.out.println("\n\nNombre: "+nombre);
        System.out.println("Edad: "+edad);
    }

}
