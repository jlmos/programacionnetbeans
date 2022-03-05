/*automoción coste de fábrica y coste total para el cliente
* autor: jose luis mosquera losada
* fecha: 2021-10-10  */
package JLMLt01;
import java.util.Scanner;
public class JLMt01e06 {
 public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cfab, porcentajeGanancial, costeTotal;
        double pg = 0.10, impuesto = 0.20;
        
        System.out.print("introduce el coste de Fábrica: ");
        cfab =  teclado.nextInt();
        porcentajeGanancial = Math.round ((cfab * pg)*100)/100d;
        costeTotal = Math.round ((cfab + (cfab * impuesto)+ porcentajeGanancial) *100)/100d;
        System.out.println("El coste final para el cliente es: " + costeTotal + " euros");

    }
    
}
