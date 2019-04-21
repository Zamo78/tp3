/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8;
import static java.lang.System.*;

public class Empleado extends Persona {
    protected float sueldo;
    public void cargaSueldo(){
        System.out.print("Ingrese su sueldo: ");
        sueldo=teclado.nextFloat();
    }
    public void mostrarSueldo(){
        System.out.println("Sueldo: $"+sueldo);
    }
    public static void main (String[] args){
        Empleado empleado1=new Empleado();
        empleado1.cargaDatos();
        empleado1.cargaSueldo();
        empleado1.mostarDatos();
        empleado1.mostrarSueldo();
    }
    
    
}
