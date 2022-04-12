/*
 
 */
package practicasedamejerciciosficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ejerciciosFicheros07 {

    public static void main(String[] args) {
        int[] datos = leerFichero("archivos" + File.separator + "fich04.txt");
        System.out.println("Cantidad de caracteres: " + datos[0]);
        System.out.println("Cantidad de palabras: " + datos[1]);
        System.out.println("Cantidad de lineas: " + datos[2]);
    }

    public static int[] leerFichero(String ruta) {
        File f = new File(ruta);
        String cadena;
        int[] resultado = {0, 0, 0};
        try (FileReader fr = new FileReader(f);
                BufferedReader bfr = new BufferedReader(fr)) {
            while ((cadena = bfr.readLine()) != null) {
                resultado[0] += cadena.length();
                resultado[1] += cadena.split("[ .,;?!¡¿]+").length;
                resultado[2]++;
            }
        } catch (IOException ex) {
            System.err.printf("Error:%s\n", ex.getMessage());
        }
        return resultado;
    }
}
