/*(sobrecarga) Crea una clase llamada Consola con un método estático sobrecargado
llamado leerEntero() que solicite al usuario que teclee un valor entero, cumpliendo
las siguientes características: a) si no le pasa ningún parámetro, no tiene requisitos,
es simplemente un nextInt() b) Si se le pasa un parámetro de tipo texto, escribe ese texto 
antes de solicitar el valor. c) Si se le pasa un parámetro de tipo texto y dos enteros, 
garantizará que el valor tecleado esté comprendido entre ambos. d) si se le pasan dos enteros
garantizará que el valor tecleado esté comprendido entre ambos, pero no muestra texto de instrucciones previo.
autor: jose luis mosquera losada
fecha: 30-01-2022 */
 
 
package JLMLt09;

import java.util.Scanner;


public class Consola {
    
public static int leerEntero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe un número entero: ");
        return scanner.nextInt();
    }

    public static int leerEntero(String texto) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(texto);
        return scanner.nextInt();
    }

    public static int leerEntero(String texto, int min, int max) {
        System.out.printf(texto + " (%d-%d)", min, max);
        return leerEntero(min, max);
    }

    public static int leerEntero(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        if(result > min && result < max) {
            return result;
        } else {
            System.out.printf("Número fuera de rango. inténtalo de nuevo: (%d-%d)", min, max);
            return leerEntero(min, max);
        }
    }
}
