/*Hacer una versión del programa anterior, pero en la que se le indique al fichero que está con
codificación ISO-8859-1. Obtiene un fichero llamado fich03.txt
autor: jose luis mosquera losada
fecha: 13-04-2022*/
package JLMLT14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ejerciciosFicheros03 {

    public static void main(String[] args) {
        
        File f = new File("archivos" + File.separator + "fich03.txt");
        try (FileOutputStream fos = new FileOutputStream(f, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter bfw = new BufferedWriter(osw)){             
                       
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
