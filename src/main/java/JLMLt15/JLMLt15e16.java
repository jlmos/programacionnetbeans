/* Hacer un programa con un TreeSet de Persona_v2 (es un conjunto ordenado), que introduzca
"a mano" unas cuantas personas en el conjunto y a continuación las muestre con un for..each.
¿Qué ocurre? Crea una nueva versión de Persona_v3 que resuelva los problemas encontrados y que 
ordene y no permita duplicados por nombre sin distiguir mayúsculas de minúsculas. Si eliminases
de la clase Persona_v3 los métodos equals() y hashCode(). ¿Seguiría funcionando correctamente?
autor: jose luis mosquera losada
fecha: 25-05-2022 */
package JLMLt15;

import java.util.Scanner;
import java.util.TreeSet;

public class JLMLt15e16 {
    /* da error ya que TreeSet no usa hashCode() ni equals, sino  el método compareTo() */


    public static void main(String[] args) {

        TreeSet<Persona_v3> fiesta = new TreeSet<>();
        String entrada, nombre, telefono, email, fechaNacimiento;
        int opcion;
        boolean salir = false;
        Persona_v3 persona;
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
                        persona = new Persona_v3(nombre, telefono, email, fechaNacimiento);
                        fiesta.add(persona);
                        break;
                    case 2:
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

}
