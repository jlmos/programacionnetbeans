/* introducir un número decimal y lo convierta a un string hexadecimal.
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e13 {
// no entra en el examen.
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int entrada = teclado.nextInt();
        String cifraSalida = "0123456789abcdef";
        String salida="";
        int dividendo = entrada;
        while (dividendo > 0) {
            int cociente = dividendo / 16;
            int resto = dividendo % 16;
            salida = cifraSalida.charAt(resto) + salida;
            dividendo = cociente;

        } System.out.println("La conversion en hexadecimal es: " + salida);

    }
}
