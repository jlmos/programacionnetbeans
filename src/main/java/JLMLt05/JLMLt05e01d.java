/*Realizar la función llamada contarCeros() que se le pasa una cadena y devuelve 
la cantidad de ceros que tiene
autor: jose luis mosquera losada
fecha: 19-11-2021 */
package JLMLt05;

import java.util.Scanner;

public class JLMLt05e01d {

    static String cadena; 
    static int contador;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce una cadena: ");
        cadena = teclado.nextLine();// no es necesario hacer el Integer.parseInt(teclado.nextLine())
        int x = contarCeros(cadena);//no se le pone el tipo, sobraba el string
        System.out.println(" La cadena tiene " + x + " ceros");
    }

    static int contarCeros(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '0') {
                contador++;
            }
        }
        return contador;
    }
}
