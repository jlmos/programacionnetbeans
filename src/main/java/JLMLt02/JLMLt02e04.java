/* Introducir coordenadas. Mostras si es un cuadrado o un rectángulo
 y calcular el área 
* autor: jose luis mosquera losada
* fecha: 2021-10-17  */
package JLMLt02;
import java.util.Scanner;
public class JLMLt02e04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int x1,x2,y1,y2,res1,res2,area;
        
        System.out.print ("Introduce la coordenada x1: ");
        x1 = teclado.nextInt();
        System.out.print ("Introduce la coordenada x2: ");
        x2 = teclado.nextInt();
        System.out.print ("Introduce la coordenada y1: ");
        y1 = teclado.nextInt();
        System.out.print ("Introduce la coordenada y2: ");
        y2 = teclado.nextInt();
        
        res1 = (x2 - x1);
        res2 = (y2 - y1);
        area = Math.abs (res1 * res2);
        if (res1==res2) 
        { System.out.println("La forma es un cuadrado");
         System.out.println("el área es " + area); }
        if (res1!=res2) 
        {System.out.println("La forma es un rectángulo");
         System.out.println("el área  es " + area);}
        
    }
    }
