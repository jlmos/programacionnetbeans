/* Crear una interfaz llamada PrePagable que las clases: movilPrepago, movilTarifaPlana, movilPlus
deben implementar. Incluir todos los métodos necesarios, incluido alguno por defecto.
autor: jose luis mosquera losada
fecha: 13-02-2022  */
package JLMLt10;


public interface PrePagable {

    default float consultarSaldo() {
        return getSaldo();
    }

    default boolean recargar(int importe){
        if (importe % 5 == 0) {
            setSaldo(getSaldo() + importe);
            return true;
        } else {
            return false;
        }
    }

    void efectuarLlamada(int segundos);

    void navegar(int mb);

    float getSaldo();

    void setSaldo(float saldo);
}