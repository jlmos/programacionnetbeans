/*
Datos estadísticos de una asignatura
* autor: jose luis mosquera losada
 * fecha: 2021-10-10*/
package JLMLt01;
import java.util.Scanner;
public class JLMt01e04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int sus, suf, not, sob, nalum;
        double aproba, notsob;

        System.out.print("introduce el número de suspensos: ");
        sus = teclado.nextInt();
        System.out.print("introduce el número de suficientes: ");
        suf = teclado.nextInt();
        System.out.print("introduce el número de notables: ");
        not = teclado.nextInt();
        System.out.print("introduce el número de sobresalientes: ");
        sob = teclado.nextInt();
        nalum = sus + suf + not + sob;
        aproba = (double) ((suf+not+sob)* 100) / nalum;
        notsob = (double) ((not + sob)* 100) /  nalum;

        System.out.println("el tanto por ciento de aprobados es " + aproba +"%");
        System.out.println("el tanto por ciento de notables y sobresalientes son  " + notsob+ "%");
        
    }

}
