/* introducir hora del día y nos diga que día hay bus
   autor: jose luis mosquera losada
   fecha: 17-10-21*/
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e09 {
     public static void main(String[] args) {
        int hora;
        Scanner teclado = new Scanner(System.in);
          System.out.print("Introduce la hora de cero a veintitres: ");
            hora = teclado.nextInt();
          switch(hora) {
             case 9: case 11: case 13:
             System.out.println(" A esa hora el bus sale los domingos: ");break;  
             case 10:             
             System.out.println(" A esa hora el de bus sale todos los días: ");break;    
             case 12: 
             System.out.println(" A esa hora el bus sale el jueves y el domingos: ");break;
             case 14:
             System.out.println(" A esa hora el bus sale todos los días menos el sábado: ");break;    
             default:
             System.out.println("A esa hora no hay salidas de bus ningún día de la semana: ");break; 
             
             
                      
            }
     }
 }
  
     


