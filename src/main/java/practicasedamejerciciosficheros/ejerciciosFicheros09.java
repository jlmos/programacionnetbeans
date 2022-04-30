/*Hacer una versión del programa anterior, pero creando un fichero alumnos.txt que, en vez de
estar separado por punto y coma, cada columna ocupa un ancho ficho. El nombre ocupará 100
caracteres (alineado a la izquierda, con espacios en blanco a la derecha hasta completar los 100
caracteres, la fecha de nacimiento tendrá formato AAAAMMDD y las notas ocuparán 2 posiciones
enteras, coma y dos posiciones decimales. 
autor: jose luis mosquera losada
fecha: 13-04-2022 */

package practicasedamejerciciosficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ejerciciosFicheros09 {

    public static void main(String[] args) {
        String nombre = "";
        LocalDate fecha;
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("yyyyMMdd");
        float nota1, nota2, nota3;

        Scanner teclado = new Scanner(System.in, "ISO-8859-1");
        File f = new File("archivos" + File.separator + "alumnos.txt");
        try (FileWriter fw = new FileWriter(f, false);
                BufferedWriter bfw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bfw)) {
            while (!nombre.equals("Z")) {
                System.out.println("Introduce una nombre ('Z' para acabar): ");
                nombre = teclado.nextLine();
                if (!nombre.equals("Z")) {
                    System.out.println("Introduce una fecha AAAAMMDD:");
                    fecha = LocalDate.parse(teclado.nextLine(), formato);
                    System.out.println("Introduce la nota de la primera evaluación:");
                    nota1 = teclado.nextFloat();
                    System.out.println("Introduce la nota de la segunda evaluación:");
                    nota2 = teclado.nextFloat();
                    System.out.println("Introduce la nota de la tercera evaluación:");
                    nota3 = teclado.nextFloat();
                    teclado.nextLine();                  
                    pw.printf ("%-50s %-20s %-10.2f %-10.2f %-10.2f%n",nombre,fecha.format(formato),nota1,nota2,nota3);
                }
            }
        } catch (IOException ex) {
            System.err.printf("Error:%s", ex.getMessage());
        }

    }
}
