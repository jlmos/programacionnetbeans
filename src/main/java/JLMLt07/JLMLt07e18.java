/* Programa al que se le pasa un entero y devuelva un ArrayList con todos sus divisores
autor: jose luis mosquera losada
fecha: 9-1-2022 */

package JLMLt07;

import java.util.ArrayList;

public class JLMLt07e18 {

 private static final int NUMERO = 99925123;

    public static void main(String[] args) {
        System.out.println("Calculando los divisores de " + NUMERO + "...");
        ArrayList<Integer> result = calcularDivisores(NUMERO);
        System.out.println(result);
    }

    public static ArrayList<Integer> calcularDivisores(int numero) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=1; i<=numero; i++) {
            if(numero % i == 0) result.add(i);
        }
        return result;
    }
}   
    
