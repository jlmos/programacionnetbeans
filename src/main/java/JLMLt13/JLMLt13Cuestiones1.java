/*  Cuestiones tema 13.
Puede finalizar abruptamente esta porción de código:
a) Si, si introduzco un denominador cero me da un error aritmético
 y también si introduzco letras en vez de números me da un error de entrada de datos.
b) no finaliza con error porque se está capturando la exceción correctamente. Al acceder al indice -1
salta un excepción de tipo ArrayIndexOutOfBoundsException y se captura correctamente
autor: jose luis mosquera losada
fecha: 12-04-2022*/

package JLMLt13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JLMLt13Cuestiones1 {

    /* public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        try {

            System.out.print("Num 1: ");
            int Num1 = teclado.nextInt();
            System.out.print("Num 2: ");
            int num2 = teclado.nextInt();

            System.out.println("division=" + Num1 / num2);

        } catch (ArithmeticException ex) { // error en el dividendo
            System.out.println("Error en división");
        } catch (InputMismatchException ex) { // error en la entrada de datos con letras
            System.out.println("Error en entrada de datos");

        }
    }

} */ public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int p = -1;
        try { System.out.print(a[p]);}
            catch (ArrayIndexOutOfBoundsException e) { System.out.print("0");}
        }
    }

