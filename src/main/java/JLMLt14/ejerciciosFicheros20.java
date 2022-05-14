/* Realizar un programa que solicite a un usuario tres valores: el coste de establecimiento
de llamada de los móviles de prepago, el coste por MB de cosumo de datos y el coste por 
minuto de llamada. A cotinuación, se construirá un fichero de tipo Properties con los parámetros
introducidos. 
autor: jose luis mosquera losada
fecha: 13-04-2022 */
package JLMLt14;

import JLMLt08.MovilPrepago;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class ejerciciosFicheros20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<MovilPrepago> moviles = new ArrayList<>();
        float costeEstablecimientoLlamada=0;
        float costeMinutoLlamada=0;
        float costeConsumoDatos=0;

        Properties config = new Properties();
        try { config.load(new FileInputStream("archivos/config.props"));
            costeEstablecimientoLlamada = Float.parseFloat(config.getProperty("CosteEstablecimientoLlamada"));
            costeMinutoLlamada = Float.parseFloat(config.getProperty("CosteMinutoLlamada"));
            costeConsumoDatos = Float.parseFloat(config.getProperty("CosteConsumoDatos"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        for (int i=0; i<5; i++) {
            System.out.printf("Introduce un número de teléfono (%d/5):", i+1);
            long numero = scanner.nextLong();
            MovilPrepago movilPrepago = new MovilPrepago(numero, costeEstablecimientoLlamada, costeMinutoLlamada, costeConsumoDatos, 0);
            moviles.add(movilPrepago);
        }

        System.out.println();
        System.out.println("Los móviles han sido creados correctamente:");
        moviles.forEach(movilPrepago -> System.out.println(movilPrepago));

    }
}