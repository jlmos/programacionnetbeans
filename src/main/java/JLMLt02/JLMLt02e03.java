/* leer notas de Examen y de trabajos y mostrar la nota.
   autor: jose luis mosquera losada
   fecha: 17-10-21 */
package JLMLt02;

import java.util.Scanner;

public class JLMLt02e03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notaEx, notaTclase, notaTpract, res = 0;

        System.out.print("Introduce la nota del examen: ");
        notaEx = teclado.nextDouble();
        System.out.print("Introduce la nota del trabajo en clase: ");
        notaTclase = teclado.nextDouble();
        System.out.print("Introduce la nota del trabajo práctico: ");
        notaTpract = teclado.nextDouble();

        if (((notaEx >= 5) || (notaEx >= 4 && notaTclase > 5) && (notaTpract > 5))
                || (notaEx >= 4 && (notaTclase > 8 || notaTpract > 8))) {
            res = notaEx + notaTclase + notaTpract;
            System.out.println("El alumno está aprobado: ");
        } else {
            System.out.println("El alumno está suspenso: ");

        }
    }
}
