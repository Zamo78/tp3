/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;
import java.util.Scanner;

public class ejercicio5 {
    
    
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
		int num=0,num1=0;

		while(num!=9999)
		{
			num1 += num;	
			System.out.print("Ingrese valor a sumar: ");
			num=teclado.nextInt();
		}
if(num1==0)
	{
		System.out.println("El valor acumulado es: "+num1);
	}

if(num1>0)
	{
		System.out.printf("El valor %d es mayor a cero\n", num1);
	}

if (num1<0) 
	{
		System.out.printf("El valor %d es menor a cero\n", num1);
		
	}

}
    
}
