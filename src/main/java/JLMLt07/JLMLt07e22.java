/*Programa que cree un ArrayList con 10.000 números aleatorios entre 1 y 6, ultilizando los métodos estáticos
de la clase Collections y en otro ArrayList guarda la distribución de resultados obtenidos (veces que sale el 1,2..)
y muestra su contenido. Tb con Collections mostrar la diferencia de veces entre el número que más ha salido y el que menos.3autor: jose luis mosquera losada
fecha: 13-1-2022 */

package JLMLt07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class JLMLt07e22 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            numeros.add(new Random().nextInt(6) + 1);
        }
        System.out.println("Números: " + numeros);

        ArrayList<Integer> frecuencias = new ArrayList<>();
        frecuencias.add(Collections.frequency(numeros, 1));
        frecuencias.add(Collections.frequency(numeros, 2));
        frecuencias.add(Collections.frequency(numeros, 3));
        frecuencias.add(Collections.frequency(numeros, 4));
        frecuencias.add(Collections.frequency(numeros, 5));
        frecuencias.add(Collections.frequency(numeros, 6));
        System.out.println("Frecuencias: " + frecuencias);

        int frecMinima = Collections.min(frecuencias);
        int frecMaxima = Collections.max(frecuencias);
        System.out.println("Diferencia máxima entre frecuencias: " + (frecMaxima - frecMinima));

    }

}
