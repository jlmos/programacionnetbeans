/*3) Finalmente hacer un programa que cree un triángulo, asigne valores a sus atributos y use
los métodos para ver sus demensiones, estilo y área
autor: jose luis mosquera losada
fecha: 19-01-2022 */
package JLMLt08;

public class JLMLt08e01 {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();

        triangulo.ancho = 10;
        triangulo.alto = 5;
        triangulo.estilo = "isósceles";

        triangulo.verEstilo();
        triangulo.verDim();
        double area = triangulo.area();
        System.out.printf("Área del triangulo: %.2f", area);
    }

}
