/* Modificar las clase nieta TrianColor_v9 para incluir el nombre en constructores. 
autor: jose luis mosquera losada
fecha: 21-01-2022*/
package JLMLt10;

public class TrianColor_v9 extends Triangulo_v9 {

    private String color;

    public TrianColor_v9(double alto, double ancho, String estilo, String color, String nombre) {
        super(estilo, alto, ancho, nombre);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}
