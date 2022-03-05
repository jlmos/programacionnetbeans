/* Leer dos números enteros y mostrar si uno y solo uno de ellos es > de 10
autor: jose luis mosquera losada
fecha: 17-10-21 */
package JLMLt02;

import java.util.Scanner;

public class JLMLt02e01g1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numEntero1, numEntero2;
        System.out.print("Introduce el primer número entero: ");
        numEntero1 = teclado.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        numEntero2 = teclado.nextInt();
        if (numEntero1 > 10 && numEntero2 <= 10) {
            System.out.println("Se cumple que Uno y sólo uno es mayor de 10.");

        } else if (numEntero1 <= 10 && numEntero2 > 10) {
            System.out.println("Se cumple que Uno y sólo uno es mayor de 10.");
        } else {
            System.out.println("No se cumple la condición de que uno y sólo uno es mayor de 10");
        }
    }
}
/*no se puede hacer con un solo if no separa los condicionantes.*/