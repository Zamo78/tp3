/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;
import java.util.Scanner;

public class Operaciones {
    
public void suma(int num, int num1){
        int suma= num + num1;
        System.out.println("Suma:"+suma);
    }
public void resta(int num, int num1){
        int resta= num - num1;
        System.out.println("Resta:"+resta);
    }
public void multi(int num, int num1){
        int multi= num * num1;
        System.out.println("Multiplicacion:"+multi);
    }
public void div(int num, int num1){
        int div= num / num1;
        System.out.println("Division:"+div);
    }

public static void main (String[] ar){
    Operaciones op1;
    op1=new Operaciones();
    Scanner teclado=new Scanner(System.in);
    
    System.out.println("Ingrese un valor entero:");
    int num=teclado.nextInt();
    System.out.println("Ingrese otro valor entero:");
    int num1=teclado.nextInt();
    
    op1.suma(num,num1);
    op1.resta(num,num1);
    op1.multi(num,num1);
    op1.div(num,num1);
    
    
}
    
}
