/*Ejercicio de fechas, usando las clases de java con la funcionalidad: introducir
un tipo de producto, la fecha de compra y que informe si se puede devolver a día
de hoy o no (los plazos de devolución son respectivamente 5 horas, 6 meses y 15 días
autor: jose luis mosquera losada
fecha: 03-01-2022*/
package JLMLt06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JLMLt06e09f {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.print("Introduce la fecha y hora de la compra (dd/MM/yyyy HH:mm:ss):");
        String fechaCompraString = scanner.nextLine();
        LocalDateTime fechaCompra = LocalDateTime.parse(fechaCompraString, dateTimeFormatter);

        System.out.println("Elige el tipo de producto para su devolución (1, 2 o 3):");
        System.out.println("1 - Perecedero");
        System.out.println("2 - Electrónica");
        System.out.println("3 - Ropa");
        int eleccion = scanner.nextInt();

        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime topeDevolucion = null;

        switch (eleccion) {
            case 1:
                topeDevolucion = fechaCompra.plusHours(5);
                break;
            case 2:
                topeDevolucion = fechaCompra.plusMonths(6);
                break;
            case 3:
                topeDevolucion = fechaCompra.plusDays(15);
                break;
        }

        if (topeDevolucion.isBefore(ahora)) {
            System.out.print("No se puede devolver. La fecha máxima era: ");
            System.out.println(topeDevolucion.format(dateTimeFormatter));
        } else {
            System.out.println("Se puede devolver");

        }
    }
}
