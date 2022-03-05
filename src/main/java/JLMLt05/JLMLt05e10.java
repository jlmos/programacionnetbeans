/*código erroneo ver lo que muestra y deducir error
autor: jose luis mosquera losada
fecha: 14-11-2021  
 */
package JLMLt05;

public class JLMLt05e10 {

    /* el error está en que estoy ingresando dos veces, es decir la llamo 2 veces y 
    me dice que ya tengo más de 1000 cuando tengo 900.
    no modifica la variable saldo devuelve la suma + el incremeto*/

    public static void main(String[] args) {
        float saldo = 500f;
        saldo = ingresar(saldo, 400f);
       // me da 1400 pero se me quedó en 900.
        if (ingresar(saldo, 400f) > 1000f) /*hay que meter un saldo, sino entra por if, hay que
            actualizar la variable saldo, llamamos a la variabe ingreso pero no está 
            actualizada la variable saldo.*/ {
            System.out.println("Ya tiene más de 1000 euros: " + saldo); //me dice que saldo mayor que 1000 cuando es 900.
        } else {
            System.out.println("No tiene más de 1000 euros: " + saldo);
        }
    }

    static float ingresar(float saldo, float increm) {
        return saldo + increm;
    }

}
