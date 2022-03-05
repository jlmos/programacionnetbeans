/* hacer una nueva versión de TriAtleta_v2b que implemente saltaPertiga con este criterio:
para saltos de más de 6 metros devuelve false, entre 5 y 6 metros devuelve true la
mitad de las veces y por debajo de 5m devuelve siempre true.
autor: jose luis mosquera losada
fecha: 11-02-2022 */

package JLMLt10;

import java.util.Random;

public class TriAtleta_v2b implements Ciclista_v2, Nadador_v2, Saltador_v2 {

    private int edad;
    private boolean hombre;

    public TriAtleta_v2b(int edad, boolean hombre) {
        this.edad = edad;
        this.hombre = hombre;
    }

    @Override
    public int recorrer(int kilometros, String terreno) {
        double velocidadMS = 0;

        if(edad < 12) {
            velocidadMS = 8;
        } else if (edad >= 12 && edad < 60) {
            velocidadMS = 12;
        } else {
            velocidadMS = 6;
        }

        if (hombre) {
            velocidadMS *= 1.1;
        }

        switch (terreno) {
            case "ascendente": velocidadMS *= 0.5;
            case "descendente": velocidadMS *= 1.5;
        }

        return (int) (kilometros * 1000 / velocidadMS);
    }

    @Override
    public int nadar(int metros) {
        double velocidadMS = 0;

        if(edad < 12) {
            velocidadMS = 3;
        } else if (edad >= 12 && edad < 60) {
            velocidadMS = 5;
        } else {
            velocidadMS = 2;
        }

        return (int) (metros / velocidadMS);
    }

    @Override
    public int saltarAltura() {
        return new Random().nextInt(100) + 50;
    }

    @Override
    public boolean saltaPertiga(int alturaCM) {
        if(alturaCM > 600) {
            return false;
        } else if(alturaCM >= 500 && alturaCM <= 600) {
            return new Random().nextBoolean();
        } else {
            return true;
        }
    }
}
