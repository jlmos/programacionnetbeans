/*Ejercicio de fechas, usando las clases de java con la funcionalidad: introducir
dos horas de reloj y nos dé la diferencia entre ambas en segundos
autor: jose luis mosquera losada
fecha: 30-12-2021*/
package JLMLt06;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.time.temporal.ChronoUnit.SECONDS;

public class JLMLt06e09c {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Leer y convertir primera hora
        System.out.print("Introduce la primera hora (HH:mm:ss): ");
        String stringHora1 = scanner.nextLine();
        LocalTime hora1 = LocalTime.parse(stringHora1, timeFormatter);

        // Leer y convertir segunda hora
        System.out.print("Introduce la segunda hora (HH:mm:ss): ");
        String stringHora2 = scanner.nextLine();
        LocalTime hora2 = LocalTime.parse(stringHora2, timeFormatter);

        // Calcular intervalo
        long intervaloSegundos = SECONDS.between(hora1, hora2);
        System.out.println("Hay un intervalo de " + intervaloSegundos + " segundos");

    }
}
