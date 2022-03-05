/* Introducir nºs positivos hasta salir con -1 y sacar suma acumulada 
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;
import java.util.Scanner;
public class JLMLt03e05 {
    public static void main(String[] args) {
         Scanner teclado =new Scanner(System.in);

        int i=0, sumaTotal=0;
         while (i !=-1) {
          sumaTotal +=i;
          System.out.print("introduce un nº: ");
          i = teclado.nextInt();
        }
         System.out.println("la suma total es: " + sumaTotal);
          }
    }
/*importante donde colocamos la operción de suma +1
no entiendo aumulador=acumulador+nuevo valor*/
    

