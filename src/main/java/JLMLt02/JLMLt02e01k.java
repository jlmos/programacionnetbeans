/* Leer un número y decir si es múltiplo de 2,3 y/o 10.
autor: jose luis mosquera losada
fecha: 17-10-21 */
package JLMLt02;

import java.util.Scanner;

public class JLMLt02e01k {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, multiplo;
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        System.out.println("Escoge un múltiplo entre 2,3 y 10: ");
        multiplo = teclado.nextInt();
         
         if (numero % multiplo==0 && multiplo !=2 && multiplo !=3 &&multiplo !=10)
         System.out.println("el número introducido no es multiplo de 2,3 y/o 10");
         else if (numero==0)
             System.out.println(" El cero es multiplo de todos los números");
         else if (numero % multiplo == 0 && multiplo==10)
            System.out.println(" El número es múltiplo de 10 y también de 2");
         else if (numero% multiplo ==0 && multiplo==2 && numero>10)
             System.out.println(" El número es multiplo de 2 y de 10");
         else if (numero % multiplo == 0)
            System.out.println("El número introducido " + numero + " es múltiplo de " + multiplo);
         else {
                System.out.println("El número No es múltiplo de ninguno de los solicitados");
        
    
    }
}
}