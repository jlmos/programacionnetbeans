/* Introducir dos fechas y que calcule cual de las dos es mayor con una sola
sentencia condicional. 
* autor: jose luis mosquera losada
* fecha: 2021-10-19  */
package JLMLt02;

import java.util.Scanner;

public class JLMLt02e12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diaA, mesA, anhoA;
        int diaB, mesB, anhoB;
        int cantidadFecha1; int cantidadFecha2;
        
        System.out.print("Introduce el dia de la fecha A: ");
        diaA = teclado.nextInt();
        System.out.print("Introduce el mes de la fecha A: ");
        mesA = teclado.nextInt();
        System.out.print("Introduce el año de la fecha A: ");
        anhoA = teclado.nextInt();
        System.out.print("Introduce el dia de la fecha B: ");
        diaB = teclado.nextInt();
        System.out.print("Introduce el mes de la fecha B: ");
        mesB = teclado.nextInt();
        System.out.print("Introduce el año de la fecah B: ");
        anhoB = teclado.nextInt();
        cantidadFecha1 = (diaA*10+mesA*1000+anhoA*100000);
        cantidadFecha2 = (diaB*10+mesB*1000+anhoB*100000);
        if (cantidadFecha1>cantidadFecha2) {
            System.out.println("La fecha A: " +diaA +"/"+mesA+"/"+anhoA +" es mayor que la fecha B: " 
                                                   +diaB +"/"+mesB+"/"+anhoB);}
        else {
        System.out.println("La  fecha B: " +diaB +"/"+mesB+"/"+anhoB +" es mayor que la fecha A: "
                                          +diaA +"/"+mesA+"/"+anhoA);
    }
    }
}
       


 
                

