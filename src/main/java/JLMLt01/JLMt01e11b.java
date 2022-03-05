/* Conocer el valor de la hipotenusa con un cálculo automático 
*con una estructura más simple
* autor: jose luis mosquera losada
* fecha: 2021-10-10 */
package JLMLt01;
import java.util.Scanner;
public class JLMt01e11b {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double catA, catB;
           
        System.out.print ("Introduzca la longitud del cateto A: ");
        catA = teclado.nextInt();
        System.out.print ("Introduzca la longitud del cateto B: ");
        catB = teclado.nextInt();
        System.out.println("el valor de la hipotenusa es " 
                  + Math.sqrt(Math.pow(catA, 2)+ Math.pow(catB,2)));
    }
    
}

