/*Realizar un programa que escriba distintas líneas con un texto cualquiera (con eñes
y acentos) en un fichero llamado fich01.txt, usando la clase FileWriter y buffers. El fichero estará
almacenado en la carpeta archivos creada previamente. No emplees la estructura try-with-resources
por lo que deberás hacer close() explícito del BufferedWriter dentro un try-catch.
autor: jose luis mosquera losada
fecha: 13-04-2022 */
package JLMLt14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ejercicioFicheros01 {

    public static void main(String[] args) {
        BufferedWriter bfw = null;
        try {
            File f = new File("archivos" + File.separator + "fich01.txt");
            FileWriter fw = new FileWriter(f);
            bfw = new BufferedWriter(fw);
            bfw.write("La niñera cuidará del niño");
            bfw.newLine();
            bfw.write("Esto será otro niño con otro niñero");
            bfw.write(" que se escribirá en la misma línea");
        } catch (IOException ex) {
            System.err.printf("Error:%s ", ex.getMessage());
        } finally {
            try {
                if (bfw != null) {
                    bfw.close();
                }
            } catch (IOException e) {
                System.err.printf("Error:%s", e.getMessage());
            }
        }

    }
}
