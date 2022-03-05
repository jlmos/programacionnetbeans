/* introducir un texto y sustituir sus posiciones impares por asteríscos
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un texto:");
        String cadena = teclado.nextLine();
        StringBuilder sb = new StringBuilder (cadena);
                for (int i=1;i<sb.length();i+=2) 
                    sb.setCharAt( i,'*');

                System.out.println(sb);
        }
}
  // ojo es length no lenght
   


