/* Mostrar por pantalla alternativamente "hola" y "adios" hasta completar un nº
de líneas introducidos previamente con nºs que pueden ser par o impar.
autor: jose luis mosquera losada
fecha: 31-10-2021 */
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e25 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, numeroVeces;
        System.out.print("Introducir el nº de veces: ");
        numeroVeces = teclado.nextInt();
        for (i = 1; i <= numeroVeces; i++) {
            System.out.println(" hola " + " adios" );
            
        }
    }
}
