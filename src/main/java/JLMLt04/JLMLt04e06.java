/* introducir un email y nos devuelva el dominio
autor: jose luis mosquera losada
fecha: 10-11-2021
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e06 {

    public static void main(String[] args) {
        String correo, domi;
        int poArrb,
        posUltimoPto = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un correo electrónico:");
        correo = teclado.nextLine();
        poArrb= correo.indexOf("@");
        int pos = 0;
        do {
            pos = correo.indexOf(".", pos);
            if (pos != -1) {
                posUltimoPto = pos;
                pos++;
            }
        } while (pos != -1);
        if (poArrb<1 || posUltimoPto < 2
        )
System.out.println("El correo no es válido");
        else {
                    domi = correo.substring(poArrb+1, posUltimoPto);
                System.out.println("Dominio: "+ domi);
        }
    }
}



// 

