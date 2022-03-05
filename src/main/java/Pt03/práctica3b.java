/* practica billetes
 */
package Pt03;

import java.util.Scanner;

public class práctica3b {
   public static void main(String[] args) {
       Scanner teclado=new Scanner (System.in);
       int numMes, numDias = 0; 
       String nombreMes = null;
       System.out.print("introduce un numero de mes:");
       numMes=teclado.nextInt();
       switch(numMes){
           case 1: nombreMes="enero";numDias=31;break;
           case 3: 
           case 5: 
           case 7: 
           case 8: 
           case 10: 
           case 12:nombreMes="diciembre"; numDias=31;break;
           case 2: numDias=28;break;
           case 4: 
           case 6: 
           case 9: 
           case 11: numDias=30;break;
           default : numDias=-1;break;
       }
       System.out.println("El numero de mes " +numMes+ " ( "+ nombreMes+" ) tiene "+ numDias +" días");
       
    }       
}
    

