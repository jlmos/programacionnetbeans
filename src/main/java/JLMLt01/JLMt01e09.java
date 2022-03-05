/* Programa que intercambie dos variables. Errores de códigos
* autor: jose luis mosquera losada
* fecha: 2021-10-10 */
package JLMLt01;
import java.util.Scanner;
public class JLMt01e09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /* se necesita esta clase para usarla 
        *llamando a import java.util.Scanner*/
        int varA, varB, AUXI;
        
        System.out.print ("Introduce varA: ");
        varA = teclado.nextInt();
        System.out.print ("Introduce varB: ");
        varB = teclado.nextInt();
        System.out.println("valores iniciales: varA = " + varA + " varB = " + varB);
        //se utiliza una variable auxiliar//
        AUXI = varA;
        varA = varB;
        varB = AUXI;
        System.out.println("Ahora varA es igual a varA");
        System.out.println("Ahora varB es igual a varB");
        System.out.println("valores iniciales: varA = " + varA + " varB = " + varB);

    }
    
}
