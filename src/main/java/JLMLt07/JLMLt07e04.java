/* Program similar a los anteriores pero que realice: llenar el Array con valores
al azar para todos los meses. Para enero, febrero, marzo, noviembre y diciembre
los valores estarán comprendidos entre -10 y +20 para el resto entre +10 y +40.
Mostrar por pantalla el contenido del array con el nombre de los meses(usar clases
java). Mostrar la temperatura máxima del año, usando printf especificando en el 
formato que incluya el sigon "+" en temperaturas positivas y que solo muestren
1 decimal. Mostrar el nombre del mes más frío y que solo muestre 1 decimal.
Mostrar el nombre del mes más frío del año. Para hacer pruebas estadísticas, 
desplazar los valores a la derecha, pasando el último al primero. 
autor: jose luis mosquera losada
fecha: 14-1-2022*/

package JLMLt07;

import java.util.Arrays;

public class JLMLt07e04 {

    public static void main(String[] args) {
        TemperaturaMeses temperaturaMeses = new TemperaturaMeses();
        temperaturaMeses.llenarArrayEj4();
        temperaturaMeses.mostrarArrayConNombresMeses();
        temperaturaMeses.mostrarTemperaturaMaxima();
        System.out.println("Mes más frio: " + temperaturaMeses.mesMasFrio());
        System.out.println("Valores desplazados: " + Arrays.toString(temperaturaMeses.obtenerValoresDesplazados()));
    }

}
