/*Realizar un programa que lea el fichero fich04.txt línea a línea y lo muestre por pantalla, con
el texto en mayúscula. Usar FileReader, try-with-resources y buffers. 
autor: jose luis mosquera losada
fecha: 13-04-2022 */

package practicasedamejerciciosficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ejerciciosFicheros06 {

    public static void main(String[] args) {
        File f = new File("archivos" + File.separator + "fich04.txt");
        String cadena;
        try (FileReader fr = new FileReader(f);
                BufferedReader bfr = new BufferedReader(fr)) {
            while ((cadena = bfr.readLine()) != null) {
                System.out.printf("%s%n", cadena.toUpperCase());

            }
        } catch (IOException ex) {
            System.err.printf("Error:%s\n", ex.getMessage());
        }
    }
}
