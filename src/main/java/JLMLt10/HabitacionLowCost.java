/*Clase HabitacionLowCost
autor: jose luis mosquera losada
fecha: 14-02-2022*/
package JLMLt10;


import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class HabitacionLowCost extends Habitacion {

    public HabitacionLowCost(int numero) {
        super(numero);
    }

    @Override
    public double checkOut(LocalDate fechaSalida) {
        if(!isOcupada()) return -1;
        long dias = DAYS.between(getFechaEntrada(), fechaSalida);
        return dias * 50;
    }
}