/*Crear una enumeración pública con el género de las personas (masculino, femenino) en 
un archivo propio. Crea una nueva versión de la clase Persona (Persona_v4) que la incorpore
como atributo y adapta los métodos necesarios para tratarla (constructor, toString,etc). Hacer
un programa que solicite al usuario por consola los datos de personas y los almacene en un
HashSet(Introducirá nombre 'Z' para indicar que no desea introducir más personas). Finalmente
mostrará todos los datos almacenados en el conjunto.
autor: jose luis mosquera losada
fecha: 08-06-2022 */

package JLMLt16;

import jlml16.Persona_v4.Genero;
import java.util.Scanner;
import java.util.TreeSet;


public class JLMLt16e01 {

    
    public static void main(String[] args) {
       TreeSet<Persona_v4> fiesta = new TreeSet<>();
        String entrada, nombre, telefono, email, fechaNacimiento, genero;
        int opcion;
        Persona_v4 persona;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);

        try {
            while (!salir) {
                System.out.println("Menú de opciones: ");
                System.out.println(" (1) Añadir persona");
                System.out.println(" (2) Mostrar lista");
                System.out.println(" (-1) Salir");
                System.out.println("Escoge una opcion: ");
                entrada = teclado.nextLine();
                opcion = Integer.parseInt(entrada);
                switch (opcion) {
                    case 1:
                        System.out.println("Introduce el nombre: ");
                        nombre = teclado.nextLine();
                        System.out.println("Introduce el telefono: ");
                        telefono = teclado.nextLine();
                        System.out.println("Introduce el email: ");
                        email = teclado.nextLine();
                        System.out.println("Introduce la fecha de nacimiento dd/mm/aaa: ");
                        fechaNacimiento = teclado.nextLine();
                        System.out.println("Introduce el genero ingles/frances: ");
                        genero = teclado.nextLine();
                        if (genero.equals("ingles")) {
                            persona = new Persona_v4(nombre, telefono, email, fechaNacimiento, Genero.INGLES);
                        } else if (genero.equals("frances")) {
                            persona = new Persona_v4(nombre, telefono, email, fechaNacimiento, Genero.FRANCES);
                        } else {
                            persona = new Persona_v4(nombre, telefono, email, fechaNacimiento, null);
                        }
                        fiesta.add(persona);
                        break;
                    case 2:
                        for (Persona_v4 p : fiesta) {
                            System.out.println(p.toString());
                        }
                        break;
                    case -1:
                        salir = true;
                        System.out.println("Hasta pronto");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            }

        } catch (Exception e) {
            System.out.println("Opcion no valida");
        }

    }

}

