/*ejercicio 8.2-3)Modifica la clase Triángulo obligados por los cambios en su clase padre.
autor: jose luis mosquera losada
fecha: 19-01-2022 */
package JLMLt08;


public class Triangulo_v2 extends Figura2D_v2 {

    public String estilo;

public double area() {
        return getAncho() * getAlto() / 2;
    }

    public void verEstilo() {
        System.out.printf("Estilo: %s \n", estilo);
    }

}
