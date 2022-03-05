/* 2da versión solo dos variables
Calculo media de edad de cuatro personas
* autor: jose luis mosquera losada
* fecha: 2021-10-10 */
package JLMLt01;
import java.util.Scanner;
public class JLMt01e08b {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edadTotal;
        double mediaEdad;
         System.out.print("introduce edad1Total de 4 personas: ");
        edadTotal = teclado.nextInt();
        mediaEdad = Math.round((edadTotal)/4.0);
        System.out.println("la media de edad es : " + mediaEdad + " años");
    }
    
}
