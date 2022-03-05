/* sumar nºs introducidos por teclado hasta que la suma de ellos sea >100 
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int i, sumaTotal = 0;
        System.out.print("introduce un nº: ");
        i = teclado.nextInt();
        while (sumaTotal < 100) {
            sumaTotal += i;
            System.out.print("introduce un nº: ");
            i = teclado.nextInt();
            sumaTotal += i;

        }
        System.out.println("la suma total es: " + sumaTotal + " y vale más que 100");
    }
}
/*¿Es necesario poner los dos system y los dos sumaTotal? */
