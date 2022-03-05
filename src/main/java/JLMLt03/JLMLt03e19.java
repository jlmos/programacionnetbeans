/*Introducir nºs y mostrar si están ordenados ascendentemente o no. fin con 0 y 
sino están ordenados.
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e19 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean ordenados = true;
        int ultimoNumero = 0;
        while (true) {
            System.out.print("introduce un número:");
            int numeroIntroducido = teclado.nextInt();
            if (numeroIntroducido == 0) {
                System.out.print("Se detiene la ejecución al haber introducido un cero");
                break;
            } else if (numeroIntroducido < ultimoNumero) {
                System.out.print("Se detiene la ejecución al haber introducido un nº menor al anterior: (" + numeroIntroducido + "<" + ultimoNumero + ")");
                ordenados = false;
                break;
            } else {
                ultimoNumero = numeroIntroducido;

            }
        }
        if (ordenados) {
            System.out.print("\n" +"Los números están ordenados.");
        } else {
            System.out.print("\n" +"Los números están desodenados.");
        }
    }
}

   
