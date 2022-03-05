/*ejercicio 8.5-5)Hacer un programa similar a los de ejercicios anteriores pero que use las nuevas
características incorporadas en este ejercicio.
autor: jose luis mosquera losada
fecha: 20-01-2022 */
package JLMLt08;

public class JLMLt08e05 {

    public static void main(String[] args) {
         Triangulo_v5 triangulo = new Triangulo_v5(10);
        triangulo.verEstilo();
        triangulo.verDim();
        double area = triangulo.area();
        System.out.printf("Área del triangulo: %.2f", area);
    }

}
