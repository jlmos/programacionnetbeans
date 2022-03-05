/*Ejercicio de fechas, usando las clases de java con la funcionalidad: introducir 
un año y decir cuántos domingos tiene
autor: jose luis mosquera losada
fecha: 04-01-2022*/
package JLMLt06;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class JLMLt06e09h {

    public static void main(String[] args) {
        int year=LocalDate.now().getYear();
        for (int i=year-5;i<year;i++){
            LocalDate fecha = LocalDate.of(i, 12, 31);
            DayOfWeek diaSemana = fecha.getDayOfWeek();
            String diaSemanaGallego = toGalician(diaSemana);
            System.out.println("31/12/" + i+" Nombre en gallego: " + diaSemanaGallego);
        }    
    }
    
    public static String toGalician(DayOfWeek dayOfWeek) {
        switch(dayOfWeek) {
            case MONDAY: return "Luns";
            case TUESDAY: return "Martes";
            case WEDNESDAY: return "Mércores";
            case THURSDAY: return "Xoves";
            case FRIDAY: return "Venres";
            case SATURDAY: return "Sábado";
            case SUNDAY: return "Domingo";
            default: return "ERROR";
        }
    }
}
