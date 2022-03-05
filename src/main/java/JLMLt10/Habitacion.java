/* La superclase Habitación debe tener public abstract double CheckOut ();
autor: jose luis mosquera losada
fecha: 14-02-2022*/
package JLMLt10;

import java.time.LocalDate;

public abstract class Habitacion {

    private int numero;
    private boolean ocupada;
    private LocalDate fechaEntrada;

    public Habitacion(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.fechaEntrada = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public boolean checkIn(LocalDate fechaEntrada) {
        if(ocupada == true) {
            return false;
        } else {
            this.ocupada = true;
            this.fechaEntrada = fechaEntrada;
            return true;
        }
    }

    public abstract double checkOut(LocalDate fechaSalida);
}
