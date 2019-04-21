/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
 import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] ar){
    Scanner teclado=new Scanner(System.in);
     int num;  
System.out.print("Ingresar un numero positivo:");
num=teclado.nextInt();

if(num>0)
{
if(num < 10 && num>= 0) {
	System.out.print("El numero tiene 1 sola cifra");
}
if(num>=10 && num<100){
	System.out.print("El numero tiene 2 cifras");
}
if (num>=100 && num<1000){
	System.out.print("El numero tiene 3 cifras");
}

if (num>=1000 && num<10000)
{    
    System.out.print("El numero tiene 4 cifras");    
}
if(num>=10000)
{
      System.out.print("El numero tiene mas de 4 cifras");
    }               


} else {
    System.out.println("Numero invalido, debe ser positivo");
}
    
}
    
}