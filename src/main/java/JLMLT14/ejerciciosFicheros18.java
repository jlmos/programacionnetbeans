/* Realiza un programa que lea un archivo como el del ejercicio anterior y muestre 
por pantalla su contenido. Además, introducirá los objetos leídos en un ArrayList
de tipo Trabajadores_v2.
autor: jose luis mosquera losada
fecha: 13-04-2022
*/

package JLMLt14;


import java.io.*;
import java.util.ArrayList;

public class ejerciciosFicheros18 {

    public static void main(String[] args) {
        
        File file = new File("archivos" + File.separator + "fich17.dat");
        boolean eof = false;
        ArrayList<Trabajador_v2> trabajadores = new ArrayList<>();

        try( FileInputStream fis = new FileInputStream(file);
             BufferedInputStream bufis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bufis)){
            while(!eof) {
                Trabajador_v2 trabajador = (Trabajador_v2) ois.readObject();
                trabajadores.add(trabajador);
            }
            } catch (EOFException e) {
                eof = true;
            } catch (IOException ex) { System.err.println("Error:"+ ex.getMessage()); } catch (
                ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Trabajador_v2 trabajador : trabajadores) {
            System.out.println(trabajador);
        }
    }



}
