/* introducir una cadena y convertir a StringBuilder y hacer los solicitados .
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e14b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un texto:");
        String cadena = teclado.nextLine();
        StringBuilder sb = new StringBuilder(cadena);
        sb.delete(5, 10); //borrar entre la 5 y la 10
        sb.reverse();//darle la vuelta a todos los caracteres
        cadena = sb.toString();
        System.out.println(cadena);

    }
}
