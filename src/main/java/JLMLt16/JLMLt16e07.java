/*Crea una clase de tipo genérica llamada ListaPequeña que tendrá como atributos privados un
ArrayList de tipo genérico llamado valores y un entero (qué será final, piensa el porqué) con el
tamaño de la lista, llamado tamañoMax.
• Al constructor de esta clase le pasaremos un entero positivo que se asignará a
tamañoMax. El constructor instanciará también el ArrayList valores.
• Tendrá un método llamado añadir que se le pasa un objeto de tipo genérico y si el arraylist
aún tiene un tamaño menor que tamañoMax, lo añadirá, pero si el arraylist ha llegado a
ese tamaño, añadirá objeto pasado en la última posición del ArrayList, sustituyendo el
elemento que allí hubiera (así conseguimos que el ArrayList no crezca por encima del
tamaño máximo)
• Tiene un método llamado clear(), que simplemente hace un clear() del ArrayList valores.
• Tiene un método llamado getValores() que devuelve el ArrayList privado valores.
Haz un programa que cree una ListaPequeña de tipo String de 5 elementos. Añádele 6 ó 7 String
a la lista y muestra su contenido, para ver si ha crecido por encima de esos 5 elementos.
Crea otro programa similar al anterior, pero en vez de trabajar con String trabaje con una clase
que hayas creado previamente, por ejemplo: Persona_v4.
autor: jose luis mosquera losada
fecha: 08-06-2022 */

package JLMLt16;

import java.util.Scanner;


public class JLMLt16e07 {

   
    public static void main(String[] args) {
    final int TAMAÑO;
        TAMAÑO = 5;
        String entrada, nombre, telefono, email, fechaNacimiento, genero, matricula;
        int opcion;
        Persona_v4 persona;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        ListaPequeña fiesta = new ListaPequeña(5);
        ListaPequeña parking = new ListaPequeña(5);

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
                        do {
                            System.out.println("Introduce el nombre: ");
                            nombre = teclado.nextLine();
                            System.out.println("Introduce el telefono: ");
                            telefono = teclado.nextLine();
                            System.out.println("Introduce el email: ");
                            email = teclado.nextLine();
                            System.out.println("Introduce la fecha de nacimiento dd/mm/aaa: ");
                            fechaNacimiento = teclado.nextLine();
                            System.out.println("Introduce idioma ingles/frances: ");
                            genero = teclado.nextLine();
                    switch (genero) {
                        case "ingles":
                            persona = new Persona_v4(nombre, telefono, email, fechaNacimiento, Persona_v4.Genero.INGLES);
                            break;
                        case "frances":
                            persona = new Persona_v4(nombre, telefono, email, fechaNacimiento, Persona_v4.Genero.FRANCES);
                            break;
                        default:
                            persona = new Persona_v4(nombre, telefono, email, fechaNacimiento, null);
                            break;
                    }
                            fiesta.añadir(persona);
                            System.out.println("Desea continuar si/no: ");
                            entrada = teclado.nextLine();
                        } while (!entrada.equals("no"));
                        break;
                    case 2:
                        do {
                            System.out.println("Introduce la matricula: ");
                            matricula = teclado.nextLine();
                            parking.añadir(matricula);
                            System.out.println("Desea continuar si/no: ");
                            entrada = teclado.nextLine();
                        } while (!entrada.equals("no"));
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



