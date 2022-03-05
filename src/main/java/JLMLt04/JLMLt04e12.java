/* introducir una cadena numérica de 6 posiciones hasta que se cumpla que todos 
son digitos y que no hay repetidos.
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        final int dimension = 6;
        boolean digit, repeat;
        do {
            digit = true;
            repeat = false;
            System.out.print("Introduce cadena numérica sin repetidos de " + dimension + " posciones: ");
            cadena = teclado.nextLine();
            if (cadena.length() == dimension) {
                for (int i = 0; i < dimension; i++) {
                    if (Character.isDigit(cadena.charAt(i)) == false) //flag
                    {
                        digit = false;  //flag
                    } else if (cadena.indexOf(cadena.charAt(i), i + 1) != -1) {
                        repeat = true;
                    }
                }
            }
        } while (cadena.length() != dimension || repeat == true || digit == false);
        System.out.println("La cadena numérica es CORRECTA");

    }
}
// 

