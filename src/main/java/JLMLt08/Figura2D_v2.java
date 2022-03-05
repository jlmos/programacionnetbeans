/* Copia las clases relacionadas con Figura2D pero con sufijo _v2 y realizar los siguientes cambios:
Los atributos ancho y largo serán privados, añadir los métodos getter y setter para ambos atributos.
autor: jose luis mosquera losada
fecha: 19-01-2022 */
package JLMLt08;

public class Figura2D_v2 {
    
private double ancho;
    private double alto;

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
