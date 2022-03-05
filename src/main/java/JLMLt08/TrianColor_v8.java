/* Modificar las clase nieta TrianColor_v8 para incluir el nombre en constructores. 
autor: jose luis mosquera losada
fecha: 21-01-2022*/
package JLMLt08;

public class TrianColor_v8 extends Triangulo_v8 {

    private String color;

    public TrianColor_v8(double alto, double ancho, String estilo, String color, String nombre) {
        super(estilo, alto, ancho, nombre);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}
