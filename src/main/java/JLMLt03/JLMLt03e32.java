/* introducir un nº entero y que lo muestre en binario
autor: jose luis mosquera losada
fecha: 2-11-2021 */
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e32 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número decimal: ");
        int decimal = teclado.nextInt();
        int exponente=0;
        long binario = 0;
        while (decimal > 0) {
            binario += (decimal % 2) *Math.pow(10,exponente);
            decimal /= 2;
            exponente++;
        }
        System.out.println("Binario: " + binario);
    }
}
