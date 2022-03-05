/* programa que muestre una contraseña generada aleatoriamente entre 5 y 10 
posiciones que pueden ser letras entre la 'a' y la 'j'
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Random;

public class JLMLt04e04 {

    public static void main(String[] args) {
        Random r = new Random();
        String posibilityCharacter = "abcdefghij";
        String password = "";
        int pos, i;
        int longitud = r.nextInt(6) + 5;
        for ( i=0;i<longitud;i++){
            pos=r.nextInt(10);
            password=password + posibilityCharacter.charAt(pos);
            
        }System.out.println(password);
    }
}


