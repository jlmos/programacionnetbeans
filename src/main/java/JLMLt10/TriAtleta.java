/* Desarrolla una clase Delfín que implemente las tres interfaces,con los criterios
que consideremos (valores aleatorios entre mínimos y máx, parámetros como edad, sexo..)
autor: jose luis mosquera losada
fecha: 11-02-2022 */

package JLMLt10;

import java.util.Random;

public class TriAtleta implements Ciclista, Nadador, Saltador {

    private int edad;
    private boolean hombre;

    public TriAtleta(int edad, boolean hombre) {
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
}
