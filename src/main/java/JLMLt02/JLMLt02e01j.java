/* Leer dos números enteros y mostrar si el menor de ellos es divisor del otro
autor: jose luis mosquera losada
fecha: 17-10-21 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e01j {
     public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
   int numEntero1, numEntero2, mayor, menor;
      
         System.out.print("Introduce el primer número entero: ");
         numEntero1 = teclado.nextInt();
         System.out.print("Introduce el segundo número entero: ");
         numEntero2 = teclado.nextInt();
     if (numEntero1>numEntero2){mayor = numEntero1; menor = numEntero2;} 
     else {mayor = numEntero2; menor = numEntero1;}
          
     if (menor != 0 &&  mayor % menor == 0)
          System.out.println("el menor de ellos es divisor del otro");
     else 
         System.out.println("el menor de ellos no es divisor del otro");
     }
    
}

