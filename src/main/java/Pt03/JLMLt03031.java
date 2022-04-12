package Pt03;

import java.util.Scanner;

public class JLMLt03031 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduce el numero de veces: ");
        int numero = teclado.nextInt();
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(nombre + " ");
            }
            System.out.print("\n");
        }
        System.out.println("-----------------------------");
        System.out.println("QUE GUAPO ERES: " + nombre);
    }
}
