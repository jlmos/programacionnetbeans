/*En el paquete pClasesApoyo crear una clase pública CalculadoraSuper hija de calculadora,pero sin necesidad
de método. Necesitas algún constructor? Porqué? podría ser hija de CalculadoraPro?
el resultado aleatorio de lanzar un dado
autor: jose luis mosquera losada
fecha: 20-02-2022
 
 */
package JLMLt11.pClasesApoyo;

import JLMLt11.pClasesApoyo.pMates.Calculadora;

public class CalculadoraSuper extends Calculadora {

    // No necesita ningún constructor, porque la clase padre no lo tiene.
    // No podría ser hija de CalculadoraPro, porque no tiene visibilidad de esta clase 
    // al ser default. Sólo sería visible desde el mismo paquete
}
