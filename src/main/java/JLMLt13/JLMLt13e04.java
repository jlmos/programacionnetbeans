package JLMLt13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JLMLt13e04 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        double decimales[] = new double[7];

        // Llenar array
        for (int i = 0; i < decimales.length; i++) {
            decimales[i] = 40 * random.nextDouble();
        }
        System.out.println(Arrays.toString(decimales));

        System.out.print("Introduce una posición: ");
        int posicion1 = scanner.nextInt();

        System.out.print("Introduce otra posición: ");
        int posicion2 = scanner.nextInt();

        try {
            double media = (decimales[posicion1] + decimales[posicion2]) / 2;
            System.out.println("Media = " + media);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Media = 0");
        }

    }

}
