/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
    
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
 		int f,par=0,impar=0,num;
 		for(f=1;f<=10;f++) {
 		System.out.print("Ingrese un numero:");
 		num=teclado.nextInt();
 	
                if( num%2==0)
 	{
 		par+=1;
 	}else{
 		impar+=1;
 	}
                }
System.out.println("Cantidad nros pares: "+par);
System.out.println("Cantidad nros impares: "+impar);

 }
    
}
