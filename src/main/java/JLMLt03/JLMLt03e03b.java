/* Introducir nºs positivos, con información par o impar de uno a uno
con fin al introducir un nº negativo. Hacer dos versiones: 
a) teclado adelantado. b)lectura al principio del bucle 
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;
import java.util.Scanner;
public class JLMLt03e03b {
    public static void main(String[] args) {
         Scanner teclado =new Scanner(System.in);

        int i=0;
        while (i >=0) {
        System.out.print("introduce un nº: ");
        i = teclado.nextInt();
        if (i>=0)
          if (i % 2==0) {System.out.println( i +" es par");}
          else  {System.out.println( i + " es impar");}
        }
          }
    }
/* atasco por que el primer if (i>=0) tiene que ir entre el while y el otro if 
y no al final del else*/