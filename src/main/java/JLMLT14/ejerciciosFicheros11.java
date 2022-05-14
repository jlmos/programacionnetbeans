/*Realizar un programa que lea el fichero alumnos.txt línea a línea y finalmente muestre la
cantidad de alumnos que tienen una nota final >=5 y el nombre del alumno con mejor nota. (La
nota final se calcula redondeando un 20% de la primera evaluación más un 30% de la segunda más
50% de la tercera). Prueba a cargar el archivo alumnos.txt en una hoja de cálculo con LibreOfficeCalc. 
autor: jose luis mosquera losada
fecha: 13-04-2022 */
package JLMLT14;

import JLMLt14.Alumno;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ejerciciosFicheros11 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList <Alumno>alumnos = new ArrayList();
        File f = new File("archivos" + File.separator + "alumnos.csv");
        String cadena;
        try (FileReader fr = new FileReader(f);
                BufferedReader bfr = new BufferedReader(fr)) {
            while ((cadena = bfr.readLine()) != null) {
               cadena=cadena.replace(',','.');
               String[] campos = cadena.split(";");
               Alumno alumno = new Alumno();
               alumno.setNombre(campos[0]);
               alumno.setFecha(LocalDate.parse(campos[1], DateTimeFormatter.ofPattern("yyyyMMdd")));
               alumno.setNota1(Float.parseFloat(campos[2]));
               alumno.setNota2(Float.parseFloat(campos[3]));
               alumno.setNota3(Float.parseFloat(campos[4]));

               alumnos.add(alumno);
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
