/* programa para crear un teléfono para ejecutar recarga,llamar
autor: jose luis mosquera losada
fecha: 28-12-2021 */
package JLMLt06;


public class JLMLt06e01 {

    public static void main(String[] args) {

AMovilPrepago movilPrepago = new AMovilPrepago(1234567890, 0.15f, 0.05f, 0.10f, 0);

        movilPrepago.recargar(10);
        System.out.println("Saldo: " + movilPrepago.consultarSaldo());
        movilPrepago.efectuarLlamada(30);
        System.out.println("Saldo: " + movilPrepago.consultarSaldo());
        movilPrepago.navegar(10);
        System.out.println("Saldo: " + movilPrepago.consultarSaldo());

    }
}         
    
