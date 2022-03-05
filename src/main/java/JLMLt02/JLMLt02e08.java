/* Verificar datos de entrada y nos diga si hay bus o no
   autor: jose luis mosquera losada
   fecha: 17-10-21 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e08 {
     public static void main(String[] args) {
        int dia,hora;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el día de uno a siete: ");
            dia = teclado.nextInt();
        System.out.print("Introduce la hora de nueve a catorce ");
            hora = teclado.nextInt();
           
         if(dia==7 || hora ==10 || (hora==14 && dia!=6)||(dia ==4 && (hora % 2)==0))
                 { System.out.println("hay bus");
         } else{ System.out.println("No hay bus");}
            }
      }
  
     


