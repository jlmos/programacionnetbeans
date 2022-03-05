/*variable global saldo sobre las que se ejecutan las funciones ingresar() y retirar()
que aumentan y reducen el saldo sin saldo por debajo de cero. ¿cuanto vale la variable
saldo al finalizar la ejecución del programa?
autor: jose luis mosquera losada
fecha: 14-11-2021  
 */
package JLMLt05;

public class JLMLt05e09 {
/* el error está en que retirando 10, me deberían de quedar 20 y al ejecutarlo da 10*/
    public static int saldo = 0;
/*la llamamos dos veces por eso ejecuta saldo final 10 */

    public static void main(String[] args) {
        boolean ok = false;
        ingresar(30);  
        retirar(10);
// 1era retirada (esta variable retirar(10), debería ir antes de ingresar(30) y no se retiraría 2 veces sino solo 1.
        if (retirar(10) == false) {//segunda retirada, para que sea false ya has retirado
            System.out.println("No se puede retirar tanto ");
        }/* otra opción sería crear un boolean result=retirar(10)en vez de retirar(10) 
        y despues if (result==false) en lugar de if(retirar(10)==false*/
        
        System.out.println("Saldo final: " + saldo);
    }

    static void ingresar(int i) {
        saldo += i;
    }

    static boolean retirar(int i) {
        if (i > saldo) {
            return false;
        }
        saldo -= i;
        return true;

    }
}
