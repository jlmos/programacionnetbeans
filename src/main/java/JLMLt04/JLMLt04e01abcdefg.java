/* introducir una cadena por teclado y haga los 8 siguientes apartados señalados
con sus respectivas letras, en este cas desde la 'a' hasta la 'g':
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e01abcdefg {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un texto:");
        String cadena = teclado.nextLine();
        String mayusculas = cadena.toUpperCase();
        System.out.println(mayusculas);// a) 4.1 a) MAYUSCULAS y minúsculas.
        String minusculas = cadena.toLowerCase();
        System.out.println(minusculas);
        String cadena2 = "hola";
        if (cadena.equals(cadena2)) {
            System.out.println("Cadenas iguales"); // g) cadenas iguales
        } else {
            System.out.println("Cadenas distintas");
            int pos = cadena.indexOf("x");
            if (pos == -1) {
                System.out.println("No Contiene una x");//b) si hay alguna "x"
            } else {
                System.out.println("Contiene una x");
            }
            if (cadena.length() > 10) // c) Si tiene más de 10 posiciones
            {
                System.out.println("La cadena tiene más de 10 posiciones");
                if (pos <= 4) {
                    System.out.println("No contiene una x antes de la 4 posición ");
                } else {// d)Si aparece el carácter x a partir de la 4 posición.
                    System.out.println("Contiene una x después de la 4 posición " + pos);
                }
                String trozo = cadena.substring(0, 5); //e)cadena con las 5 primeras posiciones
                System.out.println(trozo);
                String LastChar = cadena.substring(cadena.length() - 5);
                System.out.println(LastChar); // f)cadena con las 5 últimas posiciones

            }
        }
    }
}
