/* Introducir horas, minutos y segundos. verificar valores, calcular 
 el total de segundos.
* autor: jose luis mosquera losada
* fecha: 2021-10-17  */
package JLMLt02;

import java.util.Scanner;

public class JLMLt02e05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horas,horas2, minutos,minutos2, segundos,segundosTotal, tiempo=0;
        double contador=0;
        System.out.print("Introduce las horas: ");
        horas = teclado.nextInt();
        System.out.print("Introduce los minutos: ");
        minutos = teclado.nextInt();
        System.out.print("Introduce los segundos: ");
        segundos = teclado.nextInt();
        
       if ((horas > 24) && (minutos > 60) && (segundos >60)) {
                System.out.println("la hora es incorrecta:  " + horas + ":" + minutos+":" + segundos+"");
        }
        if (horas >= 24) {
            System.out.println("Te fallan las horas: "+horas);
        }
        if (minutos >= 59) {
            System.out.println("Te fallan los minutos: "+minutos);
        }
        if (segundos >= 59) {
            System.out.println("Te fallan los segundos: "+segundos);
        } 
        if ((horas < 24) && (minutos < 60) && (segundos < 60)) {
                System.out.println("la hora es:  " + horas + ":" + minutos+":" + segundos+"");
         
            horas2= horas*3600;
            minutos2= minutos*60;
            segundosTotal= horas2+minutos2+segundos;
            
            System.out.println("Tiempo en segundos desde el comienzo del día es: " +segundosTotal+" segundos.");
            }
       }
        }

    

