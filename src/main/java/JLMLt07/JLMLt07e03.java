/*idem que el 7.2 pero que en la parte 'a' garantice que no hay temperaturas 
repetidasautor: jose luis mosquera losada
fecha: 14-1-2022 */
package JLMLt07;

import java.util.Arrays;

public class JLMLt07e03 {

    public static void main(String[] args) {
        TemperaturaMeses temperaturaMeses = new TemperaturaMeses();
        temperaturaMeses.llenarArrayAleatorioSinDuplicados();
        temperaturaMeses.mostrarArray();
        System.out.println("Temperaturas duplicadas: " + temperaturaMeses.temperaturasDuplicadas());
    }

}
