/* introducir el DNI y nos diga la letra correspondiente. Hacerlo con Switch
   autor: jose luis mosquera losada
   fecha: 19-10-17 */
package JLMLt02;
import java.util.Scanner;
 public class JLMLt02e14 {
     public static void main(String[] args) {
        int dni; int letraDNI;
        Scanner teclado = new Scanner(System.in);
          System.out.print("Introduce el DNI sin letra: ");
            dni = teclado.nextInt();
            letraDNI= dni%23;
          switch(letraDNI) {
             case 0: 
             System.out.println(" la letra del DNI es la: T" );break;  
             case 1: 
             System.out.println(" la letra del DNI es la: R" );break;  
             case 2: 
             System.out.println(" la letra del DNI es la: W" );break;  
             case 3:
             System.out.println(" la letra del DNI es la: A" );break;  
             case 4:             
             System.out.println(" la letra del DNI es la: G" );break;    
             case 5: 
             System.out.println(" la letra del DNI es la: M" );break;
             case 6:
             System.out.println(" la letra del DNI es la: Y" );break;    
             case 7:
             System.out.println(" la letra del DNI es la: F" );break;  
             case 8: 
             System.out.println(" la letra del DNI es la: P" );break;  
             case 9: 
             System.out.println(" la letra del DNI es la: D" );break;  
             case 10:
             System.out.println(" la letra del DNI es la: X" );break;  
             case 11:             
             System.out.println(" la letra del DNI es la: B" );break;    
             case 12: 
             System.out.println(" la letra del DNI es la: N" );break;
             case 13:
             System.out.println(" la letra del DNI es la: J" );break;    
             case 14:
             System.out.println(" la letra del DNI es la: Z" );break;  
             case 15:
             System.out.println(" la letra del DNI es la: S" );break;  
             case 16: 
             System.out.println(" la letra del DNI es la: Q" );break;  
             case 17: 
             System.out.println(" la letra del DNI es la: V" );break;  
             case 18:
             System.out.println(" la letra del DNI es la: H" );break;  
             case 19:             
             System.out.println(" la letra del DNI es la: L" );break;    
             case 20: 
             System.out.println(" la letra del DNI es la: C" );break;
             case 21:
             System.out.println(" la letra del DNI es la: K" );break;    
             case 22:
             System.out.println(" la letra del DNI es la: E" );break;  
    
             }
     }
 }
  
     


