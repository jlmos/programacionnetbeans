/* Introducir la cantidad de entradas a la venta y la cantidad de entradas que
se quieren comprar con máximo de 10. Fin cuando se agoten las entradas mostrar
al que más entradas se ha llevado
autor: jose luis mosquera losada
fecha: 2-11-2021*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e29 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int idCliente = 0;
        int mayorVenta = 0;
        System.out.print("Introduce la cantidad de entradas disponibles: ");
        int entradas = teclado.nextInt();

        while (entradas > 0) {
            idCliente++;

            System.out.print("Cliente " + idCliente + ": Cuántas entradas quier comprar? ");
            int solicitudEntradas = teclado.nextInt();
            if (solicitudEntradas > 10) {
                System.out.print("No puedes comprar más de 10 entradas: ");
            } else if (solicitudEntradas > entradas) {

                System.out.print("No quedan tantas entradas: ");
            } else {
                System.out.print("Ventas: ");
                entradas = entradas - solicitudEntradas;
                if (solicitudEntradas > mayorVenta) {
                    mayorVenta = solicitudEntradas;
                }
            }
        }

        System.out.println("");
        System.out.print("SE HAN VENDIDO TODAS LAS ENTRADAS \n");
        System.out.println("Mayor venta: " + mayorVenta);

    }

}
