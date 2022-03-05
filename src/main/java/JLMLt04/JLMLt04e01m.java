/* introducir una cadena por teclado y haga los 8 siguientes apartados señalados
con sus respectivas letras: decir cuantos dígitos numéricos hay en una cadena
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e01m {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un texto:");
        String cadena = teclado.nextLine();
        boolean palindromo = true;
        for(int i=0; i<cadena.length()/2;i++){
            if (cadena.charAt(i)!= cadena.charAt(cadena.length()-i-1)){palindromo=false;break;}
        }
           if (palindromo) System.out.println("Si es un Palíndrommo");
           else System.out.println("No es un Palíndromo");
    }
    } 

