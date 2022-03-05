/*ejercicio 8.8-3) modificar la clase hija (Triángulo_v8) para incluir el nombre en cosntructores. 
autor: jose luis mosquera losada
fecha: 21-01-2022 */
package JLMLt08;

public class Triangulo_v8 extends Figura2D_v8 {

    public String estilo;

    public Triangulo_v8() {
        super();
        this.estilo = null;
    }

    public Triangulo_v8(double altoancho, String nombre) {
        super(altoancho, nombre);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_v8(String estilo, double alto, double ancho, String nombre) {
        super(ancho, alto, nombre);
        this.estilo = estilo;
    }

    public Triangulo_v8(Triangulo_v8 triangulo_v7) {
        this.setAlto(triangulo_v7.getAlto());
        this.setAncho(triangulo_v7.getAncho());
        this.estilo = triangulo_v7.estilo;
    }

    public double area() {
        return getAncho() * getAlto() / 2;
    }

    public void verEstilo() {
        System.out.printf("Estilo: %s \n", estilo);
    }

}
