/* Mostrar los nºs perfectos entre 1 y 10000.
autor: jose luis mosquera losada
fecha: 31-10-2021 
no está acabado*/
package JLMLt03;

public class JLMLt03e14c {

    public static void main(String[] args) {

        for (int i = 1; i <= 10000; i++) {
            int suma = 0;
            for (int j = 1; j <= i / 2; j++) {// solo se divide si j es menor
                if (i % j == 0) { // se comprueba resto cero
                    suma += j;    // solo se suman los que dieron resto cero
                }
            }
            if (suma == i) {
                System.out.println(i);
            }
        }
    }
}


