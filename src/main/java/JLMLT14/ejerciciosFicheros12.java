/*Realizar un programa que escriba en un archivo de datos llamado fich12.dat (no de texto) las
temperaturas que se van registrando mediante un sensor. El programa solicita al usuario la
temperatura y la almacena (puede tener decimales). A continuación, almacenará la fecha/hora del
sistema con precisión de segundos y volverá a solicitar otra temperatura. Si se teclea la temperatura
-999 indicará fin de programa. 
autor: jose luis mosquera losada
fecha: 13-04-2022 */
package JLMLT14;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ejerciciosFicheros12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in, "ISO-8859-1");
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm:ss");
        try (FileOutputStream fis = new FileOutputStream("archivos" + File.separator + "temperaturas.dat");
                BufferedOutputStream bfos = new BufferedOutputStream(fis);
                DataOutputStream dos = new DataOutputStream(fis);) {
            System.out.println("Introduce una temperatura ('-999' para acabar): ");
            double temp = teclado.nextDouble();
            while (temp != -999) {
                dos.writeDouble(temp);
                dos.writeUTF(form.format(LocalDateTime.now()));
                System.out.println("Introduce una temperatura ('-999' para acabar): ");
                temp = teclado.nextDouble();
            }
        } catch (IOException ex) {
            System.err.printf("Error:%s", ex.getMessage());
        }
    }
}
