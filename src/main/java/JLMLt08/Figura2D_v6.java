/* Copia las clases relacionadas con Figura2D pero con sufijo _v6 y realizar los siguientes cambios:
Crea una nueva clase TrianColor_v6, hija de la clase Triángulo_v6 que incluye un nuevo atributo privado
de tipo String llamado color, con un constructor de 4 parámetros (alto, ancho,estilo,color), además del 
getter y setter de color.
autor: jose luis mosquera losada
fecha: 20-01-2022 */
package JLMLt08;

public class Figura2D_v6 {

    private double ancho;
    private double alto;

    public Figura2D_v6() {
        this.alto = 0;
        this.ancho = 0;
    }

    public Figura2D_v6(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Figura2D_v6(double altoancho) {
        this.ancho = altoancho;
        this.alto = altoancho;
    }

    public void verDim() {
        System.out.printf("Ancho: %.2f | Alto: %.2f\n", ancho, alto);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}
