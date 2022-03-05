/*Hacer una clase abstracta llamada Figura3D_v1 con método abstracto volumen(). 
Crea subclases Esfera_v1 y PrismaRectangular_v1 que implemente el método de la 
superclase. Incorpora los atributos que creas necesarios a las tres clases. Haz un 
programa que cree una instancia de cada una de las 2 figuras y muestre cuál de ellas ocupa más
autor: jose luis mosquera losada
fecha: 8-02-2022 */

package JLMLt10;


public class Cilindro extends Figura3D_v2{
    
    private int radio;
    private int altura;

    public Cilindro(int radio, int altura) {
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double volumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public double superficie() {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
    }
    
}
