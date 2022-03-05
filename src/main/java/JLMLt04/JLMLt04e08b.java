/* introducir una cadena, un nº que indica la posición de la cadena y una letra.
reemplazar, sobre la misma cadena, el caracter que hubiera en la posición indicada
por la letra introducida. 2 versiones: 1) con String 2) con StrinBuilder.
con sus respectivas letras: decir cuantos dígitos numéricos hay en una cadena
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e08b {
   // public void setCharAt(int index, char ch)  
    public static void main(String[] args) {
                  //StringBuilder sb = new StringBuilder("abc");  
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un texto:");
        String cadena = teclado.nextLine();
        System.out.print("Introduzca un número:");
         int numero=Integer.parseInt(teclado.nextLine()); 
        System.out.print("Introduzca un caracter:");
        char caracter = teclado.next().charAt(0);
          StringBuilder sb = new StringBuilder(cadena);
            sb.setCharAt(numero,caracter);
          System.out.println("el rsdo es: "+sb);

            }
        }
            //        



