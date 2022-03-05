/* Mostrar los n primeros nº naturales, tecleando el nº de veces anteriormente
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;
import java.util.Scanner;
public class JLMLt03e02 {
    public static void main(String[] args) {
     int i;    
   Scanner teclado=new Scanner (System.in);
        System.out.print("Introduce el nº de veces: ");
   int veces= teclado.nextInt();
            for (i=1; i<=veces;i++){
                System.out.println(i);

    }
    }
    
}
