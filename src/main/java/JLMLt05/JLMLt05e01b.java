/*Realizar la función llamada mayor() que se le pasa 3 double y devuelve el mayor de ellos
es par y false si no lo es.
autor: jose luis mosquera losada
fecha: 14-11-2021  
 */
package JLMLt05;

import java.util.Scanner;

public class JLMLt05e01b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Introduce un Double1: ");
        double double1 = Double.parseDouble(teclado.nextLine());
        System.out.print(" Introduce otro Double2: ");
        double double2 = Double.parseDouble(teclado.nextLine());
        System.out.print(" Introduce otro Double3: ");
        double double3 = Double.parseDouble(teclado.nextLine());
        double mayor = esMayor(double1, double2, double3);
        System.out.print("El mayor de los tres double es: " + mayor);
    }

    public static double esMayor(double double1, double double2, double double3) {
        if (double1 > double2 && double1 > double3) {
            return double1;
        } else if (double2 > double1 && double2 > double3) {
            return double2;
        } else {
            return double3;

        }
    }
}

// necesitaba corregir el bug que provoca el enter despues del double