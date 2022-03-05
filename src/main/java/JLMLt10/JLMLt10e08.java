/* Hacer una nueva versión de la interfaz del ejercicio anterior (con _v4). Añádele
a la interfaz el método superficie(). Crea una nueva clase Cilindro_v4 y haz que implemente
los métodos de la interfaz. Haz un programa que permita crear una instancia de cad una de
las 3 figuras y nos muestre cuál tiene más superficie.
1. Al añadir el nuevo método a la interfaz, si no modificamos las clases que la  implementan
 se produce error? xq? Cómo lo evitamos?
2. Suponer que se añade a la interfaz un nuevo método llamado ocupaMasque que va a ser igual
para todas las clases que implementen la interfaz, ya que es una comparción del volumen,tenga
la forma que tenga. Qué opciones tenemos para no tener que implementarlo en todas las clases?
autor: jose luis mosquera losada
fecha: 11-02-2022 */
package JLMLt10;


public class JLMLt10e08 {
    
       public static void main(String[] args) {
        Cilindro cilindro = new Cilindro(10, 10);
        Esfera_v4 esfera = new Esfera_v4(10);
        PrismaRectangular_v4 prismaRectangular = new PrismaRectangular_v4(10, 10, 10);

        if(cilindro.superficie() > esfera.superficie() && cilindro.superficie() > prismaRectangular.superficie()) {
            System.out.printf("El cilindro tiene mayor superficie: %.2f", cilindro.superficie());
        } else if(esfera.superficie() > prismaRectangular.superficie()) {
            System.out.printf("La esfera tiene mayor superficie: %.2f", esfera.superficie());
        } else {
            System.out.printf("El prisma tiene mayor superficie: %.2f", prismaRectangular.superficie());
        }

        /* Cuestión 1:
        Sí, se produce un error. Las clases que implementan la interfaz están obligadas a implementar
        también sus métodos, y al haber uno nuevo deben implementarlo también. Para evitar este error
        podemos crear una implementación por defecto en la interfaz, de manera que si no se implementa
        en las clases asociadas a esta interfaz utilizarán la definición por defecto
         */

        /* Cuestión 2:
        Como se comentaba en la cuestión anterior, se puede crear una implementación por defecto 
        ya que será igual para las tres clases. Tendrá que recurrir al método volumen() común 
        a las tres y devolver el boolean correspondiente.
         */
    }

}
