/* Leer dos números enteros y mostrar si el segundo es divisor del primero.
prevenir divisiones por cero que causan error
autor: jose luis mosquera losada
fecha: 17-10-21 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e01i {
     public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
   int numEntero1, numEntero2;
         System.out.print("Introduce el primer número entero: ");
         numEntero1 = teclado.nextInt();
         System.out.print("Introduce el segundo número entero: ");
         numEntero2 = teclado.nextInt();
     if (numEntero2 != 0 && numEntero1 % numEntero2 == 0) 
         System.out.println("el segundo número es divisor del primero");
     else 
         System.out.println("el segundo número no es divisor del primero");
     }
    
}
