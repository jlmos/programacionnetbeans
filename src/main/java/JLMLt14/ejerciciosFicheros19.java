/* Realizar un programa que solicite a un usuario tres valores: el coste de establecimiento
de llamada de los móviles de prepago, el coste por MB de cosumo de datos y el coste por 
minuto de llamada. A cotinuación, se construirá un fichero de tipo Properties con los parámetros
introducidos. 
autor: jose luis mosquera losada
fecha: 13-04-2022 */
package JLMLt14;

import java.io.FileOutputStream;
import java.io.IOException;
import static java.time.LocalDate.parse;
import java.util.Properties;

public class ejerciciosFicheros19 {

    public static void main(String[] args) {
        Double costeEstablecimientoLlamada = 1.2;
        Double costeConsumoDatos = 0.3;
        Double costeMinutoLlamada = 0.2;

        Properties config = new Properties(); //(import.java.util.*)
        config.setProperty("CosteEstablecimientoLlamada", String.valueOf(costeEstablecimientoLlamada));
        config.setProperty("CosteConsumoDatos", String.valueOf(costeConsumoDatos));
        config.setProperty("CosteMinutoLlamada", String.valueOf(costeMinutoLlamada));
        try {
            config.store(new FileOutputStream("archivos/config.props"), "Fichero de config.");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
