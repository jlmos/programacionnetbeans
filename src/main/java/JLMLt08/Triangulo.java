/*ejercicio 8.1-2)clase llamada Triángulo que es hija de Figura2D y añádele una
cadena llamado área que devuelva la superficie del triángulo y un último método llamado
verEstilo que muestre por consola el valor del atributo estilo.
autor: jose luis mosquera losada
fecha: 19-01-2022 */
package JLMLt08;


public class Triangulo extends Figura2D {

    public String estilo;

    public double area() {
        return ancho * alto / 2;
    }

    public void verEstilo() {
        System.out.printf("Estilo: %s \n", estilo);
    }

}
