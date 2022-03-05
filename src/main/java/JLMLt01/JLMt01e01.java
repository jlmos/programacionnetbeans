/*
 conversor euros a dólares
autor: jose luis mosquera losada
fecha: 2021-10-10
 */
package JLMLt01;

import java.util.Scanner;

public class JLMt01e01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // 1. Entrada de datos
        double euros, dolares;
        final double tasaCambio = 1.14;
        
        // 2. Proceso
          System.out.print("introduce la cantidad: ");
                euros = teclado.nextInt();
                dolares = euros * tasaCambio;      
                System.out.println(dolares);
                
        // 3. Mostrar resultados
        System.out.println("el resultado es: " + dolares + " dolares");
        
    }

}
