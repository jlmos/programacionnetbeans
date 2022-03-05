/*Haz un programa que cree inicialmente una cuenta a plazo y luego, mediante un menú,
permita ingresar, retirar y consultar el saldo.
autor: jose luis mosquera losada
fecha: 22-01-2022 */
package JLMLt08;

import java.util.ArrayList;
import java.util.Scanner;

public class JLMLt08e09 {

    static Scanner teclado;

    public static void main(String[] args) {

        CuentaPlazo cuentaPlazo = new CuentaPlazo("565126561723");

        teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.print("Cuánto quieres ingresar? ");
                    float importe = teclado.nextFloat();
                    cuentaPlazo.ingresar(importe);
                    System.out.println("Se ha ingresado correctamente");
                    break;
                case 2:
                    System.out.print("Cuánto quieres retirar? ");
                    float retirada = teclado.nextFloat();
                    if (cuentaPlazo.retirar(retirada)) {
                    
                        System.out.println("Se ha retirado correctamente");

                    } else {
                        System.out.println("No tiene saldo suficiente");
                    }
                    break;
                case 3:
                    System.out.printf("El saldo de la cuenta es de %.2f", cuentaPlazo.getSaldo());
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        
    
    }
    while (!salir


);
    }

    private static int pintarMenu() {
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Ingresar saldo");
        System.out.println("2 Retirar saldo");
        System.out.println("3 Consultar saldo");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.next());
        } catch (Exception e) {
            return 999;
        }
    }

}
