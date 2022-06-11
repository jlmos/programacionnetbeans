/* Modifica la clase Persona (llámale Persona_v2) para que dos personas sean iguales
si tienen el mismo nombre sin tener en cuenta mayúsculas y minúsculas. Repite el 
ejercicio anterior intentando incluir en el conjunto valores que no sean permitidos
por esta nueva condición (por ejemplo:ana y ANA generarían duplicado)
autor: jose luis mosquera losada
fecha: 25-05-2022 */

package JLMLt15;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class JLMLt15e05 {

       public static void main(String[] args) {
        
        LinkedHashSet <Persona_v2> fiesta = new LinkedHashSet<>();
        String entrada,nombre,telefono,email,fechaNacimiento;
        int opcion;
        boolean salir = false;
        Persona_v2 persona;
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
                        persona = new Persona_v2(nombre,telefono,email,fechaNacimiento);
                        fiesta.add(persona);
                        break;
                     case 2:
                        for(Persona_v2 p:fiesta){
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

    
              
        
