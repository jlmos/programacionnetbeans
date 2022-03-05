/*Ejercicio de fechas, usando las clases de java con la funcionalidad: introducir
fecha de nacimiento y mostrar cuantos días han pasado hasta ahora mismo. 
autor: jose luis mosquera losada
fecha: 28-12-2021*/
package JLMLt06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.DAYS;

public class JLMLt06e09a {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu fecha de nacimiento (dd/MM/yyyy): ");
        String cadenaFecha = scanner.nextLine();
        LocalDate fecha = LocalDate.parse(cadenaFecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        long dias = DAYS.between(fecha, LocalDate.now());
        System.out.println("Han pasado " + dias + " días");

    }
}
