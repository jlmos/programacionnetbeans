/* Igual que el anterior pero si se introduce número negativo o mayor que 10
informar de su error y obligar a meter correctamente las entradas, las veces
necesarias hasta que lo haga bien.
autor: jose luis mosquera losada
fecha: 2-11-2021*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e30 {

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
                System.out.print("No quedan tanta entradas. Por favor inténtalo de nuevo: ");
                idCliente--;
            } else if (solicitudEntradas < 0) {

                System.out.print("El número de entradas no puede ser negativo. Por favor inténtalo de nuevo: ");
                idCliente--;
            } else {
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
