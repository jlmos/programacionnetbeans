/* Realizar, a partir de los atributos estáticos de las wrapper class, un programa que muestre el
valor máximo y mínimo de los Integer y los Long y también cuantos bytes ocupan en memoria.
autor: jose luis mosquera losada
fecha: 08-06-2022 */

package JLMLt16;


public class JLMLt16e03 {

   
    public static void main(String[] args) {
     System.out.println("Valor máximo (Integer): " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo (Integer): " + Integer.MIN_VALUE);
        System.out.println("Espacio en memoria  (Bytes-Integer): " + Integer.BYTES);
        System.out.println("Valor máximo (Long): " + Long.MAX_VALUE);
        System.out.println("Valor mínimo (Long): " + Long.MIN_VALUE);
        System.out.println("Espacio memoria (Bytes-Long): " + Long.BYTES);
    }

}
