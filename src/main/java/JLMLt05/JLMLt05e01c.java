/*Realizar la función llamada sumaIntervalo() que  le pasa 2 long y devuelve 
otro long con la suma de los nºs comprendidos entre los pasados.
el 1ero es menor que el segundo y ambos mayores que cero, sino -1
autor: jose luis mosquera losada
fecha: 19-11-2021  
 */
package JLMLt05;

import java.util.Scanner;

public class JLMLt05e01c {

    static long numero1, numero2, sumando;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print(" Introduce un numero mínimo: ");
        numero1 = Long.parseLong(teclado.nextLine());
        System.out.print(" Introduce otro numero máximo: ");
        numero2 = Long.parseLong(teclado.nextLine());
        sumando = sumaIntervalo(numero1, numero2);
        System.out.print("La suma del intervalo es: " + sumaIntervalo(numero1, numero2));
        
 
}public static int sumaIntervalo(long numero1, long numero2) {
        if (numero2 < numero1 || numero1 < 0 || numero2 < 0) {
            return -1;
        } else {
         int suma = 0;
        for (long i = numero1+1; i < numero2; i++) {
            suma += i; 
        }
        return suma;
        }}}


