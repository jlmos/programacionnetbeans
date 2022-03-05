/* Introducir coeficientes, calcular los valores para x e y valorar casos para los 
 cuales no funcione el algoritmo.
* autor: jose luis mosquera losada
* fecha: 2021-10-17  */
package JLMLt02;

import java.util.Scanner;

public class JLMLt02e06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      double a,b,c,d,e,f;
      double x=0,y=0;
        System.out.println("Introducir coeficiente a: ");
        a=teclado.nextInt();
        System.out.println("Introducir coeficiente b: ");
        b=teclado.nextInt();
        System.out.println("Introducir coeficiente c: ");
        c=teclado.nextInt();
        System.out.println("Introducir coeficiente d: ");
        d=teclado.nextInt();
        System.out.println("Introducir coeficiente e: ");
        e=teclado.nextInt();
        System.out.println("Introducir coeficiente f: ");
        f=teclado.nextInt();
        if (a!=0&&e!=0&&b!=0&&d!=0)
         { x=(c*e)-(b*f)/(a*e)-(b*d);
            System.out.println("El valor de x es: " +x);}
        if (a!=0&&e!=0&&b!=0&&d!=0)
        {  y=(a*f)-(c*d)/(a*e)-(b*d);
            System.out.println("El valor de y es: " +y);}
        else 
        {System.out.println("El denominador no puede ser cero");}
        c=(a*x)+(b*y);
                    System.out.println("El valor de c es: " +c);
        f=(d*x)+(e*y);
                    System.out.println("El valor de f es: " +f);
                 
         
       }
        }

    

