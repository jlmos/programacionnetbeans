package JLMLt13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JLMLt13e02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Introduce un número decimal: ");
            double decimal1 = scanner.nextDouble();

            System.out.print("Introduce otro número decimal: ");
            double decimal2 = scanner.nextDouble();

            double resultado = decimal1 + decimal2;
            System.out.println("Resultado = " + resultado);
        } catch (InputMismatchException ime) {
            System.out.println("El valor introducido no es de tipo double");
        }



    }
}
