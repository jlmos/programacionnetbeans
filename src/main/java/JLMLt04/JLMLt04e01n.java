/* introducir una cadena por teclado y haga los 8 siguientes apartados señalados
con sus respectivas letras: decir si la 1era posición de la cadena es '=' a la última
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e01n {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un texto:");
        String cadena = teclado.nextLine();
        char primero = cadena.charAt(0);
        char ultimo = cadena.charAt(cadena.length() - 1);
        String subcadena2 = cadena.substring(1, cadena.length() - 1);
        //fallo en la introducción de los parámetros.Faltaba el 1 antes de cadena.length()-1)
        String subcadena = ultimo + subcadena2 + primero;
        System.out.println(subcadena);

    }
}

//System.out.println(cadena.charAt(0));
//System.out.println(cadena.charAt);
/*String primeraLetra=cadena.substring(0,1); 
        String LastChar = cadena.substring(cadena.length()-1);
        String Subcadena=;
        System.out.println(LastChar+Subcadena+primeraLetra);*/
//Fundamentales los parámetros);

/*String primeraLetra = cadena.substring(0, 1);
        String LastChar = cadena.substring(cadena.length() - 1);
        String replace = cadena.replaceAll(primeraLetra,LastChar); 
        System.out.println(replace);*/
