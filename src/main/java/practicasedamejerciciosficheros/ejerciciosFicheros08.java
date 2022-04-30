/*Realizar un programa que escriba distintas líneas de texto en un fichero llamado alumnos.csv,
que contenga en cada línea: nombre del alumno, fecha de nacimiento, y notas de las tres
evaluaciones (con dos decimales). Cada uno de los campos estará separado por un punto y coma. El
programa finalizará cuando se introduzca ‘Z’ como nombre de alumno.
autor: jose luis mosquera losada
fecha: 13-04-2022 */
package practicasedamejerciciosficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ejerciciosFicheros08 {

    public static void main(String[] args) {
        String nombre = "";
        String fecha;
        float nota1, nota2, nota3;

        Scanner teclado = new Scanner(System.in, "ISO-8859-1");
        File f = new File("archivos" + File.separator + "alumnos.csv");
        try (FileWriter fw = new FileWriter(f, false);
                BufferedWriter bfw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bfw)) {
            while (!nombre.equals("Z")) {
                System.out.println("Introduce una nombre ('Z' para acabar): ");
                nombre = teclado.nextLine();
                if (!nombre.equals("Z")) {
                    System.out.println("Introduce una fecha AAAA-MM-DD");
                    fecha = teclado.nextLine();
                    System.out.println("Introduce la nota de la primera evaluación");
                    nota1 = teclado.nextFloat();
                    System.out.println("Introduce la nota de la segunda evaluación");
                    nota2 = teclado.nextFloat();
                    System.out.println("Introduce la nota de la tercera evaluación");
                    nota3 = teclado.nextFloat();
                    teclado.nextLine();                  
                    pw.printf ("%s;%s;%.2f;%.2f;%.2f%n",nombre,fecha,nota1,nota2,nota3);
                }
            }
        } catch (IOException ex) {
            System.err.printf("Error:%s", ex.getMessage());
        }

    }
}
