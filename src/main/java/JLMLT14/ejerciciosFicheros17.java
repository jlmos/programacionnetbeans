package JLMLT14;


import JLMLt08.Asalariado;
import JLMLt08.Trabajador;

import java.io.*;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Random;

public class ejerciciosFicheros17 {

    public static ArrayList<Trabajador_v2> crearTrabajadores() {
        ArrayList<Trabajador_v2> result = new ArrayList<>();

        result.add(new Asalariado_v2("1", "Asalariado1", LocalDate.of(1991, 1, 1), 2000));
        result.add(new Asalariado_v2("2", "Asalariado2", LocalDate.of(1992, 2, 2), 2000));
        result.add(new Asalariado_v2("3", "Asalariado3", LocalDate.of(1993, 3, 3), 2000));
        result.add(new ConsultorExterno_v2("4", "Consultor4", LocalDate.of(1994, 4, 4)));
        result.add(new ConsultorExterno_v2("5", "Consultor5", LocalDate.of(1995, 5, 5)));

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Trabajador_v2> trabajadores = crearTrabajadores();
        File file = new File("archivos" + File.separator + "fich17.dat");
        try( FileOutputStream fos = new FileOutputStream(file,false);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos) ){
            for (Trabajador_v2 trabajador : trabajadores) {
                oos.writeObject(trabajador);
            }
        }
        catch (IOException ex) {System.err.println("Error:"+ ex.getMessage()); }
    }



}
