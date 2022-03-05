/*Clase HabitacionSuite 
autor: jose luis mosquera losada
fecha: 14-02-2022*/
package JLMLt10;


import java.time.LocalDate;
import java.time.Month;

import static java.time.temporal.ChronoUnit.DAYS;

public class HabitacionSuite extends Habitacion {

    public HabitacionSuite(int numero) {
        super(numero);
    }

    @Override
    public double checkOut(LocalDate fechaSalida) {
        long dias = DAYS.between(getFechaEntrada(), fechaSalida);
        boolean estanciaLarga = dias >= 10;
        double total = dias * 200;
        if(estanciaLarga) total *= 0.80;
        return total;
    }
}
