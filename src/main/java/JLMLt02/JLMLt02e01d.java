/* Leer dos números enteros y mostrar si los don mayores de 10 o no lo son
autor: jose luis mosquera losada
fecha: 17-10-21 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e01d {
     public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
   int numEntero1, numEntero2;
         System.out.print("Introduce el primer número entero: ");
         numEntero1 = teclado.nextInt();
         System.out.print("Introduce el segundo número entero: ");
         numEntero2 = teclado.nextInt();
     if (numEntero1 > 10 && numEntero2 > 10) 
         System.out.println("los dos números enteros son mayores que 10");
     else 
         System.out.println("Uno de los números o los dos no son mayores que 10");
     }
    
}
