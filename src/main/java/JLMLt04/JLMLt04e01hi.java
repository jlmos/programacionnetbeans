/* introducir una cadena por teclado y haga los 8 siguientes apartados señalados
con sus respectivas letra, en este caso desde la 'h' hasta la 'i':
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e01hi {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un texto numérico:");
        String cadena = teclado.nextLine();
        int numeroEntero2 = Integer.parseInt(cadena, 16);// h)convertir la cadena a una variable tipo int
        System.out.println("la conversión es: " + numeroEntero2);
        Float.parseFloat(teclado.nextLine());
        int numeroEntero = Integer.parseInt(cadena);// h)convertir la cadena a una variable tipo int
        System.out.println("la conversión es: " + numeroEntero);
        Float.parseFloat(teclado.nextLine());

    }
}
