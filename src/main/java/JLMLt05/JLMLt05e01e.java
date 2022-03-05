/*Realizar la función llamada aleatorio() que se le pasan 2 valores y devuelve 
un entero al azar comprendido entre esos 2 valores(el 1ero es menor que el 2do
y ambos mayores que cero, en caso contrario devuelve -1.
autor: jose luis mosquera losada
fecha: 14-11-2021 */
package JLMLt05;

import java.util.Scanner;

public class JLMLt05e01e {

    static int m, n;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce el numero mínimo: ");
        n = Integer.parseInt(teclado.nextLine());
        System.out.print("introduce el numero máximo: ");
        m = Integer.parseInt(teclado.nextLine());
        int x = aleatorio(n, m);
        System.out.println("el numero aleatorio es:  " + x);
    }

    static int aleatorio(int n, int m) {
        if (n < m && n > 0 && m > 0) {
            int aleatorio = (int) Math.floor(Math.random() * (n - m + 1) + m);
            return aleatorio;
        }return 0;
}}
