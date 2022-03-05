/* Introducir edades de alumnos (-1 fin) y nos informe si hay alguno 
   menor de edad 
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad;
        System.out.print("introduce la edad del alumno (0-120) (-1 para acabar): ");
        edad = teclado.nextInt();
       boolean menor=false;
        while (edad != -1) {
            if(edad<18)menor=true;
            System.out.print("introduce la edad del alumno (0-120) (-1 para acabar) ");
            edad = teclado.nextInt();
                        }
            if (menor) 
                System.out.println("Si hay alguno menor");
             else  System.out.println("Ninguno menor");
            
            }
        }


/* */
