/*Hacer un programa que tenga definido un Array de 7 posiciones de double que representa la
temperatura media en una ciudad durante una semana (puedes generar valores al azar entre 0 y 40
para llenarlo). Se le solicitará al usuario que introduzca dos posiciones, y calculará la temperatura
media entre esos días del año. Si los valores introducidos no son válidos, por estar fuera de los límites
del array se capturará la excepción y la media será cero.
autor: jose luis mosquera losada
fecha: 12-04-2022*/

package JLMLt13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JLMLt13e04 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        double decimales[] = new double[7];

        // Llenar array
        for (int i = 0; i < decimales.length; i++) {
            decimales[i] = 40 * random.nextDouble();
        }
        System.out.println(Arrays.toString(decimales));

        System.out.print("Introduce una posición: ");
        int posicion1 = scanner.nextInt();

        System.out.print("Introduce otra posición: ");
        int posicion2 = scanner.nextInt();

        try {
            double media = (decimales[posicion1] + decimales[posicion2]) / 2;
            System.out.println("Media = " + media);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Media = 0");
        }

    }

}
