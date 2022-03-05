/*Añade una nueva subclase de MovilPrepago_v2 llamada MovilTarifaPlana_v2¸ en la que se redefine
el método navegar para no reducir el saldo y además en el constructor fija el coste de
navegación a cero.
autor: jose luis mosquera losada
fecha: 23-01-2022
 */
package JLMLt10;


 public class MovilTarifaPlana_v2 extends MovilPrepago_v2  implements PrePagable {


    public MovilTarifaPlana_v2(long numeroMovil, float costeEstablecimientoLlamada, float costeMinutoLlamada, float saldo) {
        super(numeroMovil, costeEstablecimientoLlamada, costeMinutoLlamada, 0, saldo);
    }

    @Override
    public void navegar(int mb) {

    }

    @Override
    public String toString() {
        return "MovilTarifaPlana{" +
                "numeroMovil=" + numeroMovil +
                ",saldo=" + getSaldo() +
                '}';
    }

}
