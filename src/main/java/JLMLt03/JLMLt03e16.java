/* Generar un número aleatorio entre 0 y 99 que habrá que adivinar en 5 intentos
el programa responderá si es mayor, menor o si ha acertado.
autor: jose luis mosquera losada
fecha: 31-10-2021 */
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e16 {

    public static void main(String[] args) {
        int numero = (int) ((Math.random() * 99) + 1);
        int i;
        Scanner teclado = new Scanner(System.in);

        int numero2;
        System.out.println("Introduce un número entre 0 y 99 (tienes 5 intentos):");
        numero2 = teclado.nextInt();
        while (numero2 >= 100 || numero2<0) {
            System.out.println("El número tiene que ser entre 0 y 99. JUEGA DE NUEVO");
          System.out.println("Introduce un número entre 0 y 99 (tienes 5 intentos):");
        numero2 = teclado.nextInt();  
        }
        for (i = 0; i <= 4; i++) {

            if (numero2 == numero) {
                System.out.println("Enhorabuena has acertado");
                break;
            } else if (i == 4) {
                System.out.println("Lo siento no has acertado. El número era:" + numero);
                break;
            } else if (numero > numero2) {
                System.out.println("El número oculto es MAYOR que " + numero2);
            } else if (numero < numero2) {
                System.out.println("El número oculto es MENOR que " + numero2);
            }

            if (i <= 1) {
                System.out.print("otro intento: ");
                numero2 = teclado.nextInt();
            } else if (i == 2) {
                System.out.print("otro intento: ");
                numero2 = teclado.nextInt();
            } else if (i >= 3) {
                System.out.print("Te queda un intento: ");
                numero2 = teclado.nextInt();
            }
        }
    }
}
