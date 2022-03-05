/*Clase Primitiva con un ArrayList privado de 6 elementos con el rsdo de un sorteo
(6 enteros entre 1 y 49, sin repetidos). La clase con un constructor en el que
se generen y se almacenen esos números al azar con un método al que se le pase
una combinación jugada como parámetro (no necesariamente ordenada) y devuelva
el número de aciertos. Realizar 3 programas
autor: jose luis mosquera losada
fecha: 11-1-2022 */
package JLMLt07;
import java.util.Random;

public class Primitiva {

    public static int NUMEROS_BOLETO = 6;
    private int[] resultado;
    private int desde = 1;
    private int hasta = 49;

    public Primitiva() {
        resultado = boletoAleatorio();
    }

    public int[] getResultado() {
        return resultado;
    }

    private int numeroAleatorioSinRepetidos(int[] existentes) {
        int aleatorio = new Random().nextInt(hasta + 1 - desde) + desde;
        boolean repetido = existeEnArray(existentes, aleatorio);
        if (repetido) {
            return numeroAleatorioSinRepetidos(existentes);
        } else {
            return aleatorio;
        }
    }

    private boolean existeEnArray(int[] existentes, int numero) {
        for (int existente : existentes) {
            if(existente == numero) return true;
        }
        return false;
    }



    public int comprobarAciertos(int[] boleto) {
        int aciertos = 0; 
        for(int i=0; i<boleto.length; i++) {
            for(int j=0; j< resultado.length; j++) {
                if(boleto[i] == resultado[j]) aciertos++;
                
            }
        }
        return aciertos;
    }

    public int[] boletoAleatorio() {
        int[] boleto = new int[NUMEROS_BOLETO];
        for (int i=0; i<boleto.length; i++) {
            boleto[i] = numeroAleatorioSinRepetidos(boleto);
        }
        return boleto;
    }


}  

