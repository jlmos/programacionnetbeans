/*introducir dos nºs enteros positivos y nos diga cual de los dos tiene
más divisores.
autor: jose luis mosquera losada
fecha: 14-11-2021 */
package JLMLt05;

import java.util.Scanner;

public class JLMLt05e08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = teclado.nextInt();

        // Calcular número de divisores de cada número
        int divisoresNumero1 = JLMLt05e06.cantidadDivisores(numero1);
        int divisoresNumero2 = JLMLt05e06.cantidadDivisores(numero2);

        // Sacar por pantalla la cantidad de divisores de cada número
        System.out.println("Numero1: " + divisoresNumero1 + " divisores. || Número 2: " + divisoresNumero2 + " divisores");

        // Resultado
        if (divisoresNumero1 > divisoresNumero2) {
            System.out.println("El número 1 tiene más divisores");
        } else if (divisoresNumero1 < divisoresNumero2) {
            System.out.println("El número 2 tiene más divisores");
        } else {
            System.out.println("Ambos números tienen la misma cantidad de divisores");
        }
    }
}
