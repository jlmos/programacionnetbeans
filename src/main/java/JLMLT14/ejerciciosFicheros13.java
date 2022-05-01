/*Realizar un programa que muestre las parejas de temperatura-fecha/hora del ejercicio
anterior. 
autor: jose luis mosquera losada
fecha: 13-04-2022 */
package JLMLT14;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ejerciciosFicheros13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1");
        boolean eof=false;
        try (FileInputStream fis = new FileInputStream("archivos" + File.separator + "temperaturas.dat");
                BufferedInputStream bfis = new BufferedInputStream(fis);
                DataInputStream dis = new DataInputStream(bfis)) {
            while (!eof) {
                double temp = dis.readDouble();
                String fech = dis.readUTF();
                System.out.printf("%s-> %.2f\n", fech, temp);
            }
        } catch (EOFException e) { eof = true;
        } catch (IOException ex) {System.err.printf("Error:%s", ex.getMessage());
}

    }
}

