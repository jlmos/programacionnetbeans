/*Realizar la función llamada par() que se le pasa un entero y devuelve true si
es par y false si no lo es.
autor: jose luis mosquera losada
fecha: 14-11-2021  
 */
package JLMLt05;

import java.util.Scanner;

public class JLMLt05e01a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        //Leemos por el teclado un numero entero
        System.out.print("Introduzca un numero: ");
        numero = teclado.nextInt();
        //Si la funcion devuelve true se ejecuta el if, sino el else
        if (esPar(numero)) {
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("El numero " + numero + " es impar.");
        }
    }

    public static boolean esPar(int numero) {
        //Si el resto de numero entre 2 es 0, el numero es par
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
