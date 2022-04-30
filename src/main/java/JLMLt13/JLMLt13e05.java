/*Hacer un programa que, desde el main(), solicite al usuario que introduzca tres enteros,
correspondientes a día, mes y año de una fecha. Realiza una función llamada validarFecha() que
reciba esos tres valores e intentar construir una fecha con LocalDate.of devolviendo true si la fecha
es válida o false si la fecha es inválida, es decir si se produce una excepción al construirla.
• En caso de que los valores introducidos no sean enteros, el main() avisará de tal situación
capturando la excepción en tipos de datos incorrectos al hacer el nextInt().
• Si la función no es capaz de crear la fecha porque los valores no se corresponden con valores
válidos, capturará esa excepción. Así pues, habrá un try…catch en el main() y otro en la función.
autor: jose luis mosquera losada
fecha: 12-04-2022*/

package JLMLt13;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JLMLt13e05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce día: ");
            int dia = scanner.nextInt();

            System.out.print("Introduce mes: ");
            int mes = scanner.nextInt();

            System.out.print("Intrduce año: ");
            int anho = scanner.nextInt();

            boolean fechaValida = validarFecha(dia, mes, anho);

            if (fechaValida) {
                System.out.println("Fecha válida");
            } else {
                System.out.println("Fecha inválida");
            }

        } catch (InputMismatchException ime) {
            System.out.println("El parámetro introducido no es de tipo entero");
        }



    }

    public static boolean validarFecha(int dia, int mes, int anho) {
        try {
            LocalDate fecha = LocalDate.of(anho, mes, dia);
            return true;
        } catch (DateTimeException dte) {
            return false;
        }

    }

}
