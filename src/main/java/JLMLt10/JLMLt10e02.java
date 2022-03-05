/* Hacer una clase abstracta llamada Figura3D_v1 con método abstracto volumen(). 
Crea subclases Esfera_v1 y PrismaRectangular_v1 que implemente el método de la 
superclase. Incorpora los atributos que creas necesarios a las tres clases. Haz un 
programa que cree una instancia de cada una de las 2 figuras y muestre cuál de ellas ocupa más
autor: jose luis mosquera losada
fecha: 7-02-2022 */
package JLMLt10;


public class JLMLt10e02 {

    
    public static void main(String[] args) {
        Esfera_v1 esfera = new Esfera_v1(1);
        PrismaRectangular_v1 prismaRectangular = new PrismaRectangular_v1(5,10,12);
        double esf = esfera.volumen();
        double prisr = prismaRectangular.volumen();
        if (esf> prisr)
        System.out.printf("El volumen mayor es el de la ESFERA:%.2f",esf );
        else System.out.printf("El volumen mayor es el del PRISMA RECTANGULAR:%.2f",prisr);
    }
    
}
