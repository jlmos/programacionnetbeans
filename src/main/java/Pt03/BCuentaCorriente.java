/*programa en el que se cree una cuenta corriente con saldo cero
y mediante menú, porder ingresar, retirar y consultar saldo.
el único atributo público el IBAN, los otros privados.
autor: jose luis mosquera losada
fecha: 11-01-2022*/
package Pt03;


   

public class BCuentaCorriente {

    public String iban;
    private float saldo;
    private int contadorIngresos;
    private float porcentajeComision;
    private float minimoComision;

    public BCuentaCorriente(String iban) {
        this.iban = iban;
        this.saldo = 0f;
        this.contadorIngresos = 0;
    }

    public void ingresar(float importe) {
        saldo += importe;
        contadorIngresos++;
        if (contadorIngresos == 3) {
            contadorIngresos = 0;
            saldo += 0.7;
        }
    }

    public boolean retirar(float importe) {

        float importeConComision = importe + calcularComision(importe);
if (importeConComision <= saldo) {
    saldo -= importeConComision;

            return true;

        } else {
            return false;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public float getMinimoComision() {
        return minimoComision;
    }

    public void setComision(float porcentaje, float impMinimo) {
        this.porcentajeComision = porcentaje;
        this.minimoComision = impMinimo;
    }

    private float calcularComision(float importeRetirado) {
        float result = importeRetirado * porcentajeComision / 100.0f;
        if (result < minimoComision) {
            result = minimoComision;
        }
        return result;
    }
} 

