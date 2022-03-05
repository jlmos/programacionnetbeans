/** sumar, restar y dividir dos números enteros
 * autor: jose luis mosquera losada
 * fecha: 2021-10-10 */
package JLMLt01;

import java.util.Scanner;

public class JLMt01e03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /* entrada de datos */
        int num1, num2, resS, resR; 
        double resD;

        System.out.print("introduce un número entero: ");
        num1 = teclado.nextInt();
        System.out.print("introduce otro entero: ");
        num2 = teclado.nextInt();
        resS = num1 + num2; 
        resR = num1 - num2; 
        resD = (double) num1 / num2;

        System.out.println("la suma es " + resS);
        System.out.println("la resta es " + resR);
        System.out.println("la división es " + resD);

    }

}
