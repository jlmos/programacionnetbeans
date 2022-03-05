/*Diseña una clase llamada alumno para gestionar alumnos con los atributos nombre,
çdni, fecha de nacimiento y nombre de la escuela. Además del constructor,  los métodos
set y get para cada atributo, tendrá los siguientes métodos:
1) si es mayor de edad o no. 2) al que se le pase como parámetro otro alumno y nos
devuelva true si el alumno pasado es exactamente igual (un duplicado).False en
caso contrario. realiza un programa sencillo que use la clase definida 
autor: jose luis mosquera losada
fecha: 28-12-2021*/
package JLMLt06;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.YEARS;

public class Alumno {

    private String nombreCompleto;
    private String dni;
    private LocalDate fechaNacimiento;
    private String nombreEscuela;

    public Alumno(String nombreCompleto, String dni, LocalDate fechaNacimiento, String nombreEscuela) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.nombreEscuela = nombreEscuela;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the fechaNacimiento
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the nombreEscuela
     */
    public String getNombreEscuela() {
        return nombreEscuela;
    }

    /**
     * @param nombreEscuela the nombreEscuela to set
     */
    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }

    public boolean isMayorDeEdad() {
        long edad = YEARS.between(fechaNacimiento, LocalDate.now());
        return edad >= 18;
    }

    public boolean esMayorQue(Alumno alumno) {
        return this.fechaNacimiento.isBefore(alumno.fechaNacimiento);
    }

    public boolean equals(Alumno alumno) {
        return this.nombreCompleto.equals(alumno.nombreCompleto)
                && this.dni.equals(alumno.dni)
                && this.fechaNacimiento.equals(alumno.fechaNacimiento)
                && this.nombreEscuela.equals(alumno.nombreEscuela);
    }

     }


