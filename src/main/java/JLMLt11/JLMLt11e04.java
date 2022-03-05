/*Hacer un programa que utilizando el método lanzar() de la clase Dado anterior y la constante
PI de la clase Math, simule que lanzamos un dado y muestre el área del círculo que tuviera por radio
el valor obtenido en el dado. Se pide que no haga falta añadir el prefijo con la clase ni al método
lanzar() ni a la constante PI.
autor: jose luis mosquera losada
fecha: 22-02-2022 */
package JLMLt11;
import static JLMLt11.pClasesApoyo.Dado.lanzar;
import static java.lang.Math.PI;

public class JLMLt11e04 {

    
    public static void main(String[] args) {

        int numeroDado = lanzar();
        System.out.println("Resultado dado: " + numeroDado);
        double areaCirculo = numeroDado * numeroDado * PI;
        System.out.println("Área del círculo de radio " + numeroDado + ": " + areaCirculo);
    }
}
