/*Calculo del área de un rectángulo sin considerar que se introduzcan 
* valores negativos
* autor: jose luis mosquera losada
* fecha: 2021-10-10  */
package JLMLt01;
import java.util.Scanner;
public class JLMt01e10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int x, y, area;
        
        System.out.print ("Introduce la coordenada x: ");
        x = teclado.nextInt();
        System.out.print ("Introduce la coordenada y: ");
        y = teclado.nextInt();
        area = x * y;
        System.out.println("el área del rectángulo es " + area);
    }
    
}
