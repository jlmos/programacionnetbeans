/* Realiza un programa que defina una variable de tipo interfaz Set de enteros instanciada 
con HasSet. Crea un bucle de cien mil de iteraciones que añada al conjunto números aleatorios
entre 1 y un millón. con LocalDatetime y ChronoUnit.MILLIS.between mide los milisegundos que le
lleva ejecutar el bucle. A continuación, sobre la misma variable de tipo interfaz, intánciala 
con TreeSet y realiza el mismo proceso. Mide de nuevo el tiempo que le lleva con la nueva clase.
compara los resultados y razona a qué es debido.
autor: jose luis mosquera losada
fecha: 6-06-2022 */

package JLMLt15;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class JLMLt15e19 {

    public static void main(String[] args) {

        Random aleatorio = new Random();
        HashSet<Integer> set;
        set = new HashSet<>();
        TreeSet<Integer> tree;
        tree = new TreeSet<>();
        LocalDateTime setInicio, setFin, treeInicio, treeFin;

        setInicio = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            set.add(aleatorio.nextInt(1000000));
        }
        setFin = LocalDateTime.now();

        treeInicio = LocalDateTime.now();
        for (int i = 0; i < 100000; i++) {
            tree.add(aleatorio.nextInt(1000000));
        }
        treeFin = LocalDateTime.now();

        System.out.println("El HashSet ha tardado: " + ChronoUnit.MILLIS.between(setInicio, setFin));
        System.out.println("El HashSet ha tardado: " + ChronoUnit.MILLIS.between(treeInicio, treeFin));
    }

}
