/*Modificar el programa del ejercicio 9.05 para que el usuario tenga un Array de 
5 teléfonos y que despues de elegir la operación a realizar pueda elegir con cuál 
de los 5 teléfonos desea hacerla.
autor: jose luis mosquera losada
fecha: 29-01-2022 */
package JLMLt09;
import JLMLt08.MovilPlus;
import JLMLt08.MovilPrepago;
import JLMLt08.MovilTarifaPlana;
import java.util.ArrayList;

import java.util.Scanner;



public class JLMLt09e06 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<MovilPrepago> moviles = new ArrayList<>();
        moviles.add(new MovilPlus(111111111, 0.05F, 0.10F, 5));
        moviles.add(new MovilPlus(222222222, 0.05F, 0.10F, 30));
        moviles.add(new MovilTarifaPlana(333333333, 0.10F, 0.05F, 15));
        moviles.add(new MovilPrepago(444444444, 0.15F, 0.04F, 0.20F, 50));
        moviles.add(new MovilPrepago(555555555, 0.15F, 0.04F, 0.20F, 30));
        boolean salir = false;
        int opcion;
        do {
            opcion=pintarMenu();
            System.out.printf("Desde qué móvil? (1-%d): ", moviles.size());
            int movil = scanner.nextInt();
            MovilPrepago movilPrepago = moviles.get(movil);
            switch (opcion) {
                case 1:
                    System.out.print("Cuánto quieres navegar? ");
                    int mb = scanner.nextInt();
                    movilPrepago.navegar(mb);
                    System.out.println("Navegación terminada");
                    break;
                case 2:
                    System.out.print("Cuántos segundos quieres llamar? ");
                    int segundos = scanner.nextInt();
                    movilPrepago.efectuarLlamada(segundos);
                    break;
                case 3:
                    System.out.print("Cuánto quieres recargar? ");
                    int recarga = scanner.nextInt();
                    movilPrepago.recargar(recarga);
                    break;
                case 4:
                    if( movilPrepago instanceof MovilPlus) {
                        System.out.print("Cuánto quieres videollamar? ");
                        int segundosVideollamada = scanner.nextInt();
                        ((MovilPlus) movilPrepago).videollamada(segundosVideollamada);
                    } else {
                        System.out.println("Operación no soportada");
                    }
                    break;
                case 5:
                    System.out.println("Saldo: " + movilPrepago.getSaldo());
                    break;
                case 0: salir=true; break;
                default: System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu (){
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Navegar");
        System.out.println("2 Llamar");
        System.out.println("3 Recargar");
        System.out.println("4 Videollamar");
        System.out.println("5 Ver saldo");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt (scanner.next());
        } catch (Exception e ) {return 999;}
    }

}