/* Programa que intercambie dos variables. Sin variable adicional
* autor: jose luis mosquera losada
* fecha: 2021-10-10
 */
package JLMLt01;
import java.util.Scanner;
public class JLMt01e09b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int varA, varB;
        
        System.out.print ("Introduce varA: ");
        varA = teclado.nextInt();
        System.out.print ("Introduce varB: ");
        varB = teclado.nextInt();
        System.out.println("valores iniciales: varA = " + varA + " varB = " + varB);
        //sin utilizar una variable auxiliar//
        varA = varA + varB;
        varB = varA - varB;
        varA = varA - varB;
        System.out.println("Ahora varA es igual a varA "+varA);
        System.out.println("Ahora varB es igual a varB " +varB);
        System.out.println("valores finales: varA = " + varA + " varB = " + varB);
    }
    
}
