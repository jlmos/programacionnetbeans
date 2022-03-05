/* Equivalencias 1) de Celsius a Fahrenheit 2) de pulgadas a centímetros
* autor: jose luis mosquera losada
 * fecha: 2021-10-10 */
package JLMLt01;
import java.util.Scanner;
public class JLMt01e05 {
 public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double celsius, fahre, pulgadas, cm;

        System.out.print("introduce la temperatura en ºC: ");
        celsius =  teclado.nextInt();
        System.out.print("introduce la cantidad de agua en pulgadas: ");
        pulgadas = teclado.nextInt();
        fahre = Math.round ((9d / 5 * celsius + 32)*100)/100d;
        cm = Math.round ((pulgadas * 25.5)*10)/10d;

        System.out.println("La temperatura en fahre es: " + fahre);
        System.out.println("La cantidad de agua en cm es:  " + cm);         
    }
   
        
}
