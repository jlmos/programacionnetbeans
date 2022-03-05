/* introducir una cadena por teclado y haga los 8 siguientes apartados señalados
con sus respectivas letras: decir cuantos dígitos numéricos hay en una cadena
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e01l {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un texto:");
        String cadena = teclado.nextLine();
        int numero=0;
        int i;
        for (i=0;i<cadena.length();i++){
        if (Character.isDigit(cadena.charAt(i)))
            numero++;
        }
           System.out.println("La cadena contiene "+numero+" número/s");
    }
    } 
// el for no lleva punto y coma

