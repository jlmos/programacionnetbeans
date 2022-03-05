/* Introducir 30 nºs entre 0 y 1000 y dependiendo si es par o impar mostrar por pantalla 
los 3 1eros o los 3 últimos.
.
autor: jose luis mosquera losada
fecha: 2-11-2021 */
package JLMLt03;

import java.util.Scanner;

public class JLMLt03e31 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1 = 0, numero2 = 0, numero3 = 0, numero28 = 0, numero29 = 0, numero30 = 0;
        int suma = 0;
        for (int i = 1; i <= 30; i++) {
            System.out.println("Introduce el " + i + " numero:");
            int num = teclado.nextInt();
            if (num > 00 && num <= 1000) {
                switch (i) {
                    case 1:
                        numero1 = num;
                        break;
                    case 2:
                        numero2 = num;
                        break;
                    case 3:
                        numero3 = num;
                        break;
                    case 28:
                        numero28 = num;
                        break;
                    case 29:
                        numero29 = num;
                        break;
                    case 30:
                        numero30 = num;
                        break;

                }
                suma += num;

            } else {
                System.out.println("Error. Debe de estar en el rango de 0-1000. Vuelve a intentarlo");
                i--;
            }

        }
        System.out.println("La suma es: "+ suma);
        if (suma%2==0){
            System.out.println("(par)");
            System.out.println("(Los tres primeros números fueron: "+ numero1+ ","+ numero2 +"," +numero3);
            
        }else{
            System.out.println("(impar)");
        }
            System.out.println("(Los tres último números fueron: " + numero28 + "," + numero29 + "," + numero30);
    }
}
