/*ejercicio 8.6-3)Hacer un programa similar a los de ejercicios anteriores pero que use las nuevas
características incorporadas en este ejercicio.
autor: jose luis mosquera losada
fecha: 20-01-2022 */
package JLMLt08;

public class JLMLt08e06 {

    public static void main(String[] args) {
        TrianColor_v6 triangulo = new TrianColor_v6(10, 5, "TrianColor", "rojo");
        triangulo.verEstilo();
        triangulo.verDim();
        double area = triangulo.area();
        System.out.printf("Área del triangulo: %.2f", area);
    }
}
