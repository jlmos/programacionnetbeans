/* practica billetes
 */
package Pt03;

import java.util.Scanner;

public class práctica3 {
   public static void main(String[] args) {
       Scanner teclado=new Scanner (System.in);
       int numMes; String nombreMes;
       System.out.println("introduce un numero de mes:");
       numMes=teclado.nextInt();
       switch(numMes){
           case 1: nombreMes="enero";break;
           case 2: nombreMes="febrero";break;
           case 3: nombreMes="marzo";break;
           case 4: nombreMes="abril";break;
           case 5: nombreMes="mayo";break;
           case 6: nombreMes="junio";break;
           case 7: nombreMes="julio";break;
           case 8: nombreMes="agosto";break;
           case 9: nombreMes="septiembre";break;
           case 10: nombreMes="octubre";break;
           case 11: nombreMes="noviembre";break;
           case 12: nombreMes="diciembre";break;
                   default : nombreMes="este Número no corresponde a ningún mes.";
       }
       System.out.println(numMes+ "->"+ nombreMes);
       
    }       
}
    

