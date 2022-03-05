/* Clase Primitiva2 empleando ArrayList y aprovechando los métodos de Primitiva para
simplificar la generación de números sin repetidos. Además, los números premiados se
mantendrán ordenados y por último, la búsqueda de los números jugados en el ArrayList
de los premiados se requiere que se haga de forma dicotómica. Rehacer los programas
del ejercicio 7.5 pero con la nueva clase.
autor: jose luis mosquera losada
fecha: 15-1-2022 */
package JLMLt07;

import JLMLt07.Primitiva2;

import java.util.ArrayList;
import java.util.Scanner;
 

public class JLMLt07e17 {
   public static void main(String[] args) {
       // programa1();
       // programa2();
        programa3();
    
}
static Scanner scanner = new Scanner(System.in);

    public static void programa1() {
        Primitiva2 primitiva = new Primitiva2();
        System.out.println("El boleto premiado es: " + primitiva.getResultado());
        ArrayList<Integer> boleto = new ArrayList<>();

        System.out.println("Introduce tu boleto:");
        for(int i=1; i<=Primitiva.NUMEROS_BOLETO; i++) {
            System.out.printf("%dº número (1-49): ", i);
            boleto.add(scanner.nextInt());
        }

        System.out.println("-------------------------------------");
        System.out.println("Aciertos: " + primitiva.comprobarAciertos(boleto));

    }

    public static void programa2() {
        Primitiva2 primitiva = new Primitiva2();
        int[] frecuenciaAciertos = new int[Primitiva.NUMEROS_BOLETO+1];
        System.out.println("Combinación ganadora: " + primitiva.getResultado());
        System.out.println("Simulando boletos aleatorios:");
        for (int i=1; i<=1000; i++) {
            ArrayList<Integer> boleto = primitiva.boletoAleatorio();
            int aciertos = primitiva.comprobarAciertos(boleto);
            frecuenciaAciertos[aciertos] = frecuenciaAciertos[aciertos]+1;
            System.out.printf("Boleto aleatorio #%d (%s). Aciertos: %d\n", i, boleto, aciertos);
        }

        System.out.println("--------------------------------------");
        for(int i=3; i<=Primitiva2.NUMEROS_BOLETO; i++) {
            System.out.printf("Frecuencia %d aciertos: %d\n", i, frecuenciaAciertos[i]);
        }
    }

    public static void programa3() {
        Primitiva2 primitiva = new Primitiva2();
        boolean parar = false;
        int contador = 0;
        System.out.println("Combinación ganadora: " + primitiva.getResultado());
        System.out.println("Simulando boletos aleatorios:");
        do {
            contador++;
            ArrayList<Integer> boleto = primitiva.boletoAleatorio();
            int aciertos = primitiva.comprobarAciertos(boleto);
            System.out.printf("Boleto aleatorio #%d (%s). Aciertos: %d\n", contador, boleto, aciertos);
            parar = (aciertos == 6);
        } while (!parar);
    }
}
   