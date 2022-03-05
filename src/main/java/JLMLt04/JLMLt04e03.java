/* introducir una cadena por teclado y haga los 8 siguientes apartados señalados
con sus respectivas letras: decir cuantos dígitos numéricos hay en una cadena
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un texto:");
        String cadena = teclado.nextLine();
        System.out.print("Introduzca un caracter:");
        char caracter = teclado.next().charAt(0);
        int contador=0;
        for (int i=0;i<cadena.length();i++){
        if (cadena.charAt(i)==caracter)
            contador++;
        }
           System.out.println("El número de veces del caracter introducido: '"+caracter+"' es: " +contador);
    }
    } 
// i < que recorrer toda la cadena

