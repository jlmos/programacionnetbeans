/*ejercicio 8.2-3) Modificar el programa de los ejercicios anteriores para que los triángulos
sean creados mediante este nuevo constructor.
autor: jose luis mosquera losada
fecha: 19-01-2022 */
package JLMLt08;

public class JLMLt08e03 {

    public static void main(String[] args) {
        Triangulo_v3 triangulo = new Triangulo_v3("isosceles", 5, 10);

        triangulo.verEstilo();
        triangulo.verDim();
        double area = triangulo.area();
        System.out.printf("Área del triangulo: %.2f", area);
    }

}
