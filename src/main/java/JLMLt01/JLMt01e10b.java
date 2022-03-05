/*Calculo del área de un rectángulo considerando que se introduzcan 
* valores negativos
* autor: jose luis mosquera losada
* fecha: 2021-10-10 */
package JLMLt01;
import java.util.Scanner;
public class JLMt01e10b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, y, area;
                
        System.out.print ("Introduce la coordenada x: ");
        x = teclado.nextInt();
                System.out.println(("el valor absoluto es: ")+ Math.abs(x));
/*me faltaría saber como sacar por consola solo cuando 
 * "el valor absoluto es" fuera negativo y no hacerlo siempre */
        System.out.print ("Introduce la coordenada y: ");
        y = teclado.nextInt();
                  System.out.println(("el valor absoluto es: ")+ Math.abs(y));
      area = Math.abs (x * y);
        System.out.println("el área del rectángulo es " + area);
    }
    
}
