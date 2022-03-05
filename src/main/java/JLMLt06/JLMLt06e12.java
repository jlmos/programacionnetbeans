/*Diseña una clase llamada alumno para gestionar alumnos con los atributos nombre,
çdni, fecha de nacimiento y nombre de la escuela. Además del constructor,  los métodos
set y get para cada atributo, tendrá los siguientes métodos:
1) si es mayor de edad o no. 2) al que se le pase como parámetro otro alumno y nos
devuelva true si el alumno pasado es exactamente igual (un duplicado).False en
caso contrario. realiza un programa sencillo que use la clase definida
autor: jose luis mosquera losada
fecha: 05-01-2022*/
package JLMLt06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class JLMLt06e12 {

    
   public static void main(String[] args) {
 // Prueba método "isMayorDeEdad"
        LocalDate nacimiento1 = LocalDate.parse("01/01/1990", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Alumno alumno1 = new Alumno("Alumno1", "111111111A", nacimiento1, "Fernando Wirtz");
        System.out.println("Es mayor de edad? " + alumno1.isMayorDeEdad());

        // Prueba método "esMayorQue"
        LocalDate nacimiento2 = LocalDate.parse("01/01/2010", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Alumno alumno2 = new Alumno("Alumno2", "222222222B", nacimiento2, "Fernando Wirtz");
        System.out.println("Es mayor el alumno2?: " + alumno2.esMayorQue(alumno1));

        // Prueba método "equals"
        System.out.println("Son iguales? " + alumno1.equals(alumno2));
      
    
}}
