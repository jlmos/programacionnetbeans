/*Basándonos en el ejercicio 2 de este capítulo, hay un programa en el usuario introduzca
palabras o frases y se vayan escribiendo como líneas separadas en un fichero llamado fich04.txt. El
programa finaliza cuando el usuario teclee “fin”. Para definir el objeto teclado para introducir texto
especifica la codificación de la consola mediante: Scanner teclado = new Scanner(System.in,
"ISO-8859-1");
autor: jose luis mosquera losada
fecha: 13-04-2022*/

package JLMLT14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ejerciciosFicheros04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in, "ISO-8859-1");
        File f = new File("archivos" + File.separator + "fich04.txt");
        try (FileWriter fw = new FileWriter(f, false);
                BufferedWriter bfw = new BufferedWriter(fw)) {
            System.out.println("Introduce una frase (fin para acabar): ");
            String linea = teclado.nextLine();

            while (!linea.equals("fin")) {
                bfw.write(linea);
                bfw.newLine();
                System.out.println("Introduce una frase (fin para acabar): ");
                linea = teclado.nextLine();
            }
        } catch (IOException ex) {
            System.err.printf("Error:%s", ex.getMessage());
        }
    }

}
