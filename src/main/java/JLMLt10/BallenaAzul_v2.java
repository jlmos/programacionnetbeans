/* Desarrolla una clase BallenaAzul_v2 que implemente la interfaz Nadador. El tiempo en 
recorrer una distancia es de 10Km/h para las mayores de 5 años y 13Km/h par alas menores.
autor: jose luis mosquera losada
fecha: 11-02-2022 */
package JLMLt10;

public class BallenaAzul_v2 implements Nadador {

    private int edad;

    public BallenaAzul_v2 (int edad) {
        this.edad = edad;
    }

    @Override
    public int nadar(int metros) {
        int velocidadKMH = 0;
        if(edad >= 5) {
            velocidadKMH = 10;
        } else {
            velocidadKMH = 13;
        }
        double velocidadMS = velocidadKMH / 3.6; // Transformo velocidad a m/s
        return (int) (metros / velocidadMS);
    }
}
