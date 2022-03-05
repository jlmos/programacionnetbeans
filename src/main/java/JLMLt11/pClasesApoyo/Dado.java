/* En el paquete pClasesApoyo crear una clase pública Dado con un método público estático lanzar() que devuelva
el resultado aleatorio de lanzar un dado
autor: jose luis mosquera losada
fecha: 20-02-2022 */
package JLMLt11.pClasesApoyo;

import java.util.Random;

public class Dado {

    public static int lanzar() {
        return new Random().nextInt(6)+1;
    }
}
