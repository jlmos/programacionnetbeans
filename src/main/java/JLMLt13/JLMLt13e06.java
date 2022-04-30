/*Crear una función leerEntero(int max, int min) que solicite al usuario la entrada de un número
entero y que valide que es un valor entero y que está comprendido entre los parámetros max y min
(esto es, mayor o igual que min y menor o igual que max). El usuario deberá repetir la entrada de
datos hasta que lo haga bien, devolviendo finalmente la función el valor introducido y validado.
autor: jose luis mosquera losada
fecha: 12-04-2022 */

package JLMLt13;

import java.util.InputMismatchException;
import java.util.Scanner;


public class JLMLt13e06 {

    
    public static void main(String[] args) {
        int entero = leerEntero(1, 10);
        System.out.println("El numero esta en rango: " + entero);
    }

    public static int leerEntero(int min, int max) {
        System.out.print("Introduce un número: ");
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
            return leerEntero(min, max);
        } catch (InputMismatchException ime) {
            System.out.println("Caracter introducido no es un entero. Vuelve a intentarlo");
            return leerEntero(min, max);
        }
    }
}
