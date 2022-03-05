/* Leer un número entero y determinar si es un número par o impar
autor: jose luis mosquera losada
fecha: 17-10-21 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e01c {
     public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
   int numEntero,par;
         System.out.print("Introduce un número entero: ");
         numEntero = teclado.nextInt();
     if (numEntero % 2 == 0) 
         System.out.println("El número introducido es par");
     else 
         System.out.println("El número introducido  es impar");
     }
    
}
