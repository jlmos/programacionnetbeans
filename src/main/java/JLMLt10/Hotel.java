/* Clase Hotel
autor: jose luis mosquera losada
fecha: 14-02-2022*/
package JLMLt10;


import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Habitacion> habitaciones;

    public Hotel() {
        this.habitaciones = new ArrayList<>();
        this.habitaciones.add(0, new HabitacionLowCost(0));
        this.habitaciones.add(1, new HabitacionLowCost(1));
        this.habitaciones.add(2, new HabitacionLowCost(2));
        this.habitaciones.add(3, new HabitacionDoble(3));
        this.habitaciones.add(4, new HabitacionDoble(4));
        this.habitaciones.add(5, new HabitacionDoble(5));
        this.habitaciones.add(6, new HabitacionDoble(6));
        this.habitaciones.add(7, new HabitacionDoble(7));
        this.habitaciones.add(8, new HabitacionDoble(8));
        this.habitaciones.add(9, new HabitacionDoble(9));
        this.habitaciones.add(10, new HabitacionDoble(10));
        this.habitaciones.add(11, new HabitacionDoble(11));
        this.habitaciones.add(12, new HabitacionDoble(12));
        this.habitaciones.add(13, new HabitacionSuite(13));
        this.habitaciones.add(14, new HabitacionSuite(14));
        this.habitaciones.add(15, new HabitacionSuite(15));
        this.habitaciones.add(16, new HabitacionSuite(16));
        this.habitaciones.add(17, new HabitacionSuite(17));
    }

    public boolean checkIn(int numeroHabitacion, LocalDate fechaEntrada) {
        if(numeroHabitacion > 17) return false;
        Habitacion habitacion = this.habitaciones.get(numeroHabitacion);
        return habitacion.checkIn(fechaEntrada);
    }

    public double checkOut(int numeroHabitacion, LocalDate fechaSalida) {
        if(numeroHabitacion > 17) return -1.0;
        Habitacion habitacion = this.habitaciones.get(numeroHabitacion);
        return habitacion.checkOut(fechaSalida);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Listado de habitaciones:\n");
        stringBuilder.append("-----------------------------------------\n");
        for (Habitacion habitacion : habitaciones) {
            stringBuilder.append(String.format(" - Habitación %d: [%s]\n", habitacion.getNumero(), habitacion.isOcupada()? "OCUPADA" : "DISPONIBLE"));
        }
        return stringBuilder.toString();
    }


}
