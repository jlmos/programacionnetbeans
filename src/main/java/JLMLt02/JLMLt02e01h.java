/* Leer dos números y mostrar si el primero es >,< o == que el segundo
autor: jose luis mosquera losada
fecha: 17-10-21 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e01h {
     public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
   int numEntero1, numEntero2;
         System.out.print("Introduce el primer número : ");
         numEntero1 = teclado.nextInt();
         System.out.print("Introduce el segundo número : ");
         numEntero2 = teclado.nextInt();
     if (numEntero1 > numEntero2) 
         System.out.println("El primer número es mayor que el segundo");
     else { 
        if (numEntero1 < numEntero2) 
         System.out.println("El primer número es menor que el segundo");
     else {
         System.out.println("el primer número es igual que el segundo");
     }
     }
     }
}
