/*
 
 */
package JLMLt14;
 
import java.time.LocalDate;


public class Alumno {
   private String nombre;
    private LocalDate fecha;
    private float nota1;
    private float nota2;
    private float nota3;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float notaFinal(){
        return nota1 * 0.2F + nota2 * 0.3F + nota3 * 0.5F;
    
}
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", fecha=" + fecha + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }
    
    
}
