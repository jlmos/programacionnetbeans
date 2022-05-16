/* Realizar un programa que cree un conjunto HashSet que almacene la lista de personas
que van a una fiesta(de una persona sabemos su nombre, teléfono, email y fecha de nacimiento).
Crea en un archivo aparte la clase Persona con los atributos y métodos que necesites. En el
programa introduce "a mano" unas cuantas personas, y luego muestre la edad media y el nombre del
mayor (también puedes crear un menú con la opción de añadir persona y mostrar lista)
   - hacer la inserción de una persona repetida y ver que ocurre. 
   - Muestra todos los valores almacenados en HashSet ¿tienen algún orden?
autor: jose luis mosquera losada
fecha: 15-05-2022*/

package JLMLt15;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class JLMLt15e03 {

    private static  Scanner teclado = new Scanner(System.in);
    private static  HashSet<String> Personas = new HashSet<>();
    private static final int MAX_PLAZAS = 10;

    public static void main(String[] args) {

        boolean salir =false;
        do{
            System.out.println("\n\n---GESTIÓN PERSONAS---");
            System.out.println("a)Añadir personas\nb)Mostrar personas\nc)Salir");
            char opcion =teclado.next().charAt(0);
            switch (opcion) {
                case 'a': mostrarPersonas(); break;
                case 'b': añadirPersonas(); break;
                case 'c': salir=true; break;
                default: System.out.println("opción inválida");
            }                
        } while (!salir);
    }

    private static void mostrarPersonas(){
        HashSet<Personas> resultado = new HashSet<>(); // Copio lista y trabajo sobre la copia
        if (Personas.add(new Personas.add (jose,67099999,jjpp@gmail.com,10-03-1999)))
                System.out.println("Añadido correctamente:");
        else 
        System.out.println("no se puede añadir. Repetido"));
        double total=0;
        for (Personas p : resultado) total +=p.Personas;
        
    }

    private static void añadirPersonas(){
        System.out.print("Introduce persona: ");
        String persona=teclado.next();
        if(Personas.size() >= 10) {
            System.out.println("Error. Parking lleno!");
        } else {
            Personas.push(persona);
            System.out.println("Coche aparcado con éxito. Quedan " + (MAX_PLAZAS - Personas.size()) + " plazas");
        }
        System.out.println();
    }

    private static void desaparcar(){
        try {
            String matricula = Personas.poll();
            System.out.println("Se ha desaparcado el coche " + matricula + ".  Quedan " + (MAX_PLAZAS - Personas.size()) + " plazas");
        } catch (NoSuchElementException nsee) {
            System.out.println("Error. El parking está vacío.");
        } finally {
            System.out.println();
        }

    }

    private static void plazasLibres(){
        System.out.println("Quedan " + (MAX_PLAZAS - Personas.size()) + " plazas libres.");
    }

}