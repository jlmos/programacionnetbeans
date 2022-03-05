/*Ejercicio de fechas, usando las clases de java con la funcionalidad: introducir
una fecha y mostrar el día de la semana que le corresponde
autor: jose luis mosquera losada
fecha: 31-12-2021*/
package JLMLt06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class JLMLt06e09e {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una fecha (dd/MM/yyyy): ");
        String fechaString = scanner.nextLine();
        LocalDate fecha = LocalDate.parse(fechaString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Dia de la semana: " + fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));

    }
}
