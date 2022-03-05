/* Mostrar los nºs perfectos entre 1 y 10000.
autor: jose luis mosquera losada
fecha: 31-10-2021 
no está acabado*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e14a {

    public static void main(String[] args) {
        int i, suma = 0, n;
        Scanner teclado = new Scanner(System.in);

        
            System.out.print("Introduce un número entre 1 y 10000: ");
            n = teclado.nextInt();
            if (n < 0 || n >= 10000) {
                System.out.print("Error en el nº introducido, tiene que ser entre 1 y 10000:");
                n = teclado.nextInt();
                if (n > 1 && n < 10000) {
                    // me detecta solo la 1era vez el numero introducido fuera de rango,
                    // no me detecta si pongo más de dos o más números fuera de rango.
                }
            }
            
            for (i = 1; i < n; i++) {  // desde valor 1. condiciona a dividir en rango 1 hasta n y lo incrementa en 1                          
                if (n % i == 0) {     // 1ero la división y después la suma
                    suma = suma + i;
                }
            }
                    if (suma == n) {           // si la suma de los divisores es igual al número, es perfecto                
                        System.out.println("El número: " + n + " es perfecto: ");
                    } else {
                        System.out.println(+ n + " no es perfecto" );
                        
                    }

                }}

            
        

    
