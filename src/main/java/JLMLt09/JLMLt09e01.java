/*Realizar un programa con una variable tipo Figura2D_v8 y sobre ella llama a uno 
de los constructores de Triangulo_v8. Muestra sus dimensiones y el cálculo del área.
autor: jose luis mosquera losada
fecha: 25-01-2022 */
package JLMLt09;

import JLMLt08.Figura2D_v8;
import JLMLt08.Triangulo_v8;


public class JLMLt09e01 {

    
    public static void main(String[] args) {
        Figura2D_v8 triangulo = new Triangulo_v8("isósceles", 5, 10, "Triángulo1");
        triangulo.verDim();
        System.out.println("Área: " + ((Triangulo_v8) triangulo).area());
        // Figura2D no tiene un método para cálculo del área, así que utilizamos el de la clase hija
    }

}
