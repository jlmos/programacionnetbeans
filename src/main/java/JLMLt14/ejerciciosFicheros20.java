/* Realizar un programa que solicite a un usuario tres valores: el coste de establecimiento
de llamada de los móviles de prepago, el coste por MB de cosumo de datos y el coste por 
minuto de llamada. A cotinuación, se construirá un fichero de tipo Properties con los parámetros
introducidos. 
autor: jose luis mosquera losada
fecha: 13-04-2022 */
package JLMLt14;

import JLMLt08.MovilPrepago;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

public class ejerciciosFicheros20 {

    

   
    public static ArrayList<MovilPrepago> movilPrepago() {
        

    public static void main(String[] args) {
        
    int numero = 0;

    Scanner teclado = new Scanner(System.in, "ISO-8859-1");
        System.out.println("introduce un número de teléfono:");
        numero= teclado.nextInt();
        
Properties config = new Properties(); //(import.java.util.*)
        try {
            config.load(new FileInputStream("archivos/config.props"));
            String costeEstablecimientoLlamada = config.getProperty("CosteEstablecimientoLlamada");
            String costeConsumoDatos = config.getProperty("CosteConsumoDatos");
            String costeMinutoLlamada = config.getProperty("CosteMinutoLlamada");
            System.out.println(costeEstablecimientoLlamada);
            System.out.println(costeConsumoDatos);
            System.out.println(costeMinutoLlamada);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    
}}
