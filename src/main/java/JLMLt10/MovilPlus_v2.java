/* Añadir el sufijo _v2 a las clases movilPrepago, movilTarifaPlana, movilPlus 
autor: jose luis mosquera losada
fecha: 13-02-2022  */
package JLMLt10;

public class MovilPlus_v2 extends MovilPrepago_v2 implements PrePagable {

    public MovilPlus_v2(long numeroMovil, float costeMinutoLlamada, float costeMB, float saldo) {
        super(numeroMovil, 0, costeMinutoLlamada, costeMB, saldo);
    }

    public void videollamada(int segundos) {
        navegar(2 * segundos);
    }


    @Override
    public String toString() {
        return "MovilPlus{" +
                "numeroMovil=" + numeroMovil +
                ",saldo=" + getSaldo() +
                '}';
    }
}
