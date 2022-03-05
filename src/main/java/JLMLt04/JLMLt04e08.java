/* introducir una cadena, un nº que indica la posición de la cadena y una letra.
reemplazar, sobre la misma cadena, el caracter que hubiera en la posición indicada
por la letra introducida. 2 versiones: 1) con String 2) con StrinBuilder.
con sus respectivas letras: decir cuantos dígitos numéricos hay en una cadena
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un texto:");
        String cadena = teclado.nextLine();
        System.out.print("Introduzca un número:");
        int numero = teclado.nextInt();
        System.out.print("Introduzca un caracter:");
        char caracter = teclado.next().charAt(0);
        String nueva;
        int pos = numero;
        nueva = cadena.substring(0, pos) + caracter + cadena.substring(pos + 1);
        System.out.println("el rsdo es " + nueva);

    }
}
