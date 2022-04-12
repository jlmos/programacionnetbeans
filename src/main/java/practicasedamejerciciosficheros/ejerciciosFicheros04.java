/*
 
 */
package practicasedamejerciciosficheros;

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
