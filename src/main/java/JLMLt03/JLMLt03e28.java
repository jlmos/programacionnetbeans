/* leer dos valores enteros m y n y mostrar la suma, la media y el producto de esos
nºs pares comprendidos entre ellos, sin saber que el 1ero es menor que el segundo
autor: jose luis mosquera losada
fecha: 1-11-2021*/
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e28 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1, numero2, numeroMayor, numeroMenor;
        int suma = 0;
        int producto=1;
        int cantidadNumeros = 0;

        System.out.print("introduce un nº: ");
        numero1 = teclado.nextInt();
        System.out.print("introduce otro nº: ");
        numero2 = teclado.nextInt();
        if (numero1 > numero2) {
            numeroMayor = numero1;
            numeroMenor = numero2;

        } else {
            numeroMayor = numero2;
            numeroMenor = numero1;
        }
            for (int i = numeroMenor+1; i<numeroMayor; i++) {
                if(i % 2 == 0){
                    suma +=i;
                    producto+=i;
                    cantidadNumeros++;
                    System.out.println("Se ha procesado el número "+i);
                }

            }

            System.out.println("");
            System.out.println("------------------------------");
            System.out.println("Suma: "+ suma);
            System.out.println("Producto: "+ producto);
            System.out.println("Media: "+ (suma/cantidadNumeros));
        }
    }

    /* */
