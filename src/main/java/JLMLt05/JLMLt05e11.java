/*qué mostrará el código por pantalla?
autor: jose luis mosquera losada
fecha: 14-11-2021  
 */
package JLMLt05;
/* el error está en que el saldo debería ser 1100 y me saca 500.*/
public class JLMLt05e11 {
    /* Si introducimos un static float saldo =500f fuera del main
    nos permite que el saldo final tenga una ejecución correcta con
    el cambio en el nombre de las variables de la función ingresar*/

    public static void main(String[] args) {
        float saldo = 500f;
        ingresar(saldo, 600f);
        if (saldo > 1000f)/**/ {
            System.out.println("Ya tiene más de 1000 euros: " + saldo);
        } else {
            System.out.println("No tiene más de 1000 euros: " + saldo);
        }
    }/* */

    static void ingresar(float saldo, float increm) {saldo += increm;
    }    
}
/* incremento el saldo con increm y debería valer 1100 pero no, porque los
    saldos se pasan por valor pero al no modificar la variable da error.
    Al no pasarle el valor, pasa como 500 y no como 1100*/
/*  lo solucionariamos si sustituimos el "static void ingresar.."
    cambiando los nombre de las variables como en el ejemplo de abajo:
    static void ingresar(float saldoAnterior, float incremento) {saldo += incremento;*/