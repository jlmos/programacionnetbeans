/* Leer dos números enteros y mostrar si uno y solo uno de ellos es > de 10
autor: jose luis mosquera losada
fecha: 17-10-21 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e01g {
     public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
   int numEntero1, numEntero2;
         System.out.print("Introduce el primer número entero: ");
         numEntero1 = teclado.nextInt();
              if (numEntero1 > 10) /* no sabes nada del 2do nº no puedes afirmar el sout*/
         System.out.println("uno y solo uno es mayor de 10");
              else 
         System.out.print(" No es mayor que 10. " +"\n"
                 + "Introduce el segundo número entero: ");
         numEntero2 = teclado.nextInt();
              if (numEntero2 > 10)
         System.out.println("Uno y solo uno es mayor de 10");
              else 
         System.out.println("ninguno de los dos es mayor de 10");
     }
    
}
