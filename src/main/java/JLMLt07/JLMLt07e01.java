/* Realizar un programa que tenga definido un Arrayy como variable global llamado 
TemperaturaMeses, de 12 enteros, con las temperaturas medias de un lugar en cada 
uno de los meses del año. Serán valores negativos o positivos. El programa tendrá
diferentes funciones que realicen tareas como llenar el Array con valores al azar
para todos los meses (entre 0 y 40), mostrar el contenido del Array y mostrar por
pantalla el contenido del Array en orden inverso
autor: jose luis mosquera losada
fecha: 11-1-2022*/
package JLMLt07;

import java.util.Arrays;
import java.util.Random;

public class JLMLt07e01 {

    public static void main(String[] args) {
        TemperaturaMeses temperaturaMeses = new TemperaturaMeses();
        temperaturaMeses.mostrarArray();
        temperaturaMeses.llenarArrayAleatorio();
        temperaturaMeses.mostrarArray();
        temperaturaMeses.mostrarArrayOrdenInverso();
    }

}
