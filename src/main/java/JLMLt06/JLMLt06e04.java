/* idem que el 6.03 pero creando dos cuentas con una opción de menú nueva para 
pasar de una cuenta a otra y con una variable llamada cuentaActiva que unas veces
apuntará a una cuenta y otras veces a la otra.
autor: jose luis mosquera losada
fecha: 12-01-2022*/
package JLMLt06;

import java.util.Scanner;

public class JLMLt06e04 {

    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.print("Indica el número de cuenta  IBAN 1: ");
        String iban = teclado.nextLine();
        System.out.print("Indica el número de cuenta  IBAN 2: ");
        String iban2 = teclado.nextLine();
        BCuentaCorriente cuenta = new BCuentaCorriente(iban);
        BCuentaCorriente cuenta2 = new BCuentaCorriente(iban2);
        BCuentaCorriente BCuentaActiva = cuenta;
        cuenta.setComision(0.1f, 2);
        cuenta2.setComision(0.1f, 2);

        System.out.print("indica que cuenta quieres consultar: 1-2: ");
        int respuesta = teclado.nextInt();
        if (respuesta == 1) {
            BCuentaActiva = cuenta;
        } else if (respuesta == 2) {
            BCuentaActiva = cuenta2;
        }
        boolean salir = false;
        int opcion;
        float importe;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("Cuánto quieres ingresar? ");
                    importe = teclado.nextFloat();
                    BCuentaActiva.ingresar(importe);
                    System.out.println("Se ha ingresado correctamente");

                    break;
                case 2:
                    System.out.println("Cuánto quieres retirar? ");
                    float retirada = teclado.nextFloat();
                    if (BCuentaActiva.retirar(retirada)) {

                    System.out.println("Se ha retirado correctamente");

                    } else {
                    System.out.println("No tiene saldo suficiente");
                    }

                    break;
                case 3:
                    System.out.println("El saldo final es " + BCuentaActiva.getSaldo());

                    break;
                case 4:
                    if (cuenta == BCuentaActiva) {
                        BCuentaActiva = cuenta2;
                    } else if (cuenta2 == BCuentaActiva) {
                        BCuentaActiva = cuenta;
                    }
                    break;
                case 0:
                    salir = true;
                    break;

            }
        } while (!salir);

    }

    private static int pintarMenu() {
        System.out.println("\n\n\n");
        System.out.println("Elige opción ");
        System.out.println("1. Ingresar");
        System.out.println("2. Retirar");
        System.out.println("3. Consultar saldo cuenta");
        System.out.println("4. Cambiar cuenta activa ");
        System.out.println("0. Salir ");
        try {
            return Integer.parseInt(teclado.next());
        } catch (Exception e) {
            return 999;
        }
    }
}
