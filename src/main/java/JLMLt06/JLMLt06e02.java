/* programa para dar de alta un teléfono con unas características determinadas y 
mediante menú poder hacer operaciones con el modeloMenú
autor: jose luis mosquera losada
fecha: 28-12-2021*/
package JLMLt06;

import java.util.Scanner;

public class JLMLt06e02 {

    static Scanner teclado;

    public static void main(String[] args) {
        AMovilPrepago movil = new AMovilPrepago(123456789, 0.10f, 0.05f, 0.05f, 50);
        teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println(movil.consultarSaldo());
                    break;
                case 2:
                    System.out.println("¿Cuánto quieres recargar?");
                    int recarga = teclado.nextInt();
                    boolean resultadoRecarga = movil.recargar(recarga);
                    if (resultadoRecarga) {
                        System.out.println("Recarga correcta");
                    } else {
                        System.out.println("Recarga incorrecta");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuántos segundos quieres gastar?");
                    int segundos = teclado.nextInt();
                    movil.efectuarLlamada(segundos);
                    System.out.println("Te queda de saldo: " + movil.consultarSaldo());
                    break;
                case 4:
                    System.out.println("¿Cuántos megas quieres para navegar?");
                    int navegar = teclado.nextInt();
                    movil.navegar(navegar);
                    System.out.println("Te queda de saldo: " + movil.consultarSaldo());
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
        System.out.println("1 Consultar saldo");
        System.out.println("2 Recargar saldo");
        System.out.println("3 Hacer llamada");
        System.out.println("4 Navegar");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero harÃ­a return 999
            return Integer.parseInt(teclado.next());
        } catch (Exception e) {
            return 999;
        }
    }

}
