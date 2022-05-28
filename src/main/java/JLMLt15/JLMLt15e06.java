/*Realizar un programa que tenga un HashMap que almacene una plantilla de jugadores de un plantilla(Nombre, salario).
El programa dispondrá de un menú que permita: añadirjugador, eliminar jugador, consultar salario de un jugador 
e incrementar salario un 10% a un empleado.
autor: jose luis mosquera losada
fecha: 15-05-2022*/
package JLMLt15;

import java.util.HashMap;
import java.util.Scanner;


public class JLMLt15e06 {

    static Scanner teclado;
    static HashMap<String,Integer> plantilla;
    

    public static void main(String[] args) {

        plantilla = new HashMap<>();
        teclado = new Scanner(System.in);

        boolean salir = false;
        char opcion;

        do {
            System.out.println("a)Añadir Jugador\nb)Eliminar Jugador\nc)Mostrar Salario\nd)Incrementar salario\ne)Salir");
            opcion = teclado.nextLine().charAt(0);
            switch (opcion) {
                case 'a':
                    añadir();
                    break;
                case 'b':
                    eliminar();
                    break;
                case 'c':
                    mostrarSalario();
                    break;
                case 'd':
                    incrementarSalario();
                    break;
                case 'e':
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (!salir);

    }

    public static void añadir() {
        System.out.println("Introduce el nombre del jugador: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduce su salario: ");
        int salario = Integer.parseInt(teclado.nextLine());
        plantilla.put(nombre, salario);
        System.out.println("Jugador añadido.");
    }

    public static void eliminar() {
        System.out.println("Introduce el nombre del jugador: ");
        String nombre = teclado.nextLine();
        int n = plantilla.get(nombre);
        plantilla.remove(nombre);
        System.out.println("Jugador eliminado.");
    }

    public static void mostrarSalario() {
        System.out.println("Introduce el jugador a consultar: ");
        String nombre = teclado.nextLine();
        int salario = plantilla.get(nombre);
        System.out.println("El jugador: " + nombre + " tiene un salario de: " + salario);
    }

    public static void incrementarSalario() {
        System.out.println("Introduce el jugador para incrementar su salario: ");
        String nombre = teclado.nextLine();
        for (String i : plantilla.keySet()) 
            if (i.equals(nombre)) 
                plantilla.put(i,(int) (plantilla.get(i)  * 1.1));
               
            }
        }
    

