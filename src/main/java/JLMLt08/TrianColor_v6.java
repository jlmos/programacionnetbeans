/* Crea una nueva clase TrianColor_v6, hija de la clase Triángulo_v6 que incluye un nuevo atributo privado
de tipo String llamado color, con un constructor de 4 parámetros (alto, ancho,estilo,color), además del 
getter y setter de color.
autor: jose luis mosquera losada
fecha: 20-01-2022*/
package JLMLt08;


public class TrianColor_v6 extends Triangulo_v6 {

    private String color;

    public TrianColor_v6(double alto, double ancho, String estilo, String color) {
        super(estilo, alto, ancho);
        this.color = color;
    }
}
