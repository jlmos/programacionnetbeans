/* Realiza un programa (en el paquete que trabajas habitualmente) que emplee los métodos
de Calculadora (primero creando una instancia con un ArrayList con unos valores cualquiera)
y luego intentando llamara a sus tres métodos: sumar(), menor(), media().
Comentar los problemas de acceso que nos encontremos y sus causas.
autor: jose luis mosquera losada
fecha: 22-02-2022 */
package JLMLt11;
import JLMLt11.pClasesApoyo.pMates.Calculadora;

import java.util.ArrayList;
import java.util.Arrays;

public class JLMLt11e01 {

    
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        ArrayList<Integer> enteros = new ArrayList<>();
        enteros.addAll(Arrays.asList(1, 2, 3, 4, 5));
        calculadora.enteros = enteros;

        //calculadora.sumar();
        //No se puede acceer a este método ya que es privado. Sólo sería accesible desde la clase Calculadora

        //calculadora.menor();
        //No se puede acceder a este método ya que es protected. Sólo sería accesible desde el mismo paquete o desde una subclase

        double media = calculadora.media();
        System.out.println("Media = " + media);
        // Accesible sin ningún problema

    }
}
