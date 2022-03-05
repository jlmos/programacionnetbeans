/* practica billetes
 */
package Pt03;
public class práctica15 {
    public static void main(String[] args) {
        float saldo=10;
        int segundos=0;
        float costeEstablecerLlamada=1, costeMinutoLlamada=2;
        saldo-=costeEstablecerLlamada;
        saldo-=(segundos/60+1)*costeMinutoLlamada;
        
        System.out.println("el rsdo es: "+ saldo);

    }

}
