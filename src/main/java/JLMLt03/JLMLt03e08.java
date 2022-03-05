/* calcular la suma de los 100 números siguientes a uno, tecleado previamente
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;
import java.util.Scanner;
public class JLMLt03e08 {
    public static void main(String[] args) {
                 Scanner teclado =new Scanner(System.in);
        int numEnter = 0;
    
    do {
      System.out.print("Introduzca un número entero positivo: ");
      numEnter = teclado.nextInt();
      
      if(numEnter < 0) {
        System.out.println("Error, debe introducir un número positivo.");
      }
    } while (numEnter < 0);
    
    int suma = 0;
    
    for(int i = numEnter; i < numEnter + 100; i++) {
      suma += i;
    }

    System.out.println("La suma de los 100 números siguientes a " + numEnter + " es " + suma);
  }
}
    

/*¿Es necesario poner los dos system y los dos sumaTotal? */
