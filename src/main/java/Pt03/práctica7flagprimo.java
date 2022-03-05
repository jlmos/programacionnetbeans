/* primo
 */
package Pt03;

import java.util.Scanner;


public class práctica7flagprimo {
   public static void main(String[] args) {
      Scanner teclado =new Scanner(System.in);
      System.out.print("Introduzca un numero:");
       int valor=teclado.nextInt();
       int i=2;
       boolean primo=true; 
            
       while (primo&& i<valor){
           if (valor % i==0)primo=false;
           i++;
       }
       if (primo)System.out.println("Es primo");
       else System.out.println("No es primo");
      }}     

    

