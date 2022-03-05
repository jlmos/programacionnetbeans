/*Programa con un Arrat de 12 filas y 30 columnas llamado temperaturaDia con las 
temperaturas medias de un lugar en cada uno de los días del año (meses de 30 días)
Valores enteros positivos o negativos. Programa con funciones para realizar las 
siguientes tareas: 
a) llenar valores al azar para el Array con valores según estación.
b) Mostrar por pantalla el contenido del Array en forma de tabla.
c) Mostrar temperatura media del año d) Temperatura media de cada mes.
e) Array unidemensional con la temperatura mínima de cada mes.
autor: jose luis mosquera losada
fecha: 15-1-2022*/
package JLMLt07;

import java.time.Month;
import java.util.Random;

public class JLMLt07e10 {

    static int[][] temperaturaDia = new int[12][30];

    public static void main(String[] args) {

        llenarArray(temperaturaDia);
        mostrarArray();
        System.out.println("--------------------------------------");
        System.out.println("Media año: " + media(temperaturaDia));
        System.out.println("Media por mes: ");
        for (int i = 0; i < temperaturaDia.length; i++) {
            System.out.printf("%s: %f\n", Month.of(i + 1), media(temperaturaDia[i]));
        }

    }
 
    public static void llenarArray(int[][] array) {
        llenarMes(array[0], -10, 20);
        llenarMes(array[1], -10, 20);
        llenarMes(array[2], -10, 20);
        llenarMes(array[3], 10, 35);
        llenarMes(array[4], 10, 35);
        llenarMes(array[5], 10, 35);
        llenarMes(array[6], 10, 35);
        llenarMes(array[7], 10, 35);
        llenarMes(array[8], 10, 35);
        llenarMes(array[9], 10, 35);
        llenarMes(array[10], -10, 20);
        llenarMes(array[11], -10, 20);
    }

    public static void llenarMes(int[] mes, int tempDesde, int tempHasta) {
        for (int i = 0; i < 30; i++) {
            mes[i] = new Random().nextInt(tempHasta + 1 - tempDesde) + tempDesde;
        }
    }

    public static void mostrarArray() {
        for (int i = 0; i < temperaturaDia.length; i++) {
            System.out.printf("%10s | ", Month.of(i + 1));
            for (int j = 0; j < temperaturaDia[0].length; j++) {
                String signo = temperaturaDia[i][j] < 0 ? "-" : "";
                System.out.printf(" %1s%2d |", signo, Math.abs(temperaturaDia[i][j])); // añado margen de un espacio a cada lado y una barra para mejorar legibilidad
            }
            System.out.println();
        }
    }

    public static double media(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma / (double) array.length;
    }

    public static double media(int[][] array) {
        int suma = 0;
        int elementos = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                suma += array[i][j];
                elementos++;
            }
        }
        return suma / (double) elementos;
    }

}
