/*Haz una nueva versión del programa 17 del capítulo anterior (Implementación de
Comparator) empleando una clase anónima en Collections.sort () para ordenar por nombre la lista
de Persona_v3.
autor: jose luis mosquera losada
fecha: 08-06-2022 */

package JLMLt16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class JLMLt16e12 {

   
    public static void main(String[] args) {
    ArrayList<Persona_v3> fiesta = new ArrayList<>();
        String entrada, nombre, telefono, email, fechaNacimiento;
        int opcion;
        Persona_v3 persona;
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
                        persona = new Persona_v3(nombre, telefono, email, fechaNacimiento);
                        fiesta.add(persona);
                        break;
                    case 2:
                        Collections.sort(fiesta);
                        for (Persona_v3 p : fiesta) {
                            System.out.println(p.toString());
                        }
                        break;
                    case 3:
                        Collections.sort(fiesta);
                        for (Persona_v3 p : fiesta) {
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

    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}





