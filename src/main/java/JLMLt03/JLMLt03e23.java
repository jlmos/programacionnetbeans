/* Introducir nºs positivos hasta salir con -1 y sacar suma acumulada 
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int total = 0;
        int numerosIntroducidos=0;
        int numeroVeces = 1;
        while (numeroVeces < 16) {
            System.out.print("introduce un nº (contador: " + numeroVeces + ", maximo de veces:15):");
            numerosIntroducidos = teclado.nextInt();
            numeroVeces++;
            if (numerosIntroducidos > 1000) {
                System.out.println("El nº introducido es mayor que 1000, se detiene la ejecución");
                break;
            } else {
                total += numerosIntroducidos;
            }   

        }if (numerosIntroducidos<1000){
        System.out.println("la suma total es de: " + total);
    }
}}
/*el while permite la introducción de los números
el último sout tiene que ir fuera del bucle pero despues del 1era llave
para que ponga la suma total despues de introducir nº mayor que 1000
hay que añadir un if fuera del bucle pero solo suma los menores de 1000*/
