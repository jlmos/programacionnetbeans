/* Realizar un programa que cree un conjunto HashSet que almacene la lista de personas
que van a una fiesta(de una persona sabemos su nombre, teléfono, email y fecha de nacimiento).
Crea en un archivo aparte la clase Persona con los atributos y métodos que necesites. En el
programa introduce "a mano" unas cuantas personas, y luego muestre la edad media y el nombre del
mayor (también puedes crear un menú con la opción de añadir persona y mostrar lista)
   - hacer la inserción de una persona repetida y ver que ocurre. 
   - Muestra todos los valores almacenados en HashSet ¿tienen algún orden?
autor: jose luis mosquera losada
fecha: 15-05-2022 */
/* mismo nombre y telefono no inserta a la persona y los datos van en orden de insercion */
package JLMLt15;

import java.util.HashSet;
import java.util.Scanner;

public class JLMLt15e03 {

    public static void main(String[] args) {
    
        HashSet <Persona> fiesta = new HashSet<>();
        String entrada,nombre,telefono,email,fechaNacimiento;
        int opcion;
        boolean salir = false;
        Persona persona;
        Scanner teclado = new Scanner(System.in);

        try {
            while (!salir) {
                System.out.println("Menú de opciones: ");
                System.out.println("1 Apuntar persona");
                System.out.println("2 Mostrar lista");
                System.out.println("-1 Salir");
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
    
              
        
