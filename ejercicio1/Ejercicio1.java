/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;


import java.util.Scanner;

public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        int cantidad;
        float precio, total;
        
        System.out.println("Ingrese el precio unitario del producto:");
        precio=teclado.nextFloat();
        
        System.out.println("Ingrese cantidad que llevara del producto:");
        cantidad=teclado.nextInt();
        
        total=precio * cantidad;
        
        System.out.println("El importe total a pagar es: "+total);
      
        
    }
    
}
