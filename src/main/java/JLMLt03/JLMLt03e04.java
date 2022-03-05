/* Introducir un valor entero, verificarlo entre 1 y 10 
y mostrar su tabla de multiplicar 
autor: jose luis mosquera losada
fecha: 31-10-2021
*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero entre 1 y 10: ");
        int valor = teclado.nextInt();
        if (valor>0  && valor<=10 ) {
                for (int i = 1; i <= 10; i += 1) 
            System.out.println(valor + "x" + i + "=" + (valor * i));}
         else       
         {System.out.println("el número: " +valor+ " no esta entre 1 y 10");}}
    }

/* ataco en corchetes, true tiene que estar con ellos y false también pero
no todo en el mismo corchete sino no hay 2da condición y saca por consola
todo y da error el else
rango entre 1 y 10 condición con &&*/
