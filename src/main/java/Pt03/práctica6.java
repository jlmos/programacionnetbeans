/* año bisiesto
 */
package Pt03;

import java.util.Scanner;


public class práctica6 {
   public static void main(String[] args) {
      Scanner teclado =new Scanner(System.in);
      char eleccion=' '; int num;
       System.out.print("Introduzca un numero:");
       num=teclado.nextInt();
       do{ 
           System.out.println("Elija letra:\n a) Elevar al cuadrado");
           System.out.println(" b) Raiz cuadrada \n Otra tecla para salir");
             eleccion= teclado.next().charAt(0);
             if (eleccion =='a')System.out.println(Math.pow(num, 2));
             else if (eleccion=='b')System.out.println(Math.sqrt(num));
       } while (eleccion =='a'||eleccion=='b');
      }}     

    

