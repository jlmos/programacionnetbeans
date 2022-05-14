/*Realiza un programa que guarde un fichero similar al de las temperaturas del ejercicio 12 con 
las temperaturas de todo un año (generar valores al azar para la temperatura, una temperatura por día,
con valores entre 0 y 40 y la fecha en formato YYYYMMDD). El año puede ser una constante con un año 
específico, por ejemplo 2021 o 2022. A continuación, se solicitará un día y mes del año al usuario y
se obtendrá con acceso aleatorio (no secuencial) la temperatura de ese día.
autor: jose luis mosquera losada
fecha: 06-05-2022*/


package JLMLT14;


import java.io.*;
import java.nio.ByteBuffer;
import java.time.YearMonth;
import java.util.Random;

public class ejerciciosFicheros16 {

    private static final int YEAR = 2022;
    private static final Random random = new Random();
    private static final File FILE = new File("archivos" + File.separator + "ejercicio16.dat");

    public static void generarFichero() {
        try(FileOutputStream fis = new FileOutputStream(FILE);
            BufferedOutputStream bfos = new BufferedOutputStream(fis);
            DataOutputStream dos = new DataOutputStream(fis)) {

            for(int mes=1; mes<=12; mes++) {
                YearMonth yearMonth = YearMonth.of(YEAR, mes);
                for(int dia=1; dia <= yearMonth.lengthOfMonth(); dia++) {
                    int temperatura = random.nextInt(40);
                    dos.writeInt(temperatura);
                }
            }

        } catch (IOException ex) {
            System.out.println("Error al escribir el fichero " + FILE.getAbsolutePath());
        }
    }

    public static int leerDia(int mes, int dia) {
        int posicion = 0;
        for (int m=1; m < mes; m++) {
            posicion += YearMonth.of(YEAR, m).lengthOfMonth();
        }
        posicion += dia-1;

        try (RandomAccessFile raf=new RandomAccessFile(FILE.getAbsolutePath(),"rw")) {
            raf.seek(posicion * 4);
            return raf.readInt();
        } catch (IOException ex) {
            System.out.println("Error al leer la temperatura del mes " + mes);
            return 0;
        }
    }

    public static void main(String[] args) {
        generarFichero();
        int temperatura = leerDia(12, 31);
        System.out.println("Temperatura: " + temperatura);
    }



}
