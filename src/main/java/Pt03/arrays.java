/*
 * ejemplo
 */
package Pt03;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    public static void main(String args[]) {
        // int[]MiArray=new int[]{10,20,12,1,2,3,};
        // int[] MiArray = {10, 20, 12, 1, 2, 3};
        // int[] edad = {18, 20, 32};
        int[] edad = new int[3]; // ctrl+shitf*bajar

        for (int i = 0; i < edad.length; i++) {
            //  System.out.println(edad[i]);
            System.out.println("introduce edad:");
            edad[i] = (new Scanner(System.in)).nextInt();
            for (int e : edad) {
                System.out.println("----" + e);
            }
        }
        for (int i = 0; i < edad.length; i++) {
            edad[0] = 2;
        }

        System.out.println(Arrays.toString(edad));
        System.out.println(edad[1]);
        System.out.println("introduce edad buscada");
        int num = (new Scanner(System.in)).nextInt();
        boolean encontrado = false, fin = false;
        int i = 0;
        while (!encontrado && !fin) {
            if (num == edad[i]) {
                encontrado = true;
            } else if (i == edad.length - 1) {
                fin = true;
            } else {
                i++;
            }
        }
        System.out.println(encontrado ? " encontrado" : "no encontrado");

        /*   System.out.println("introduce edad buscada");
            int num = (new Scanner(System.in)).nextInt();
        boolean encontrado = false;
        for (int i=0; i<edad.length;i++){
            if(num==edad[i]){ encontrado=true; break;
        }
        }     System.out.println(encontrado ? " encontrado" : "no encontrado");*/
    }
}
