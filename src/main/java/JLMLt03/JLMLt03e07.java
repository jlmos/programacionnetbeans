/* Introducir nºs positivos hasta salir con -1 y sacar suma acumulada 
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e07 {

    /* introducir un número entre 1 y 1000 y para esta situación calcular,   
   del introducido, sus divisores en decremento*/
    public static void main(String[] args) {
        int contador = 0;
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce un numero natural entre 1 y 1000:");
        num = teclado.nextInt();
        if (num < 0 || num > 1000) /* la condición de este if con el && era inalcanzable 
            porque un nº no puede ser num menor que cero y mayor que 1000 a la vez*/ {
            System.out.println(" número incorrecto");
        } else {
            for (int i = num; i >= 1; i--) /*la condición de parada era incorrecta 
                porque no puede perder su valor porque se estaba evaluando la
                variable num y la buena es la variable i.   
             */ {
                contador++;
                if (num % i == 0) /**/ {
                    System.out.println(i);
                }
            }
        }

        System.out.println("Contador: " + contador);

    }
}

/* las llaves están correctas porque hay una y solo una sentencia por bucle
pero las he añadido debido a que mejoran la legibilidad y previenen errores si 
hay más de una sentencia*/
