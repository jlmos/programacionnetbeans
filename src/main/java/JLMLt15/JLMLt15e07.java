/*Realizar un programa que tenga un HashMap que almacene una plantilla de jugadores de un plantilla(Nombre, salario).
La plantilla tiene un máximo de 25 jugadores.El programa dispondrá de un menú que permita: 
añadir jugador, eliminar jugador, lista de jugadores con su salario y que tenga también opción que permita introducir
un salario y muestre los jugadores que tiene un salario parecido al introducido (por "parecido" entendemos que el 
salario del jugador esté en un rango de 6000 euros arriba o abajo respeto al introducido).
autor: jose luis mosquera losada
fecha: 25-05-2022*/
package JLMLt15;

import java.util.HashMap;
import java.util.Scanner;


public class JLMLt15e07 {

    static Scanner teclado;
    static HashMap<String,Integer> plantilla;
    

    public static void main(String[] args) {

        plantilla = new HashMap<>();
        teclado = new Scanner(System.in);
        boolean salir = false;
        char opcion;

        do {
            System.out.println("a)Añadir Jugador\nb)Eliminar Jugador\nc)Lista de jugadores\nd)Incrementar salario\ne)Buscar jugadores por salario \nf) Salir");
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
                    buscarJugadorSalario();
                    break;
                case 'f':
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (!salir);

    }

    public static void añadir() {
        int max=25;
        System.out.println("Introduce el nombre del jugador: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduce su salario: ");
        int salario = Integer.parseInt(teclado.nextLine());
        if (plantilla.size() < max) {
        plantilla.put(nombre, salario);
        } else {
         System.out.println("Se ha completado el máximo de plantilla");

        System.out.println("Jugador añadido.");
    }
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
    public static void buscarJugadorSalario(){
        float salario;
    
        System.out.println("Introduce el salario a buscar: ");
                         salario = Float.valueOf(teclado.nextLine());
                        for (String i : plantilla.keySet()) {
                            if ((plantilla.get(i) > (salario - 6000)) && (plantilla.get(i) < (salario + 6000)))  {
                                System.out.println(i + " : " + plantilla.get(i));
                            }
                        }
                            
            }
        }
    

