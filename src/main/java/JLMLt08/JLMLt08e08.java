/*Hacer un programa que cree un ArrayList con 4 rectángulos, algunos cuadrados y otros no,
y cuente cuantos hay cuadrados. En el mismo main() crear un triancolor a los que le asignes
también el nuevo atributo: nombre y muestres su área.
autor: jose luis mosquera losada
fecha: 21-01-2022 */
package JLMLt08;

import java.util.ArrayList;

public class JLMLt08e08 {

public static void main(String[] args) {

        ArrayList<Rectangulo_v8> listaRectangulos = new ArrayList<>();
        listaRectangulos.add(new Rectangulo_v8(10, 5, "Rectangulo"));
        listaRectangulos.add(new Rectangulo_v8(10, "Cuadrado"));
        listaRectangulos.add(new Rectangulo_v8(15, 10, "Rectangulo"));
        listaRectangulos.add(new Rectangulo_v8(15, "Cuadrado"));

        long cuadrados = listaRectangulos.stream().map(Rectangulo_v8::esCuadrado).count();
        System.out.printf("Hay %d cuadrados ", cuadrados);

        TrianColor_v8 trianColor_v8 = new TrianColor_v8(10, 5, "isósceles", "rojo", "Triángulo Isósceles");
        System.out.println("\n"+"Área del triángulo: " + trianColor_v8.area());

    }

}