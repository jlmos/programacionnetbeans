/*Hacer una clase abstracta llamada Figura3D_v1 con método abstracto volumen(). 
Crea subclases Esfera_v1 y PrismaRectangular_v1 que implemente el método de la 
superclase. Incorpora los atributos que creas necesarios a las tres clases. Haz un 
programa que cree una instancia de cada una de las 2 figuras y muestre cuál de ellas ocupa más
autor: jose luis mosquera losada
fecha: 7-02-2022  */
package JLMLt10;


public class Esfera_v1 extends Figura3D_v1 {
    
    private double radio;
    
    public Esfera_v1(double radio) {
        this.radio = radio;
    }

    @Override
    public double volumen() {
        return 4 * Math.PI * Math.pow(radio, 3) / 3;
    }
    
}
