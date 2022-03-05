/* Comprobar la serie de Fibonacci si funciona correctamente con el programa dado
autor: jose luis mosquera losada
fecha: 31-10-2021 */
package JLMLt03;

public class JLMLt03e21 {

    public static void main(String[] args) {
        int ant = 0, ant2 = 1, num=0; // intercambiar los valores de ant y ant2 e inicializar num.

        for (int i = 1; i <= 12; i++) {

            System.out.println(num);
            num = ant + ant2;
            ant2 = ant;
            ant = num; // variando el orden conseguimos el rsdo deseado.

        }
    }
}
