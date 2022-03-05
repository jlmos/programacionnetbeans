/*Realizar la función llamada calcularDiaMes() que le pasa como parámetro un 
año y un mes y a) devuelva los días que tiene un mes, ojo los bisiestos.
b)introducir una fecha y nos informe de los días pasados dd 1 de enero de ese año
autor: jose luis mosquera losada
fecha: 16-11-2021 */
package JLMLt05;

import java.util.Scanner;

public class JLMLt05e03 {

    static int año, mes;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("introduce un mes: ");
        mes = teclado.nextInt();
        System.out.print("introduce un año: ");
        año = teclado.nextInt();
        int x = cantidadDiaMes(mes, año);
        System.out.println("El mes tiene: " + x + " días");

    }

    static int cantidadDiaMes(int m, int a) {
        if (m == 11 || m == 9 || m == 6 || m == 4) {
            return 30;
        }

        if (m == 2) {
            if (añoBisiesto(a)) {
                return 29;
            } else {
                return 28;
            }
        }
        return 31;

    }

    static boolean añoBisiesto(int aa) {
        return aa % 4 == 0 && aa % 100 != 0 || aa % 400 == 0;
        /*if (aa % 4 == 0 && aa % 100 != 0 || aa % 400 == 0) return true;
       return false; REDUNDANTE*/
    }

}
    




    

