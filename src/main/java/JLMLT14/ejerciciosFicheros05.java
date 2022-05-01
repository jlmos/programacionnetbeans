/*Haz una versión del programa anterior, que compruebe previamente si el fichero fich04.txt
existe o no. En caso afirmativo hará una copia del archivo como fich04.bak y seguirá añadiendo las
líneas sobre fich04.txt . 
autor: jose luis mosquera losada
fecha: 13-04-2022 */

package JLMLT14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class ejerciciosFicheros05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1");
        File f = new File("archivos" + File.separator + "fich04.txt");
        try {
            if (f.exists()) {
                File b = new File("archivos" + File.separator + "fich04.back");
                if (b.exists()) {
                    b.delete();
                }
                Files.copy(f.toPath(), b.toPath());
            }
        } catch (IOException ex) { 
            System.err.printf("Error:%s", ex.getMessage());
        }

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
