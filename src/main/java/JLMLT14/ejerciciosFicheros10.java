/*Realizar un programa que lea el fichero alumnos.txt línea a línea y finalmente muestre la
cantidad de alumnos que tienen una nota final >=5 y el nombre del alumno con mejor nota. (La
nota final se calcula redondeando un 20% de la primera evaluación más un 30% de la segunda más
50% de la tercera). Prueba a cargar el archivo alumnos.txt en una hoja de cálculo con LibreOfficeCalc. 
autor: jose luis mosquera losada
fecha: 13-04-2022 */
package JLMLT14;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ejerciciosFicheros10 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList <Alumno>alumnos = new ArrayList();
        File f = new File("archivos" + File.separator + "alumnos.txt");
        String cadena;
        try (FileReader fr = new FileReader(f);
                BufferedReader bfr = new BufferedReader(fr)) {
            while ((cadena = bfr.readLine()) != null) {
               cadena=cadena.replace(',','.');
               Alumno alumno = new Alumno();
               alumno.setNombre(cadena.substring(0,50));
               alumno.setFecha(LocalDate.parse(cadena.substring (50,70).trim(), DateTimeFormatter.ofPattern("yyyyMMdd")));
               alumno.setNota1(Float.parseFloat(cadena.substring(70,80)));
               alumno.setNota2(Float.parseFloat(cadena.substring(80,90)));
               alumno.setNota3(Float.parseFloat(cadena.substring(90,100)));
                          
                alumnos.add (alumno);
            }
        }
        int aprobados=0;
        Alumno mejorAlumno = new Alumno();
        for (Alumno alumno : alumnos){
            if (alumno.notaFinal()>=5) aprobados++;
            if (alumno.notaFinal()>mejorAlumno.notaFinal()){
                mejorAlumno=alumno;
            }
        } 
        System.out.println("Numero Aprobados:" + aprobados);
        System.out.println("Mejor Alumno:" + mejorAlumno.getNombre());
    }
}
