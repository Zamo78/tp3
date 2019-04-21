/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.Scanner;

public class Empleado {   
        private Scanner teclado;
        String nombre;
        float sueldo;

public void carga() {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre=teclado.nextLine();
        System.out.println("Ingrese sueldo:");
        sueldo=teclado.nextFloat();
}

public void impresion() {
        System.out.println("Empleado: "+nombre);
        System.out.println("Cobra un sueldo de: $"+sueldo);
}

public void impuesto() {
    if(sueldo>=3000){
        System.out.println("Usted debe pagar impuestos, su sueldo supera el monto establecido");
    }
}

public static void main(String[] ar)
{
    Empleado empleado1;
    empleado1=new Empleado();
    empleado1.carga();
    empleado1.impresion();
    empleado1.impuesto();
    
}

}