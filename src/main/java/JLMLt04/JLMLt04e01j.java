/* introducir una cadena por teclado y haga los 8 siguientes apartados señalados
con sus respectivas letras:
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e01j {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un texto:");
        String cadena = teclado.nextLine();
        String original = cadena;
        String nueva = original.replace("prueva", "prueba");
        System.out.println(nueva);
        

    }
}
