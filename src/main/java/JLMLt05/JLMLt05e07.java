/*Usando la función cantidadDivisores del ejercicio mmostrar la suma de los
nºs primos entre 1 y 1000.
autor: jose luis mosquera losada
fecha: 22-11-2021 */
package JLMLt05;
public class JLMLt05e07 {
    static int numero, sumaEsPrimo;
    public static void main(String[] args) {
        
       int sumaPrimos = 0;
        for (int i=1; i<=1000; i++) {
            if(esPrimo(i)) {
                sumaPrimos += i;
            }
        }
        System.out.println("La suma de los números primos entre 1-1000 es: " + sumaPrimos);
    }

    public static boolean esPrimo(int numero) {
        if(JLMLt05e06.cantidadDivisores(numero) == 2) {
          System.out.println("El número " + numero + " es primo");
            return true;
        } else {
            return false;
        }
    }}


