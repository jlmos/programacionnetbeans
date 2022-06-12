/*Escribe un programa que solicite al usuario que introduzca una cadena y verifique, mediante
expresiones regulares, si la cadena se corresponde con:
a) Una matrícula de coche (4 dígitos y 3 letras mayúsculas).
b) Un número binario de una o más posiciones.
c) Un número hexadecimal de entre 5 y 8 posiciones.
d) Una fecha en formato YYYY-MM-DD (solo formato, no valida días del mes).
e) Como el anterior, pero admite también que el día o el mes esté en un solo dígito.
f) Un nombre de usuario en twitter, empieza por @ y puede contener letras mayúsculas
y minúsculas, números, guiones y guiones bajos (entre 2 y 15 caracteres)
autor: jose luis mosquera losada
fecha: 08-06-2022 */

package JLMLt16;

import java.util.Scanner;
import java.util.regex.Pattern;


public class JLMLt16e05 {

   
    public static void main(String[] args) {
    String entrada;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        String matricula = "\\d{4}[B-DF-HJ-NP-TV-Z]{3}";
        String binario = "[0-1]{1,}";
        String hexadecimal = "(\\d|[A-F]){5,8}";
        String fecha = "\\d{4}-\\d{2}-\\d{2}";
        String fechaB = "\\d{4}-\\d{1,2}-\\d{1,2}";
        String twitter = "@([A-Z]|[a-z]|\\d|-|_){2,15}";
        
        try {
            while (!salir) {
                System.out.println("Introducir una cadena: ");
                entrada = teclado.nextLine();
                if (Pattern.matches(matricula, entrada)) {
                    System.out.println("La cadena es una matricula");
                } else if (Pattern.matches(binario, entrada)) {
                    System.out.println("La cadena es un numero binario");
                } else if (Pattern.matches(hexadecimal, entrada)) {
                    System.out.println("La cadena es un numero hexadecimal");
                } else if (Pattern.matches(fecha, entrada)|| Pattern.matches(fechaB, entrada)) {
                    System.out.println("La cadena es una fecha");
                } else if (Pattern.matches(twitter, entrada)) {
                    System.out.println("Usuario de Twitter");
                } else{
                    System.out.println("el formato no es válido"); 
                }
                System.out.println("Desea continuar si/no: ");
                entrada = teclado.nextLine();
                if (entrada.equals("no")) {
                    salir = true;
                }
            }

        } catch (Exception e) {
            System.out.println("Opcion no valida");
        }

    }

}

