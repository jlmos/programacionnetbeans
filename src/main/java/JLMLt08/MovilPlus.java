/*A partir de la clase MovilPrepago proporcionada realizar las siguientes
operaciones: Crear una subclase llamada MovilPlus igual que la anterior pero que al efectuar llamadas no
se le aplica ningún coste por el establecimiento de llamada y tiene una nueva funcionalidad
llamada videollamada a la que se le pasa los segundos de la videollamada y reduce el saldo
de forma similar a ‘navegar’. En este caso, cada segundo de llamada son 2 MB de datos
(recuerda que los atributos de MovilPrepago son privados, esto puede ser un problema a
resolver).• Crea constructor para la nueva clase, que llame al constructor de la clase padre.
• Sobrescribe el método toString () en la superclase para que muestre el número y el saldo del
móvil.
autor: jose luis mosquera losada
fecha: 23-01-2022
 */
package JLMLt08;

public class MovilPlus extends MovilPrepago {

    public MovilPlus(long numeroMovil, float costeMinutoLlamada, float costeMB, float saldo) {
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
