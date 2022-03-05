/* Introducir horas, minutos y segundos. verificar valores, calcular 
 el total de segundos.
* autor: jose luis mosquera losada
* fecha: 2021-10-17  */
package JLMLt02;

import java.util.Scanner;

public class JLMLt02e10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int  dia, mes, año;
        int maxDias=0;
        
         System.out.print("Introduce el dia: ");
         dia = teclado.nextInt();
         System.out.print("Introduce el mes: ");
         mes = teclado.nextInt();
         System.out.print("Introduce el año: ");
         año = teclado.nextInt();
         switch (mes){
             case 1: case 3: case 5: case 7: case 8: case 10: case 12:
               maxDias = 31; break;
             case 4: case 6: case 9: case 11:
                maxDias = 30; break;
             case 2:
                maxDias = 29; break;
         }
          if(mes < 1 || mes > 12)   {   
                 System.out.println("Mes incorrecto");
          }  else if (dia <1 || dia > maxDias) {
                 System.out.println("Día inocrrecto");
          }  else {
              System.out.println("La fecha introducida es correcta");
          }
            }
       }
        

    

