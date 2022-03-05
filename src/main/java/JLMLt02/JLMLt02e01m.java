/* Leer tres números enteros y mostrar hay alguno mayor que cero, pero no todos.
autor: jose luis mosquera losada
fecha: 17-10-21 */
package JLMLt02;

import java.util.Scanner;

public class JLMLt02e01m {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numEntero1, numEntero2, numEntero3;

        System.out.print("Introduce el primer número entero: ");
        numEntero1 = teclado.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        numEntero2 = teclado.nextInt();
        System.out.print("Introduce el tercer número entero: ");
        numEntero3 = teclado.nextInt();

        if (numEntero1 < 0 && numEntero2 < 0 && numEntero3 < 0) {
            System.out.println(" Alguno tiene que ser mayor que cero");
        } else if (numEntero1 > 0 && numEntero2 > 0 && numEntero3 > 0) {
            System.out.println("No pueden ser todos mayor que cero");
        } else {
            if (numEntero1 > 0 || numEntero2 > 0 || numEntero3 > 0) {
                System.out.println("Hay alguno mayor que cero, pero no todos");
            }
        }
    }
}
