/* programa que muestre una contraseña generada aleatoriamente entre 5 y 10 
posiciones que pueden ser letras entre la 'a' y la 'j' pero que no se repitan
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Random;

public class JLMLt04e05 {

    public static void main(String[] args) {
        Random r = new Random();
        int pos;
        boolean repetido;
        String caracterPosible = "abcdefghij";
        String contraseña = "";
        int longitud = r.nextInt(6) + 5;
        for (int i =0;i<longitud; i++) {
            do {
                 pos = r.nextInt(10);
                char car=caracterPosible.charAt(pos);
                repetido = contraseña.indexOf(car)!=-1;
                }
                while (repetido == true);
                contraseña = contraseña + caracterPosible.charAt(pos);

            }  System.out.println(contraseña);
        }

    }
//    if (password.indexOf(car)!=-1) repit = true; es redundante,
// mejor repit = password.indexOf(car)!=-1;



