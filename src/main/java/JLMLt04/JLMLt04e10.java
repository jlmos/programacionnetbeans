/* introducir 10 cadenas de caracteres y construya una cadena con el 1er caracter
de cada cadena y mostralo por pantalla,
tener en cuenta las minúsculas y las MAYUSCULAS. (los números y los espacios en blanco
no se tienen en cuenta.
autor: jose luis mosquera losada
fecha: 14-11-2021 
 */
package JLMLt04;

import java.util.Scanner;

public class JLMLt04e10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String resultado="";
        String cadena;
        for (int i = 0; i < 10; i++) {
            System.out.print("cadena :");
            cadena = teclado.nextLine();
            resultado = resultado + cadena.charAt(0);
        } 
            System.out.println("el rsd es:"+resultado);

    }// le ponía el mismo nombre de 'cadena' al nombre del almacenamiento 
}

/*Scanner teclado = new Scanner(System.in);
        int pos;
        String cadena;
        for (int i = 0; i < 10; i++) {
            System.out.print("cadena :");
            cadena = teclado.nextLine();
            cadena = cadena.toLowerCase();
            pos = cadena.indexOf(0,1);
            System.out.println(pos);*/

/*               int contador = 0;
 String cadenafinal = ""
while (true) {
            contador++;
            if (contador < 11) {

                System.out.print("cadena " + contador + ":");
                String cadena = teclado.nextLine();
                
            }

        }// hacerlo con un for el preguntar por las diez cadenas
    }

}

/*                String trozo = cadena.substring(0, 5); //cadena con las 5 primeras posiciones
                System.out.println(trozo);*/
 /* do {
                    String pos = cadena.indexOf(0, cadena);
                    if (pos < 11) {
                        subcadena= cadena.charAt(0, 1)
                    }
                    while (pos <11);
                    System.out.println(subcadena);
                } */
