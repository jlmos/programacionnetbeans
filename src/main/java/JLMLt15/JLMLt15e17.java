/* Hacer un programa que defina un Arrraylist de Persona_v3. Añade 5 personas distintas al 
mismo y luego muéstralas por pantalla ordenadas por email. A continuación, vuelve a mostrarlas,
pero esta vez ordenadas por nombre. ¿Debes usar un Comparator en ambos casos?
autor: jose luis mosquera losada
fecha: 25-05-2022 */

package JLMLt15;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JLMLt15e17 {
 
    public static void main(String[] args) {
      
        ArrayList<Persona_v3> fiesta = new ArrayList<>();
        String entrada, nombre, telefono, email, fechaNacimiento;
        int opcion;
        boolean salir = false;
        Persona_v3 persona;
        Scanner teclado = new Scanner(System.in);

        try {
            while (!salir) {
                System.out.println("Menú de opciones: ");
                System.out.println("(1) Añadir persona");
                System.out.println("(2) Mostrar lista por nombre");
                System.out.println("(3) Mostrar lista por email");
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
                        Collections.sort(fiesta);
                        for (Persona_v3 p : fiesta) {
                            System.out.println(p.toString());
                        }
                        break;
                    case 3:
                        ComparaEmail compEmail = new ComparaEmail();
                        Collections.sort(fiesta, compEmail);
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

class Compara implements Comparator {

    public int compareNombre(Object o1, Object o2) {
        Persona_v3 p1 = (Persona_v3) o1;
        Persona_v3 p2 = (Persona_v3) o2;
        return p1.email.compareToIgnoreCase(p2.email);
    }

    public int compareEmail(Object o1, Object o2) {
        Persona_v3 p1 = (Persona_v3) o1;
        Persona_v3 p2 = (Persona_v3) o2;
        return p1.email.compareToIgnoreCase(p2.email);
    }

    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


