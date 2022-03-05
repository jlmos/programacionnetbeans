/* introducir una cadena por teclado y haga los 8 siguientes apartados señalados
con sus respectivas letras: decir si la 1era posición de la cadena es = a la última
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e01k {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un texto:");
        String cadena = teclado.nextLine();
        
         String primeraLetra=cadena.substring(0,1); 
         String LastChar = cadena.substring(cadena.length()-1);
         if (primeraLetra.equals(LastChar))
             System.out.println("La primera posición Es igual a la última");
         else
             System.out.println("la primera posición NO es igual a la última");
        }
}
//Fundamentales los parámetros);
  

