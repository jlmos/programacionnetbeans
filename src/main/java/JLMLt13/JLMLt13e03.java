package JLMLt13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JLMLt13e03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Introduce un número entero: ");
            int entero1 = scanner.nextInt();

            System.out.print("Introduce otro número entero: ");
            int entero2 = scanner.nextInt();

            int resultado = entero1 / entero2;
            System.out.println("Resultado = " + resultado);

        } catch (ArithmeticException ae) {
            System.out.println("Resultado = 0");
        } catch (InputMismatchException ime) {
            System.out.println("Resultado = 0");
        }

    }


}
