/* Desarrolla una clase Delfín que implemente la interfaz Nadador. El tiempo en 
recorrer una distancia es aleatorio entre 40Km/h y 70Km/h.
autor: jose luis mosquera losada
fecha: 11-02-2022 */
package JLMLt10;

import java.util.Random;

public class Delfin implements Nadador {

    @Override
    public int nadar(int metros) {
        int velocidadKMH = new Random().nextInt(30)+ 40; // Velocidad aleatoria km/h
        double velocidadMS = velocidadKMH / 3.6; // Transformo velocidad a m/s
        return (int) (metros / velocidadMS);
    }

}
