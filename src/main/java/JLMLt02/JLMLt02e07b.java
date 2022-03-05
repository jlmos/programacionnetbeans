/* leer años y mostrar si es bisiesto.
   autor: jose luis mosquera losada
   fecha: 17-10-21 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e07b {
     public static void main(String[] args) {
        boolean bis;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un año: ");
           int año = teclado.nextInt();
         bis = (año%4==0)&& (año%100!=0)||(año% 400==0);
          if (bis) System.out.println("El " + año + " es bisiesto");
          else  {System.out.println("El " + año + " no es bisiesto");
            }
      }
 }  
     


