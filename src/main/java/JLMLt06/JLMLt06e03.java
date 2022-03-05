/*programa en el que se cree una cuenta corriente con saldo cero
y mediante menú, porder ingresar, retirar y consultar saldo.
el único atributo público el IBAN, los otros privados.
autor: jose luis mosquera losada
fecha: 12-01-2022*/
package JLMLt06;

import java.util.Scanner;

public class JLMLt06e03 {

    static Scanner teclado;

    public static void main(String[] args) {

        BCuentaCorriente cuentaCorriente = new BCuentaCorriente("ABCDEFGHIJKLMNÑOPQRSTUVW");
        cuentaCorriente.setComision(0.1f, 2);

        teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        float importe;

        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("Cuánto quieres ingresar?: ");
                    importe = teclado.nextFloat();
                    cuentaCorriente.ingresar(importe);
                    System.out.println("Se ha ingresado correctamente");
                    break;
                case 2:
                    System.out.println("Cuánto quiere retirar?: ");
                    float retirada = teclado.nextFloat();
                    if (cuentaCorriente.retirar(retirada)) {

                        System.out.println("Se ha retirado correctamente");

                    } else {
                        System.out.println("No tiene saldo suficiente");
                    }

                    break;

                case 3:
                    System.out.println("El saldo final es: " + cuentaCorriente.getSaldo());

                    break;
                case 0:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }  // fin main    

    private static int pintarMenu() {
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Ingresar");
        System.out.println("2 Retirar");
        System.out.println("3 Consultar");
        System.out.println("0 Salir del programa");
        try {
            return Integer.parseInt(teclado.next());
        } catch (Exception e) {
            return 999;
        }
    }

}
