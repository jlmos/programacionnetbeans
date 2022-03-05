/* Introducir edades de alumnos (-1 fin) y nos informe si hay alguno 
   menor de edad 
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e10a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad, cantAlum = 0, cantMen = 0;
        System.out.print("introduce la edad del alumno (0-120) (-1 para acabar): ");
        edad = teclado.nextInt();
        if (edad > 0 && edad < 18) {
            cantMen++;
        }
        {
            System.out.println("Si hay alguno");
        }
        while (edad != -1) {
            cantAlum++;
            System.out.print("introduce la edad del alumno (0-120) (-1 para acabar) ");
            edad = teclado.nextInt();
            if (edad > 0 && edad < 18) {
                cantMen++;
            }
            if (edad > 0 && edad < 18) {
                System.out.println("Si hay alguno");
            }
        }
        System.out.println("Total alumnos: " + cantAlum + "\n" + "Menores de edad: " + cantMen);
    }
}

/* */
