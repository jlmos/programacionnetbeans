/*(sobrecarga)  Teniendo en cuenta la clase Consola, hacer un programa 
que pruebe todas las variantes del método. 
autor: jose luis mosquera losada
fecha: 30-01-2022 */

package JLMLt09;


public class JLMLt09e08 {

    
    public static void main(String[] args) {
        
    int entero1 = Consola.leerEntero();
        System.out.println("entero1: " + entero1);
        System.out.println("-----------------------------");

        int entero2 = Consola.leerEntero("Introduce entero2: ");
        System.out.println("entero2: " + entero2);
        System.out.println("-----------------------------");

        int entero3 = Consola.leerEntero("Introduce entero3: ", 1, 5);
        System.out.println("entero3: " + entero3);
        System.out.println("-----------------------------");


    }
}
