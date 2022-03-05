/* Conocer el valor de la hipotenusa 
* autor: jose luis mosquera losada
* fecha: 2021-10-10 */
package JLMLt01;
import java.util.Scanner;
public class JLMt01e11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int catA, catB;
        int pot=2;
        double potenc1, potenc2;
        double poteTotal;
        double hipo;    
        System.out.print ("Introduzca la longitud del cateto A: ");
        catA = teclado.nextInt();
        System.out.print ("Introduzca la longitud del cateto B: ");
        catB = teclado.nextInt();
        potenc1 = Math.pow (catA,pot);
        potenc2 = Math.pow (catB,pot);
        poteTotal = potenc1+ potenc2;
        hipo = Math.sqrt (poteTotal);
        
        System.out.println("el valor de la hipotenusa es " + hipo);
    }
    
}
