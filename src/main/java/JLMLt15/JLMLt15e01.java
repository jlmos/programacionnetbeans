/* */
package JLMLt15;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class JLMLt15e01 {

    private static Scanner teclado = new Scanner(System.in);
    private static LinkedList<String> parking = new LinkedList<>();
    private static final int MAX_PLAZAS = 10;

    public static void main(String[] args) {

        boolean salir =false;
        do{
            System.out.println("\n\n---GESTIÓN PARKING---");
            System.out.println("a)Mostrar parking\nb)Aparcar\nc)Desaparcar\nd)Plazas Libres\ne)Salir");
            char opcion =teclado.next().charAt(0);
            switch (opcion) {
                case 'a': mostrarParking(); break;
                case 'b': aparcar(); break;
                case 'c': desaparcar(); break;
                case 'd': plazasLibres(); break;
                case 'e': salir=true; break;
                default: System.out.println("opción inválida");
            }                
        } while (!salir);
    }

    private static void mostrarParking(){
        LinkedList<String> resultado = new LinkedList<>(parking); // Copio lista y trabajo sobre la copia
        while (resultado.size() < 10) {
            resultado.addFirst("[VACIO]");
        }
        System.out.println("El estado actual del parking es:");
        System.out.println(String.join(" | ", resultado));
        System.out.println();
    }

    private static void aparcar(){
        System.out.print("Introduce matrícula: ");
        String matricula=teclado.next();
        if(parking.size() >= 10) {
            System.out.println("Error. Parking lleno!");
        } else {
            parking.addFirst(matricula);
            System.out.println("Coche aparcado con éxito. Quedan " + (MAX_PLAZAS - parking.size()) + " plazas");
        }
        System.out.println();
    }

    private static void desaparcar(){
        try {
            String matricula = parking.removeFirst();
            System.out.println("Se ha desaparcado el coche " + matricula + ".  Quedan " + (MAX_PLAZAS - parking.size()) + " plazas");
        } catch (NoSuchElementException nsee) {
            System.out.println("Error. El parking está vacío.");
        } finally {
            System.out.println();
        }

    }

    private static void plazasLibres(){
        System.out.println("Quedan " + (MAX_PLAZAS - parking.size()) + " plazas libres.");
    }

}