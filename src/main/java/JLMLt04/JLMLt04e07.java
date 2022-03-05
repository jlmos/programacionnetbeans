/* introducir una cadena en MAYUSCULAS y mostrar, por consola, su salida encriptada,
sin tener en cuenta las minúsculas, los números y los espacios en blanco.
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e07 {

    public static void main(String[] args) {
        String encript;
        int i, pos;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el texto para encriptar: ");
        String tex = teclado.nextLine();
        encript = "";
        String letIntrod = "ABCDEFGHIJKLMNÑOPQRSTUVWYZ";
        String letSalida = "ZYWVUTSRQPOÑNMLKJIHGFEDCBA";

        for (i = 0; i < tex.length(); i++) {
            pos = letIntrod.indexOf(tex.charAt(i));
            if (pos != -1) {
                encript = encript + letSalida.charAt(pos);
            } else {
                encript = encript + tex.charAt(i);
            }

        }
        System.out.println(encript);
    }
}

// 

