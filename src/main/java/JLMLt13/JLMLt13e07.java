/*Añadir a la función anterior un parámetro de texto que represente el típico mensaje que se le
muestra al usuario antes de introducir un valor. La función hará el System.out.print de ese parámetro
y evitamos que lo tenga que hacer el programa que utiliza la función. Ejemplo:
int edad = leerEntero (“Introduzca su edad”, 0, 120);
ya no hay que hacer antes de la llamada System.out.print (“Introduzca su edad”);
autor: jose luis mosquera losada
fecha: 12-04-2022 */

package JLMLt13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JLMLt13e07 {

    public static void main(String[] args) {
        int entero = leerEntero("Introduce una edad: ", 1, 120);
        System.out.println("El numero esta en rango: " + entero);
    }

    public static int leerEntero(String mensaje, int min, int max) {
        System.out.print(mensaje);
        Scanner teclado = new Scanner(System.in);
        int entero = 0;
        try {
            entero = teclado.nextInt();
            if(entero < min || entero > max) {
                throw new IllegalArgumentException("Número introducido fuera de rango");
            }
            return entero;
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage() + ". Vuelve a intentarlo.");
            return leerEntero(mensaje, min, max);
        } catch (InputMismatchException ime) {
            System.out.println("Caracter introducido no es un entero. Vuelve a intentarlo");
            return leerEntero(mensaje, min, max);
        }
    }

}
