/* año bisiesto
 */
package Pt03;

import java.util.Scanner;


public class práctica5Bisiesto {
   public static void main(String[] args) {
      Scanner teclado =new Scanner(System.in);
       boolean bisiesto; int año;
       System.out.print("introudce el año:");
       año=teclado.nextInt();
      bisiesto=(año%4==0)&&(año%100!=0)||(año%400==0);
      if(bisiesto)System.out.println("El año "+año+" es bisiesto");
      else System.out.println("El año " +año+" no es bisiesto");
      }}     

    

