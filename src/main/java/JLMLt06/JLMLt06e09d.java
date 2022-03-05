/*Ejercicio de fechas, usando las clases de java con la funcionalidad: Cuántos años
bisiestos ha habido desde el año 1dC
autor: jose luis mosquera losada
fecha: 30-12-2021*/
package JLMLt06;

import java.time.LocalDate;

public class JLMLt06e09d {

    public static void main(String[] args) {

        int contadorBisiestos = 0;

        for(int i=1; i <=LocalDate.now().getYear(); i++) {
            if(LocalDate.of(i, 1, 1).isLeapYear()) {
                contadorBisiestos++;
            }
        }

        System.out.println("Cantidad de años bisiestos: " + contadorBisiestos);

    }
}
