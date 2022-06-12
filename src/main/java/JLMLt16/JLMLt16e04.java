/* Realizar un programa al que se le introduzca un número entero. Mostrar dicho número en
su representación hexadecimal. Evitar que se produzca una excepción si el usuario no introduce un
valor correcto (por ejemplo, si introduce texto o un número con decimales o un número demasiado
grande).
autor: jose luis mosquera losada
fecha: 08-06-2022 */

package JLMLt16;

import java.util.Scanner;


public class JLMLt16e04 {

   
    public static void main(String[] args) {
     String entrada;
        Integer numero;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);

        try {
            while (!salir) {
                System.out.println("Introducir un número entero: ");
                entrada = teclado.nextLine();
                numero = Integer.parseInt(entrada);
                if ((numero > Integer.MIN_VALUE) && (numero < Integer.MAX_VALUE)) {
                    System.out.println("El número en hexadecimal es: " + Integer.toHexString(numero));
                }
                System.out.println("Continuar s/n: ");
                entrada = teclado.nextLine();
                if (entrada.equals("n")) {
                    salir = true;
                }
            }

        } catch (Exception e) {
            System.out.println("Opcion no valida");
        }
    }

}

