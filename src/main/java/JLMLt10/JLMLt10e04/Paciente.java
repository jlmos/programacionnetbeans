/* Copia el ejercicio del capítulo anterior de la lista de espera del médico y redefine
la superclase Paciente como abstracta haciendo el método facturar() abstracto, ya que 
se implementa en las tres clases hijas
autor: jose luis mosquera losada
fecha: 8-02-2022 */
package JLMLt10.JLMLt10e04;

import java.time.LocalDate;


public abstract class Paciente {
    
private String nombre;
    private LocalDate fechaNacimiento;

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

    public abstract double facturar();
}
