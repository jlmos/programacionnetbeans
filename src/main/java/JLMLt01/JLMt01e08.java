/* Calculo media de edad de cuatro personas
* autor: jose luis mosquera losada
* fecha: 2021-10-10 */
package JLMLt01;
import java.util.Scanner;
public class JLMt01e08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad1, edad2, edad3, edad4;
        double mediaEdad;
         System.out.print("introduce edad1: ");
        edad1 = teclado.nextInt();
        System.out.print("introduce edad2: ");
        edad2 = teclado.nextInt();
        System.out.print("introduce edad3: ");
        edad3 = teclado.nextInt();
        System.out.print("introduce edad4: ");
        edad4 = teclado.nextInt();
        mediaEdad = Math.round((edad1 + edad2 + edad3 +edad4)/4.0);
        System.out.println("la media de edad es : " + mediaEdad + " años");

    }
    
}
