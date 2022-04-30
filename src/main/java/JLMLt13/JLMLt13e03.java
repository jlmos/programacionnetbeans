/*Hacer un programa que solicite al usuario dos números enteros y los intente dividir (división
entera, sin decimales). Si se produce algún error el programa no finalizará de forma abrupta si no
que capturará la excepción ocurrida: o bien entrada de valores incorrectos o bien por división por
cero, informando al usuario de lo que ha acontecido. Finalmente, mostrará el resultado de la división,
que será cero en caso de cualquiera de los dos errores posibles.
autor: jose luis mosquera losada
fecha: 12-04-2022*/

package JLMLt13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JLMLt13e03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Introduce un número entero: ");
            int entero1 = scanner.nextInt();

            System.out.print("Introduce otro número entero: ");
            int entero2 = scanner.nextInt();

            int resultado = entero1 / entero2;
            System.out.println("Resultado = " + resultado);

        } catch (ArithmeticException ae) {
            System.out.println("Resultado = 0");
        } catch (InputMismatchException ime) {
            System.out.println("Resultado = 0");
        }

    }


}
