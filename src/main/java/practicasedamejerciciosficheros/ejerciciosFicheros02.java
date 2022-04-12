/*
 
 */
package practicasedamejerciciosficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ejerciciosFicheros02 {

    public static void main(String[] args) {
        File f = new File("archivos" + File.separator + "fich02.txt");
        try (FileWriter fw = new FileWriter(f, false);
                BufferedWriter bfw = new BufferedWriter(fw)) {
            bfw.write("hola");
            bfw.write("ÁÉÍÓÚ");
            bfw.newLine();
            bfw.write("Ññ");
            bfw.newLine();
        } catch (IOException ex) {
            System.err.printf("Error:%s", ex.getMessage());
        }
    }

}