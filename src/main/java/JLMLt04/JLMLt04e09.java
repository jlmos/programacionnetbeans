/* introducir un nombre completo y una edad por teclado y muestre:
Hola, me llamo xxxxxxxxx y tengo xx años. usar format y System.out.printf.
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su nombre completo:");
        String nombre = teclado.nextLine();
        System.out.print("Introduzca su edad:");
        int edad = teclado.nextInt();
        String resultado;
        resultado = String.format("Hola, me llamo %s y tengo %d años", nombre,edad);
        System.out.println(resultado);
        }
    }
    
// 

