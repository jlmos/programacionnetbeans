/* introducir siempre las nueve notas de un alumno y si aprueba todo puede ir a la FCT.
autor: jose luis mosquera losada
fecha: 31-10-2021 */
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {

            System.out.print("Introduce las nota del módulo" + i+": ");
            double nota = teclado.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("La nota del alumno es erronea");
                i--;
            } else {
                if (nota < 5) {
                    System.out.println("El alumno no puede ir a la FCT, ha suspendido el modulo: " + i);
                    break;
                }
                if (i == 9) {
                    System.out.println("El alumno puede ir a la FCT");break;
                }

            }
        }
    }
}
