/* Introducir sueldo, cantidad de horas extras y cantidad de ventas. Mostrar el 
sueldo final, total de ventas. preguntar si hay + vendedores a tratar, finalizar
 con negación.
autor: jose luis mosquera losada
fecha: 31-10-2021*/
package JLMLt03;

import java.util.Scanner;
public class JLMLt03e22 {
    public static void main(String[] args)  {

        Scanner teclado = new Scanner(System.in);
       
                int contador = 0;
        int totalVentas = 0;
        int salarioMayorVendedor = 0;
        int recordVentas = 0;


        while(true) {
            contador++;

            System.out.println("Vendedor "+contador+":");
            System.out.print("Sueldo base: ");
            int sueldoBase = teclado.nextInt();
            System.out.print("Horas extra: ");
            int horasExtra = teclado.nextInt();
            System.out.print("Ventas: ");
            int ventas = teclado.nextInt();

            int plusPorVentas = 0;
            if(ventas > 30) {
                plusPorVentas = 1300;
            } else if (ventas > 20) {
                plusPorVentas = 1000;
            } else if (ventas > 10) {
                plusPorVentas = 500;
            }
            int sueldo = sueldoBase + horasExtra*100 + plusPorVentas;

            totalVentas += ventas;

            if (ventas > recordVentas) {
                recordVentas = ventas;
                salarioMayorVendedor = sueldo;
            }

            System.out.print("Continuar ejecución? (S/N):");
            String continuar = teclado.next();
            if (continuar.equals("S")) {
                System.out.println("-----------------------------");
            } else {
                break;
            }

        }

        System.out.println();
        System.out.println("Total de ventas: "+totalVentas);
        System.out.println("Salario del vendedor con más ventas: " + salarioMayorVendedor);

    }


}      
            
            
    




