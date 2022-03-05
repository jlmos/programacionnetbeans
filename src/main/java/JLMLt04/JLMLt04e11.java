/* Describir lo que hace el código siguiente e indicar si contiene algún error.
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e11 {

    public static void main(String[] args) {//no contiene método especial, 
        //es el que permite ejecutar el código de un programa, o aplicación
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una cadena:");
        String cadena = teclado.nextLine();
        StringBuilder cadenaSB = new StringBuilder(cadena);
        int pos;
        do {
            pos = cadenaSB.indexOf("x",4); //como no tiene parámetro siempre es -1 y no encuentra nada para borrar
            if (pos != -1) {               // con este parámetro borraría la x a partir de la posición 4.
                cadenaSB.deleteCharAt(pos); //si no hay parámetro no borra nada y además "peta"
            }
        } while (pos != -1);
        System.out.println(cadenaSB);
    }
}


   

