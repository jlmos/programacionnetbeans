/*implementar una clase llamada DEjemplarLibro que se va a usar en un biblioteca
y que tiene 4 atributos y 5 métodos, hacer un main que cree 4 libros (probando
ambos constructores), que realice algún préstamo y devolución y finalmente
muestre los libros con toSting().
autor: jose luis mosquera losada
fecha: 29-12-2021*/
package JLMLt06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DEjemplarLibro {

    private String titulo;
    private LocalDate fechaAdquisicion;
    private int numeroEjemplar;
    private boolean prestado;

    public DEjemplarLibro (String titulo) {
        this.titulo = titulo;
        this.fechaAdquisicion = LocalDate.now();
        this.numeroEjemplar = 1;
        this.prestado = false;
    }

    public DEjemplarLibro (DEjemplarLibro ejemplarLibro) {
        this.titulo = ejemplarLibro.getTitulo();
        this.fechaAdquisicion = ejemplarLibro.getFechaAdquisicion();
        this.numeroEjemplar = ejemplarLibro.getNumeroEjemplar() + 1;
        this.prestado = ejemplarLibro.isPrestado();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getNumeroEjemplar() {
        return numeroEjemplar;
    }

    public void setNumeroEjemplar(int numeroEjemplar) {
        this.numeroEjemplar = numeroEjemplar;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public boolean prestar() {
        if (prestado) {
            return false;
        } else {
            prestado = true;
            return true;
        }
    }

    public boolean devolver() {
        if (prestado) {
            prestado = false;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return titulo + " (" + fechaAdquisicion.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ") [" + numeroEjemplar + "]";
    }
}
