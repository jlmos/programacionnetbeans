/*Empleando las clases previas: MovilPrepago, MovilTarifaPlana y MovilPlus realizar un 
programa que permita seleccionar al usuario qué tipo de tarifa tiene entre las 3 posibles,
luego configurar el móvil solicitando al usuario los parámetros necesarios y finalmente 
presentará al usuario un menú para realizar las operaciones permitidas (navegar,llamar,
recargar, videollamar, ver saldo y salir) según el tipo de tarifa.
autor: jose luis mosquera losada
fecha: 27-01-2022 */
package JLMLt09;
import JLMLt08.MovilPlus;
import JLMLt08.MovilPrepago;
import JLMLt08.MovilTarifaPlana;
import java.util.Scanner;



public class JLMLt09e05 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MovilPrepago movilPrepago;

        System.out.println("Selecciona el tipo de movil.");
        System.out.print("MovilPrepago (1), MovilTarifaPlana (2) o MovilPlus(3)?: ");
        int eleccion = scanner.nextInt();
        System.out.println("-------------------------------\n");

        switch (eleccion) {
            case 1:
                System.out.println("Configurando MovilPrepago...");
                System.out.print("Introduce número: ");
                int numero = scanner.nextInt();
                System.out.print("Introduce coste establecimiento: ");
                float costeEstablecimiento = scanner.nextFloat();
                System.out.print("Introduce coste minuto: ");
                float costeMinuto = scanner.nextFloat();
                System.out.print("Introduce coste MB: ");
                float costeMB = scanner.nextFloat();
                System.out.print("Introduce saldo: ");
                float saldo = scanner.nextFloat();
                movilPrepago = new MovilPrepago(numero, costeEstablecimiento, costeMinuto, costeMB, saldo);
                break;
            case 2:
                System.out.println("Configurando MovilTarifaPlana...");
                System.out.print("Introduce número: ");
                int numero2 = scanner.nextInt();
                System.out.print("Introduce coste establecimiento: ");
                float costeEstablecimiento2 = scanner.nextFloat();
                System.out.print("Introduce coste minuto: ");
                float costeMinuto2 = scanner.nextFloat();
                System.out.print("Introduce saldo: ");
                float saldo2 = scanner.nextFloat();
                movilPrepago = new MovilTarifaPlana(numero2, costeEstablecimiento2, costeMinuto2, saldo2);
                break;
            case 3:
                System.out.println("Configurando MovilPlus...");
                System.out.print("Introduce número: ");
                int numero3 = scanner.nextInt();
                System.out.print("Introduce coste establecimiento: ");
                float costeMinuto3 = scanner.nextFloat();
                System.out.print("Introduce coste MB: ");
                float costeMB3 = scanner.nextFloat();
                System.out.print("Introduce saldo: ");
                float saldo3 = scanner.nextFloat();
                movilPrepago = new MovilPlus(numero3, costeMinuto3, costeMB3, saldo3);
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }
        System.out.println("--------------------------\n");

        boolean salir = false;
        int opcion;
        do {
            opcion=pintarMenu (movilPrepago);
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

    private static int pintarMenu (MovilPrepago movilPrepago){
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Navegar");
        if(movilPrepago instanceof MovilTarifaPlana)
          System.out.println("(Esta tarifa te permite navegar gratis)");
        System.out.println("2 Llamar");
        System.out.println("3 Recargar");
        if(movilPrepago instanceof MovilPlus) System.out.println("4 Videollamar");
        System.out.println("5 Ver saldo");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt (scanner.next());
        } catch (Exception e ) {return 999;}
    }
}