/* Copia las clases relacionadas con Figura2D pero con sufijo _v3 y realizar los siguientes cambios:
Añadir un constructor a la clase Triángulo al que se le pasan tres parámetros: estilo, alto y ancho.
autor: jose luis mosquera losada
fecha: 19-01-2022 */
package JLMLt08;

public class Figura2D_v3 {
    
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
