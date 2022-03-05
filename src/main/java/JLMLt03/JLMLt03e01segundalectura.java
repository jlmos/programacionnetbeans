/* Mostrar por pantalla la frase "esto es un bucle 10 veces.
autor: jose luis mosquera losada
fecha: 31-10-2021 */
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e01segundalectura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, suma = 0;
        System.out.print("introduce un numero(-1 fin):");
        i = teclado.nextInt();
        while (i != -1) {
            suma += i;
        System.out.print("introduce un numero(-1 fin):");
            i = teclado.nextInt();
        }
        System.out.println("la suma es:" + suma);
    }
}
