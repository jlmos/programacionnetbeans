/* leer años y mostrar si es bisiesto.
   autor: jose luis mosquera losada
   fecha: 17-10-21 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e07a {
     public static void main(String[] args) {
        boolean bis;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un año: ");
           int año = teclado.nextInt();
          bis = (año%4==0)&& (año%100!=0)||(año% 400==0);
          if ((año%4==0) && (año%100!=0)){
              System.out.println("El " + año + " es bisiesto");}
          if ((año%400==0)&& (año%100!=0)){
              System.out.println("El " + año + " es bisiesto");}
             System.out.println("El " + año + " no es bisiesto");
          }
            }
       
 
 
     


