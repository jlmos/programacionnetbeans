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
