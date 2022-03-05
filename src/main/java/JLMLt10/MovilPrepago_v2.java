/*  Añadir el sufijo _v2 a las clases movilPrepago, movilTarifaPlana, movilPlus 
autor: jose luis mosquera losada
fecha: 13-02-2022 
autor: jose luis mosquera losada
fecha: 23-01-2022
 */
package JLMLt10;



public class MovilPrepago_v2 implements PrePagable {

    public long numeroMovil;
    final private float costeEstablecLlamada;
    final private float costeMinutoLlamada;
    final private float costeConsumoMB;
    private float saldo;

    public MovilPrepago_v2(long numeroMovil, float costeEstablecimientoLlamada, float costeMinutoLlamada, float costeConsumoMB, float saldo) {
        this.numeroMovil = numeroMovil;
        costeEstablecLlamada = costeEstablecimientoLlamada;
        this.costeMinutoLlamada = costeMinutoLlamada;
        this.costeConsumoMB = costeConsumoMB;
        this.saldo = saldo;
    }

    public void efectuarLlamada(int segundos) {
        saldo -= Math.round(
                (costeEstablecLlamada + costeMinutoLlamada / 60f * segundos) * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public void navegar(int mb) {
        saldo -= Math.round(costeConsumoMB * mb * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "MovilPrepago{" +
                "numeroMovil=" + numeroMovil +
                ", saldo=" + saldo +
                '}';
    }
} //fin 
