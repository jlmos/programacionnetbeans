/* Repite ejercicio anterior con un LikedHashSet. Que ha cambiado.
autor: jose luis mosquera losada
fecha: 25-05-2022 */
/* mismo nombre y telefono no inserta a la persona y los datos 
están enlazados entre sí según el orden de inserción*/
package JLMLt15;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class JLMLt15e04 {

       public static void main(String[] args) {
                
        LinkedHashSet <Persona> fiesta = new LinkedHashSet<>();
        String entrada,nombre,telefono,email,fechaNacimiento;
        int opcion;
        boolean salir = false;
        Persona persona;
        Scanner teclado = new Scanner(System.in);

        try {
            while (!salir) {
                System.out.println("Menú de opciones: ");
                System.out.println("(1) Añadir persona");
                System.out.println("(2) Mostrar lista");
                System.out.println("(-1) Salir");
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
                        persona = new Persona(nombre,telefono,email,fechaNacimiento);
                        fiesta.add(persona);
                        break;
                     case 2:
                        for(Persona p:fiesta){
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

    
              
        
