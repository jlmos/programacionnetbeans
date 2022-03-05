/*ejercicio 8.5-3/4)Añade a la clase Triángulo también un constructor sin parámetros,
que invoque al constructor sin parámetros de la clase base(aunque se hace por defecto)
y que ponga el estilo null. Añade otro constructor a la clase Triángulo, con un solo
parámetro, para aquellos que tienen igual alto que ancho (en este caso el estilo será
'igualBaseAltura'
autor: jose luis mosquera losada
fecha: 20-01-2022 */
package JLMLt08;

public class Triangulo_v5 extends Figura2D_v5 {

    public String estilo;

    public Triangulo_v5() {
        super();
        this.estilo = null;
    }

    public Triangulo_v5(double altoancho) {
        super(altoancho);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_v5(String estilo, double alto, double ancho) {
        super(ancho, alto);
        this.estilo = estilo;
    }

    public double area() {
        return getAncho() * getAlto() / 2;
    }

    public void verEstilo() {
        System.out.printf("Estilo: %s \n", estilo);
    }

}
