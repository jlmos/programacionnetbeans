/* leer notas y mostrar la nota.
   autor: jose luis mosquera losada
   fecha: 17-10-10 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e13 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
   int nota;      
         System.out.print("Introduce la nota del examen:");
           nota = teclado.nextInt();
         switch(nota) {
             case 0:
             case 1:
             case 2:
                 System.out.println("La nota es Muy Deficiente: ");break;
             case 3: 
             case 4:
                 System.out.println("La nota es Insuficiente: ");break;
             case 5: 
             case 6:
                 System.out.println("La nota es Aprobado: ");break;
                 
             case 7: 
             case 8:    
                 System.out.println("La nota es Notable: ");break;
             
             case 9:
             case 10: 
                 System.out.println("La nota es Sobresaliente: ");break;
             default: System.out.println("La nota es incorrecta");
         }
     }
     }
 
          
     


