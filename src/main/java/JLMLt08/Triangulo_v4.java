/*ejercicio 8.4-2)Reescribir el constructor de Triángulo creado en el ejercicio anterior para que 
haga uso del nuevo constructor de la clase base. Comprobar que el programa creado en el ejercicio
anterior sigue funcionando.
autor: jose luis mosquera losada
fecha: 19-01-2022 */
package JLMLt08;

public class Triangulo_v4 extends Figura2D_v4 {

    public String estilo;

    public Triangulo_v4(String estilo, double alto, double ancho) {
      //  super(); // daría error porque está invocando al constructor padre por defecto y el padre no tiene constructor padre.
        super(ancho, alto);
        this.estilo = estilo;
    }

    public double area() {
        return getAncho() * getAlto() / 2;
    }

    public void verEstilo() {
        System.out.printf("Estilo: %s \n", estilo);
    }

}
