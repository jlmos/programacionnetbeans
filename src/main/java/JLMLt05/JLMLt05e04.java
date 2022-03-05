/*Realizar la función llamada calcularDiaMes() que le pasa una fecha
y nos informe de los días pasados dd 1 de enero de ese año
autor: jose luis mosquera losada
fecha: 19-11-2021 */
package JLMLt05;

import static JLMLt05.JLMLt05e03.cantidadDiaMes;
import java.util.Scanner;

public class JLMLt05e04 {

    static int año, mes, dia, diasPasados = 0;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce un dia: ");
        dia = teclado.nextInt();
        System.out.print("introduce un mes: ");
        mes = teclado.nextInt();
        System.out.print("introduce un año: ");
        año = teclado.nextInt();

        for (int i = 1; i < mes; i++) {
            diasPasados += cantidadDiaMes(i, año);
        }
        diasPasados += dia - 1;
        System.out.println("Los días pasados desde 1 de Enero de " + año + " fueron:" + diasPasados + " dias");
    }
}
// Tiene en cuenta la función catidadDiaMes para calcular los años Bisiestos.
// No esperaba que los cogiera del programa anterior.
// conclusión la función se crea y java facilita su llamada.