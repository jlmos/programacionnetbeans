/*
 * ejemplo
 */
package Pt03;
import java.util.Scanner;
public class JLMLt0301 {
public static void main(String args[]){
Scanner teclado = new Scanner (System.in);
    System.out.println("Introduce un entero positivo menor que 10:");
    int valor = teclado.nextInt();
    for (int i=1; i<=10; i+=3) {
        System.out.println (valor + "x" +i + "=" + (valor*i));
    }
    
    }
    
}
