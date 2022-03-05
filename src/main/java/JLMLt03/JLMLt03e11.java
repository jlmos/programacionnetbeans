/* leer dos valores enteros m y n y mostrar los nºs comprendidos entre ellos 
ordenados ascendetemente, junto con el valor de elevar cada uno al cuadrado.
Usar una sola sentencia repetitiva
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int m, n, nMay=0, nMen=0, diferencia;
        boolean entradaValida;

        System.out.print("introduce un nº: ");
        m = teclado.nextInt();
        System.out.print("introduce otro nº: ");
        n = teclado.nextInt();
        if (m > n) {
            nMay = m;
            nMen= n;
            System.out.println("El 1er número es mayor.");
            entradaValida = true;
        } else if (n > m) {
            nMay = n;
            nMen=m;
            System.out.println("El 2do número es mayor.");

            entradaValida = true;
        } else {
            System.out.println("Los nºs introducidos son iguales.");
            entradaValida = false;
                       
        } 
        diferencia=nMay-nMen;
        
        
        for (int i=1;i<diferencia;i++){
           int nBuscado=nMen+i;
           
            System.out.println("el nº es:" + nBuscado + " y su cuadrado es:" + nBuscado*nBuscado);
        }
    }

}

/* atasco porque el 1er sout tiene que ir antes del while y el 2do despues del else
dentro del bucle */
