/* Copia las clases anteriores como una nueva versión de las mismas (añade sufijo_v7) y realizar los
siguientes cambios: 1) Figura2D_v7 tendrá un nuevo constructor, que recibe como parámetros otro objeto
de tipo Figura2D_v7 y que copiará sus datos. 2) hacer otro constructor análogo para la clase Triángulo_v7.
autor: jose luis mosquera losada
fecha: 20-01-2022 */
package JLMLt08;

public class Figura2D_v7 {

    private double ancho;
    private double alto;

    public Figura2D_v7() {
        this.alto = 0;
        this.ancho = 0;
    }

    public Figura2D_v7(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Figura2D_v7(double altoancho) {
        this.ancho = altoancho;
        this.alto = altoancho;
    }

    public Figura2D_v7(Figura2D_v7 figura2D_v7) {
        this.alto = figura2D_v7.alto;
        this.ancho = figura2D_v7.ancho;
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
