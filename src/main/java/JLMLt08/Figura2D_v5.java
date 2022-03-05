/* Copia las clases relacionadas con Figura2D pero con sufijo _v5 y realizar los siguientes cambios:
Añadir un constructor más a la Figura2D a este se le pasa solo un parámetro, que se le asigan
tanto al alto como al ancho. Hacer el constructor sin parámetros (ya no se crea por defecto) en
este caso tanto alto como ancho igual a cero.
autor: jose luis mosquera losada
fecha: 20-01-2022 */
package JLMLt08;

public class Figura2D_v5 {

    private double ancho;
    private double alto;

    public Figura2D_v5() {
        this.alto = 0;
        this.ancho = 0;
    }

    public Figura2D_v5(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public Figura2D_v5(double altoancho) {
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
