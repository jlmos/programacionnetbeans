/* Comprobar si la suma de los digitos de los nºs múltiplos de 3 es 
tambié múltiplo de 3. 
autor: jose luis mosquera losada
fecha: 1-11-2021*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e27 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int i, numEntrada, resto;
        for (i = 3; i <= 10000; i += 3) {
            numEntrada = i;
            int total = 0;
            while (numEntrada > 0) {
                resto = numEntrada % 10;
                numEntrada = numEntrada / 10;
                total = total + resto;
            } 
            boolean esDivisible=total%3==0;
            System.out.println("El número es: " + i +" y el resultado es " + total + ". Es divisible? " + esDivisible);
        }

    }
}

/*el for va paso a paso 1ero lee el 3 y ejecuta todo (el While, 
que está dentro del for y el boolean que tb está dentro del for) y después
va a por el siguiente (el 6) repite todo y va al siguiente...*/
