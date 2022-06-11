/*Realizar un programa que genere un array con las temperaturas medias de un año no bisiesto.
La temperatura será un entero entre 10 y 30 grados. Ayudandote de un TreeMap, muestra la 
temperatura mínima y cuantas ocurrencias tuvo y lo mismo para la temperatura máxima.
autor: jose luis mosquera losada
fecha: 6-06-2022*/
package JLMLt15;

import java.util.TreeMap;
import java.util.Random;
import java.util.Scanner;

public class JLMLt15e09 {

    static Scanner teclado;
    static TreeMap<String,Integer> plantilla;
    

    public static void main(String[] args) {

        

        TreeMap<Integer, Integer> temperatura = new TreeMap<>();
        int a;
        int temp[];
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el año: ");
        a = Integer.valueOf(teclado.nextLine());
        
            temp = new int[365];
            for (int i = 0; i < 365; i++) {
                temp[i] = aleatorio.nextInt(20) + 10;
            
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

    

