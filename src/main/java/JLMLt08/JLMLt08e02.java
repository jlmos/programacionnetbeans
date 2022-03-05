/*ejercicio 8.2-3) hacer una copia del programa 8.1, sobre las nuevas clases creadas,
y comprobar que el programa creado en el ejercicio anterior sigue funcionando.
autor: jose luis mosquera losada
fecha: 19-01-2022 */
package JLMLt08;

public class JLMLt08e02 {

    public static void main(String[] args) {
       Triangulo_v2 triangulo = new Triangulo_v2();

        triangulo.setAncho(10);
        triangulo.setAlto(5);
        triangulo.estilo = "isósceles";

        triangulo.verEstilo();
        triangulo.verDim();
        double area = triangulo.area();
        System.out.printf("Área del triangulo: %.2f", area);
    }

}
