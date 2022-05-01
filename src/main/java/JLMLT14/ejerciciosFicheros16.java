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
