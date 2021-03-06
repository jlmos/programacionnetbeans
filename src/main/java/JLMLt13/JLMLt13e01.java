/* Hacer un programa que solicite dos nºs enteros y los intente dividir (división entera,
sin decimales). Si el denominador es cero, deberá capturar la excepción y decir que el
resultado de la división es cero, sin que el programa pare su ejecución abruptamente.
autor: jose luis mosquera losada
fecha: 12-04-2022*/
package JLMLt13;

import java.util.Scanner;

public class JLMLt13e01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int entero1 = scanner.nextInt();

        System.out.print("Introduce otro número entero: ");
        int entero2 = scanner.nextInt();

        try {
            int resultado = entero1 / entero2;
            System.out.println("Resultado = " + resultado);
        } catch (ArithmeticException ae) {
            System.out.println("No es posible dividir entre 0");
        }

    }
}
