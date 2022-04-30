/*Hacer un programa que solicite al usuario dos números double y los intente sumar. En caso de
que se introduzcan valores que no son enteros, por ejemplo, textos no numéricos, no provocará un
error en tiempo de ejecución, simplemente informará de que se ha producido un error y no mostrará
el resultado de la suma.
autor: jose luis mosquera losada
fecha: 12-04-2022*/
package JLMLt13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JLMLt13e02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Introduce un número decimal: ");
            double decimal1 = scanner.nextDouble();

            System.out.print("Introduce otro número decimal: ");
            double decimal2 = scanner.nextDouble();

            double resultado = decimal1 + decimal2;
            System.out.println("Resultado = " + resultado);
        } catch (InputMismatchException ime) {
            System.out.println("El valor introducido no es de tipo double");
        }



    }
}
