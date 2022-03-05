/* Convertir la clase abstracta Figura3D_v1 en una interfaz Figura3D_v3 con las mismas
características. Rehaz las clases Esfera y PrismaRectangular (tendrán sufijo v3) para
adaptarlas a la nueva interfaz. Hacer un programa que cree una instancia de cada una de
las 2 figuras y muestre cuál de ellas ocupa más.
autor: jose luis mosquera losada
fecha: 10-02-2022
 */
package JLMLt10;


public class Esfera_v3 implements Figura3D_v3 {

    private double radio;

    public Esfera_v3(double radio) {
        this.radio = radio;
    }

    @Override
    public double volumen() {
        return 4 * Math.PI * Math.pow(radio, 3) / 3;
    }

}
