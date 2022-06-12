/*Escribe un programa que solicite al usuario que introduzca un email y que extraiga el nombre
del usuario (lo que hay antes de la arroba) y el TLD (el dominio de nivel superior, lo que va después
del punto).
autor: jose luis mosquera losada
fecha: 08-06-2022 */

package JLMLt16;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JLMLt16e06 {

   
    public static void main(String[] args) {
    String cadena;
        String email ="[a-zA-Z]{2,}@[a-zA-Z]{2,}.es";
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        Pattern patron = Pattern.compile("([a-zA-Z]{2,})@([a-zA-Z]{2,}).es");
        Matcher matcher;
        
        try {
            while (!salir) {
                System.out.println("Introduce una cadena: ");
                cadena = teclado.nextLine();
                matcher = patron.matcher(cadena);
                if (Pattern.matches(email, cadena)) {
                    matcher.find();
                    System.out.println("El TLD es: " + matcher.group(2)); 
                } else {
                    System.out.println("La cadena no es un email");
                } 
                System.out.println("Desea continuar si/no: ");
                cadena = teclado.nextLine();
                if (cadena.equals("no")) {
                    salir = true;
                }
            }
        } catch (Exception e) {
            System.out.println("Opcion no valida");
        }

    }

}


