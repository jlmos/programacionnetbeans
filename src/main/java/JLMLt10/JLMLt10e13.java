/* Gestión de las habitaciones de un hotel. Todas las habitaciones tienen un nº de 
habitación y un proceso de check-in y check-out. En el hotel hay estas habitaciones:
3 de LowCost(50 euros x día).
10 dobles (100 euros x día ++ 20% de incremento si el día de salida es abril, julio o agosto).
5 suite (200 euros x día con 20 % descuento para estancias de 10 ó más días)
Programa con 18 habitaciones (ArrayList) y las marcará como no ocupadas
Menú con check in entre habitaciones libres, check out las ocupadas y listar ambas.
Check in común para todas las habitaciones y las marcará como ocupadas.
Check out marca la habitación como libre y calcula el importe a pagar.
Mantener toda la información en las clases más que en el programa.
Considerar cada día como un segundo para que los datos sean más reales
La superclase Habitación debe tener public abstract double CheckOut ();
autor: jose luis mosquera losada
fecha: 14-02-2022 */
package JLMLt10;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class JLMLt10e13 {

    static Hotel hotel = new Hotel();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            System.out.println("Menú del hotel:");
            System.out.println("1. Check-in");
            System.out.println("2. Check-out");
            System.out.println("3. Listado");
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");

            int eleccion = scanner.nextInt();
            switch (eleccion) {
                case 1: checkIn(); break;
                case 2: checkOut(); break;
                case 3: System.out.println(hotel); break;
                case 4: return;
                default:
                    System.out.println("Opción incorrecta");
            }
        }

    }

    public static void checkIn() {
        System.out.print("Elige habitación (0-17): ");
        int habitacion = scanner.nextInt();
        boolean resultado = hotel.checkIn(habitacion, LocalDate.now());
        if(resultado) {
            System.out.println("Check-in realizado con éxito!");
        } else {
            System.out.println("La habitación no existe o está ocupada.");
        }
        System.out.println();
    }

    public static void checkOut() {
        System.out.print("Elige habitación (0-17): ");
        int habitacion = scanner.nextInt();
        System.out.print("Fecha de salida (dd/MM/yyyy): ");
        String fechaSalidaString = scanner.next();
        double resultado = hotel.checkOut(habitacion, LocalDate.parse(fechaSalidaString, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        if(resultado >= 0) {
            System.out.println("Check-out realizado con éxito!");
            System.out.println("Total: " + resultado);
        } else {
            System.out.println("La habitación no existe o está libre.");
        }
        System.out.println();
    }

}
