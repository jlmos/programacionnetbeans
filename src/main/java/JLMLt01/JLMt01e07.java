/* Consumo medio cada 100k, coche
* autor: jose luis mosquera losada
* fecha: 2021-10-10 */
package JLMLt01;
import java.util.Scanner;
public class JLMt01e07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double kmrep, kmac, litrr, litac, kmtotal, cosmtotal, cosmmedio;
        
        System.out.print("introduce km última vez de repostación: ");
        kmrep = teclado.nextInt();
        System.out.print("introduce km actual: ");
        kmac = teclado.nextInt();
        System.out.print("introduce litros última vez de repostación: ");
        litrr = teclado.nextInt();
        System.out.print("introduce litros gasolina actual: ");
        litac = teclado.nextInt();
                
        kmtotal = Math.round ((kmac - kmrep)* 100) / 100d;
        cosmtotal = Math.round ((litrr - litac)* 100) / 100d;
        cosmmedio = Math.round (((cosmtotal/kmtotal)*100)* 100) / 100d;
        System.out.println("El consumo medio es : " + cosmmedio + " litros por km");

    }

}
