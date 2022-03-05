/* Introducir nºs positivos, con información par o impar de uno a uno.
Con fin al introducir un nº negativo. Hacer dos versiones: 
a) teclado adelantado. b)lectura al principio del bucle 
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;
import java.util.Scanner;
public class JLMLt03e03a {
    public static void main(String[] args) {
         Scanner teclado =new Scanner(System.in);

        int i;
          System.out.print("introduce un nº: ");
        i = teclado.nextInt();
        while (i >=0) {
          if (i % 2==0) {System.out.println( i +" es par");}
          else  {System.out.println( i + " es impar");}
          System.out.print("introduce un nº: ");
          i = teclado.nextInt();
        }
          }
    }
/* atasco porque el 1er sout tiene que antes del while y el 2do despues del else
dentro del bucle */
    

