/* HACER TRES VERSIONES donde se lean dos números, incluyendo las instrucciones
dadas y comprobando los compartamientos de cada versión.
autor: jose luis mosquera losada
fecha: 17-10-19 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e15 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
   int a, b, r;
         System.out.print("Introduce el primer número A : ");
         a = teclado.nextInt();
         System.out.print("Introduce el segundo número B: ");
         b = teclado.nextInt();
         
         if (b !=0 && a/b==0) {r = a/b; 
         System.out.println("el rsdo es: "+r);}
        
         /*  En el 1er caso si b es distinto de cero(se lee primero) y además a/b 
         tiene que ser cero, solo sale por pantalla r cuando el divisor es 0.
         Primero si b es distinto de cero r no sale porque nunca va a ser cero;
         segundo: no puede ser que un divisor distinto de cero al hacer 
         la división el resultado de cero, salvo que dicho divisor sea cero. 
         Creo que es la razón por lo que está en cortocircuito. 
         Permite ejecutar pero solo sale r si el dividendo es cero*/
        
         if (a/b==0 && b !=0) {r = a/b; 
         System.out.println("el rsdo es: "+r);}
                 
         /*  En el 2do caso hace 1ero la división y si b es distinto de cero
          permite la ejecución pero no da r y si ponemos cero como divisor
          da error de ejecución y para que a/b sea igual a cero tiene que 
          dividirse entre cero. Permite, también, ejecutar si el dividendo es cero,
         para como en el 1er caso dar cero*/
                  
         if (b !=0 & a/b==0) {r = a/b; 
         System.out.println("el rsdo es: "+r);}
        
         /*  En el 3er el simbolo & único, permite que se evaluen las 2 expresiones
         aunque la 1era sea falsa y vuelve a no sacar r con el divisor distinto 
         de 0 salvo que el dividendo sea cero que si sale r con el rsdo cero.
         Da error de ejecución con el divisor 0, por lo comentado anteriormente. */
         
         
     }
}
