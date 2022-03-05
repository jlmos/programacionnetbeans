/* introducir una cadena y convertir a StringBuilder y hacer los apartados de a-f.
con sus respectivas letras:
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e14 {

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un texto:");
        String cadena= teclado.nextLine();
        
        StringBuilder sb = new StringBuilder(cadena);
        sb.setCharAt(1,'z');// sustituir el caracter de la pos 1 por z
        cadena=sb.toString();
        if (cadena.length() >3){
        sb.deleteCharAt(3);//borrar el caracter 3
        }else System.out.println("Para borrar el caracter en la posición '3' debes introducir una cadena de más de 3 caracteres");
        if (cadena.length() >5){
                sb.insert(5, 'x'); //insertar una x en la pos 5
        }else System.out.println("Para insertar una 'x' en la posición '5' debes introducir una cadena de más de 5 caracteres");
        
        System.out.println(cadena);
        
    }
}
