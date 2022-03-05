/*Ejercicio de fechas, usando las clases de java con la funcionalidad: introducir
una fecha y un número de días y calcule la fecha que se obtiene al incrementar
dichos días a la fecha
autor: jose luis mosquera losada
fecha: 28-12-2021*/
package JLMLt06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JLMLt06e09b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Introduce una fecha (dd/MM/yyyy): ");
        String cadenaFecha = scanner.nextLine();
        LocalDate fecha = LocalDate.parse(cadenaFecha, formatoFecha);

        System.out.print("Introduce un número de días a incrementar: ");
        int incremento = scanner.nextInt();

        LocalDate fechaIncrementada = fecha.plusDays(incremento);
        System.out.println("Fecha incrementada: " + fechaIncrementada.format(formatoFecha));

    }
}
