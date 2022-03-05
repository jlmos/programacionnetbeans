/* ejercicio 8.1-1)Crear una clase llamada Figura2D con atributos numéricos con decimales y públicos:
ancho y alto y un método verDim que muestre por consola el alto y el ancho en una sola
línea, con dos decimales.
autor: jose luis mosquera losada
fecha: 19-01-2022 */
package JLMLt08;

public class Figura2D {

    public double ancho;
    public double alto;

    public void verDim() {
        System.out.printf("Ancho: %.2f | Alto: %.2f\n", ancho, alto);
    }

}
