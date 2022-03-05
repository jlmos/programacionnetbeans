/* introducir dni y calcular su letra, almacenando las letras del dni en una cadena
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String letraDni="TRWAGMYFPDXBNJZSQVHLCKE"; 
        System.out.print("Introduzce el DNI:");
        int numero=teclado.nextInt();
        int rest=numero%23;
        char letra=letraDni.charAt(rest);
        System.out.println("La letra del DNI es:"+ letra);
        }
}
  // ojo modulo es % no /

