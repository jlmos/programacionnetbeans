/*ejercicio 8.4-2)Reescribir el constructor de Triángulo creado en el ejercicio anterior para que 
haga uso del nuevo constructor de la clase base. Comprobar que el programa creado en el ejercicio
anterior sigue funcionando. Hacer una copia del programa anterior, sobre las nuevas clases creadas
y comprueba si sigue funcionando.
autor: jose luis mosquera losada
fecha: 19-01-2022 */
package JLMLt08;

public class JLMLt08e04 {

    public static void main(String[] args) {
        // Primera pregunta:
        Triangulo_v4 triangulo_v4 = new Triangulo_v4("isósceles", 5, 4);
        // Sí me permite crear un triángulo v4 porque al añadir el nuevo constructor en Figura2D_v4 no he borrado el
        // constructor vacío que había inicialmente, que era el empleado por las clases Triángulo para crear la instancia

        // Comprobar que el ejercicio anterior sigue funcionando:
        Triangulo_v4 triangulo = new Triangulo_v4("isosceles", 5, 10);
        triangulo.verEstilo();
        triangulo.verDim();
        double area = triangulo.area();
        System.out.printf("Área del triangulo: %.2f", area);
        // Funciona correctamente

    }
}
