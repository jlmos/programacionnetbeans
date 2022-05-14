/* A partir de la clase MovilPrepago proporcionada realizar las siguientes
operaciones: Crear una subclase llamada MovilPlus
autor: jose luis mosquera losada
fecha: 23-01-2022
 */
package JLMLt08;


public class MovilPrepago {
    
public long numeroMovil;
    final private float costeEstablecLlamada;
    final private float costeMinutoLlamada;
    final private float costeConsumoMB;
    private float saldo;

 public MovilPrepago(long numeroMovil, float costeEstablecimientoLlamada, float costeMinutoLlamada, float costeConsumoMB, float saldo) {
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

    public boolean recargar(int importe) {
        if (importe % 5 == 0) {
            saldo += importe;
            return true;
        } else {
            return false;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public float consultarSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "MovilPrepago{" +
                "numeroMovil=" + numeroMovil +
                ", costeEstablecLlamada=" + costeEstablecLlamada +
                ", costeMinutoLlamada=" + costeMinutoLlamada +
                ", costeConsumoMB=" + costeConsumoMB +
                ", saldo=" + saldo +
                '}';
    }
} //fin
