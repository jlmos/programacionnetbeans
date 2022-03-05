/*Realizar la función llamada cantidadDivisores() que le pasa un nº entero
y nos devuelva el nº de divisores o bien cero si el nº es negativo. Usar un main.
autor: jose luis mosquera losada
fecha: 18-11-2021 */
package JLMLt05;

import java.util.Scanner;

public class JLMLt05e06 {

    static int numero, cantidadDivisores;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce un número entero: ");
        numero = teclado.nextInt();
        int divisores=cantidadDivisores(numero);
        System.out.println("Tiene " + divisores + " divisores");
    }

    public static int cantidadDivisores(int numero) {
        int count = 0;
        if (numero < 0) {
            return 0;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                count++;
            }
        }

        return count;
    }

   
    }

