/* Emplenado las 3 clases definidas en ejercicio anterior (Delfin, BallenaAzul y TriAtleta)
y la interfaz Nadador, hacer un programa con ArrayList de nadadores (poliformismo de interfaces)
con 3 elementos, una de cada tipo. Después recorrer el ArrayList con un bucle for..each, mostrando
cuanto tarda cada uno de ellos en recorrer 1 km.
autor: jose luis mosquera losada
fecha: 11-02-2022 */
package JLMLt10;
import JLMLt10.BallenaAzul;
import JLMLt10.Delfin;
import JLMLt10.Nadador;
import JLMLt10.TriAtleta;

import java.util.ArrayList;

public class JLMLt10e10 {
    
     public static void main(String[] args) {
        ArrayList<Nadador> nadadores = new ArrayList<>();
        nadadores.add(new Delfin());
        nadadores.add(new BallenaAzul(3));
        nadadores.add(new TriAtleta(30, false));

        System.out.println("Tiempo necesario en recorrer 1km:");
        for (Nadador nadador : nadadores) {
            System.out.printf("%s: %d segundos\n", nadador.getClass().getSimpleName(), nadador.nadar(1000));
        }
    }

}
