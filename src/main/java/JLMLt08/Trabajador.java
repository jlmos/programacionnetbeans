/* Crear una clase llamada Trabajador con los atributos privados: id, nombre, fecha de
nacimiento y salario base.
• Dispondrá también de un constructor que inicialice todos sus campos, getters, setters,
método toString () y equals (), sabiendo que dos trabajadores son iguales si tienen el mismo
‘id’.
autor: jose luis mosquera losada
fecha: 24-01-2022*/
package JLMLt08;

import java.time.LocalDate;
import java.util.Objects;

public class Trabajador {
private String id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private double salarioBase;

    public Trabajador(String id, String nombre, LocalDate fechaNacimiento, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.salarioBase = salarioBase;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador that = (Trabajador) o;
        return Objects.equals(id, that.id);
    }

}
