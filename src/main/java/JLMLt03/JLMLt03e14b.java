/* Mostrar los nºs perfectos entre 1 y 10000.
autor: jose luis mosquera losada
fecha: 31-10-2021 
no está acabado*/
package JLMLt03;

public class JLMLt03e14b {

    public static void main(String[] args) {
        int i, suma = 0, j;

        for (i = 1; i < 10000; i++) {  // desde valor 1. condiciona a dividir en rango 1 hasta n y lo incrementa en 1                          
            for (j = 1; j == i; j++) {
                if (j % i == 0) {     // 1ero la división y después la suma
                    suma = suma + j;
                }
            }

        }
    }
}
