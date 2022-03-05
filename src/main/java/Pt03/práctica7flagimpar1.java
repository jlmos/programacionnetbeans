/* año bisiesto
 */
package Pt03;

import java.util.Scanner;


public class práctica7flagimpar1 {
   public static void main(String[] args) {
      Scanner teclado =new Scanner(System.in);
      System.out.print("Introduzca un numero:");
       int valor=teclado.nextInt();
       boolean Esimpar=true; 
            
           if (valor % 2==0){Esimpar=false;}
         if (Esimpar){System.out.println(" Es impar"); }
          else   System.out.println("No es impar");
   }}     
       
    

