/*ejercicio 8.7-2) hacer otro constructor análogo para la clase Triángulo_v7.
hacer un programa que cree un Triangulo_v7 con el constructor de 3 parámetros 
creado previamente, y otro triángulo utilizando el nuevo constructor. Mostra el área
de ambos.
autor: jose luis mosquera losada
fecha: 20-01-2022 */
package JLMLt08;

public class Triangulo_v7 extends Figura2D_v7 {

    public String estilo;

    public Triangulo_v7() {
        super();
        this.estilo = null;
    }

    public Triangulo_v7(double altoancho) {
        super(altoancho);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_v7(String estilo, double alto, double ancho) {
        super(ancho, alto);
        this.estilo = estilo;
    }

    public Triangulo_v7(Triangulo_v7 triangulo_v7) {
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
