/* introducir un nº, garantizar que es + para si - seguir hasta que sea +.
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;
import java.util.Scanner;
public class JLMLt03e13 {
    public static void main(String[] args) {
                 Scanner teclado =new Scanner(System.in);
        int numEnter = 0;
    do {
      System.out.print("Introduzca un número entero: ");
      numEnter = teclado.nextInt();
      if(numEnter <= 0) {
        System.out.println("Error, debe introducir OTRO número.");
      }
    } while (numEnter <= 0);
        System.out.println("FANTÁSTICO: El numero entero "+numEnter +" es positivo");
    
  }
}
    

/*¿Es necesario poner los dos system y los dos sumaTotal? */
