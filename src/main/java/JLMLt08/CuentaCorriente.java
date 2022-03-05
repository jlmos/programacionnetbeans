/* Desde la clase CuentaCorriente facilitada, estudia los métodos: 'ingresar' y 'retirar' y añádeles
un comentario a cada método explicando su funcionamiento (bonificaciones y comisiones).
autor: jose luis mosquera losada
fecha: 22-01-2022*/
package JLMLt08;

public class CuentaCorriente {

    public String IBAN;
    private float saldo;
    private int contadorIngresos;
    private static float porcentajeComision;
    private static float minimoComision;

    CuentaCorriente(String i) {
        IBAN = i;
        saldo = 0;
        contadorIngresos = 0;
    }

    public static void setComision(float pc, float mc) {
        porcentajeComision = pc;
        minimoComision = mc;
    }

    public static float getPorcentajeComision() {
        return porcentajeComision;
    }

    public static float getMinimoCosmision() {
        return minimoComision;
    }

    public float getSaldo() {
        return (saldo);
    }

    /**
     * Al saldo actual de la cuenta le añade el importe. Cada tres ingresos suma
     * un bonus de 0.7
     *
     * @param importe cantidad de dinero que se quiere ingresar en la cuenta
     */
    public void ingresar(float importe) {
        float bonus = 0;
        if (++contadorIngresos == 3) {
            contadorIngresos = 0;
            bonus = 0.7f;
        }
        saldo += importe + bonus;
    }

    /**
     * Retira dinero de la cuenta corriente restándoselo al parámetro saldo. Se
     * comprueba que hay saldo suficiente antes de la retirada, en caso
     * contrario el resultado sería false y no se haría ninguna operación.
     * Además se le suma una comisión a la retirada que no será nunca inferior
     * al mínimo establecido.
     *
     * @param importe cantidad de dinero que se quiere retirar de la cuenta.
     * @return Devuelve true si se ha retirado el dinero y false en caso
     * contrario al no haber suficiente saldo.
     */
    public boolean retirar(float importe) {
        float comision;
        if (porcentajeComision * importe < minimoComision) {
            comision = minimoComision;
        } else {
            comision = porcentajeComision * importe;
        }
        if (importe + comision <= saldo) {
            saldo -= importe + comision;  //resta (importe+comision)
            contadorIngresos = 0;
            return true;
        } else {
            return false;
        }
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getContadorIngresos() {
        return contadorIngresos;
    }

    public void setContadorIngresos(int contadorIngresos) {
        this.contadorIngresos = contadorIngresos;
    }
} // fin clase
