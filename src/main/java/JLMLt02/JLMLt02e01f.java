/* Leer un número entero y determinar si esta entre 10 y 20 ambos incluidos
autor: jose luis mosquera losada
fecha: 17-10-21 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e01f {
     public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
   int numEntero;
         System.out.print("Introduce un número entero: ");
         numEntero = teclado.nextInt();
     if (numEntero >= 10 && numEntero <=20)
         System.out.println("El número introducido está entre 10 y 20");
     else 
         System.out.println("el número introducido no está entre 10 y 20");
     }
    
}
