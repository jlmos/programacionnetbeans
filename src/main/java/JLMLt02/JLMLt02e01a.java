/* Leer un número entero y determinar si es mayor que 10
autor: jose luis mosquera losada
fecha: 17-10-2021 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e01a {
     public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
   int numEntero;
         System.out.print("Introduce un número entero: ");
         numEntero = teclado.nextInt();
     if (numEntero > 10) System.out.println("El número introducido es mayor de 10");
     else System.out.println("No es mayor de 10");
     }
    
}
