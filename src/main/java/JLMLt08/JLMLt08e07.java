/*ejercicio 8.7-3)hacer un programa que cree un Triangulo_v7 con el constructor de 3 parámetros 
creado previamente, y otro triángulo utilizando el nuevo constructor. Mostra el área
de ambos.
autor: jose luis mosquera losada
fecha: 20-01-2022 */
package JLMLt08;

public class JLMLt08e07 {

public static void main(String[] args) {

        Triangulo_v7 triangulo1 = new Triangulo_v7("isósceles", 10, 5);
        Triangulo_v7 triangulo2 = new Triangulo_v7(triangulo1);

        System.out.println("Área triángulo1: " + triangulo1.area());
        System.out.println("Área triángulo2: " + triangulo2.area());

    }
}
