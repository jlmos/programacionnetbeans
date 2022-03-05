/* Leer dos números enteros y mostrar si al menos uno de ellos es > de 10
autor: jose luis mosquera losada
fecha: 17-10-21 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e01e {
     public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
   int numEntero1, numEntero2;
         System.out.print("Introduce el primer número entero: ");
         numEntero1 = teclado.nextInt();
         System.out.print("Introduce el segundo número entero: ");
         numEntero2 = teclado.nextInt();
     if (numEntero2 > 10 || numEntero1 > 10) 
         System.out.println("Al menos uno de los dos es mayor de 10");
     else 
         System.out.println("ninguno de los dos es mayor de 10");
     }
    
}
