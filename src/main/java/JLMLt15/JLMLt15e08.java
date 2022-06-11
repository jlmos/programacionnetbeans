/*Realizar un programa al que se le introduzca un año y genere un array con las temperaturas
medias de una ciudad para todos los días de ese año (365 ó 366). La temperatura será un 
entero entre 10 y 30 grados. Almacena en un Mapa la distribución de temperaturas, es decir, para cada
temmperatura, cuantos días del año hubo y muestra dicha distribución.
autor: jose luis mosquera losada
fecha: 27-05-2022*/
package JLMLt15;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class JLMLt15e08 {

    static Scanner teclado;
    static HashMap<String,Integer> plantilla;
    

    public static void main(String[] args) {

        

        HashMap<Integer, Integer> temperatura = new HashMap<>();
        int a;
        int temp[];
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el año: ");
        a = Integer.valueOf(teclado.nextLine());
        if (esBisiesto(a)) {
            temp = new int[366];
            for (int i = 0; i < 366; i++) {
                temp[i] = aleatorio.nextInt(20) + 10;
            }
        } else {
            temp = new int[365];
            for (int i = 0; i < 365; i++) {
                temp[i] = aleatorio.nextInt(20) + 10;
            }
        }

        for (int i = 10; i < 31; i++) {
            temperatura.put(i, 0);
        }

        for (int i = 0; i < temp.length; i++) {
            temperatura.put(temp[i], temperatura.get(temp[i]) + 1);
        }

        for (Integer t : temperatura.keySet()) {
            System.out.println(t + " : " + temperatura.get(t));
        }

    }

    static boolean esBisiesto(int a) {
        if (((a % 4) == 0) && ((a % 100) != 0) || ((a % 400) == 0)) {
            return true;
        } else {
            return false;
        }
    }

}

    

