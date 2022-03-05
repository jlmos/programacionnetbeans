/*Convertir la clase abstracta Figura3D_v1 en una interfaz Figura3D_v3 con las mismas
características. Rehaz las clases Esfera y PrismaRectangular (tendrán sufijo v3) para
adaptarlas a la nueva interfaz. Hacer un programa que cree una instancia de cada una de
las 2 figuras y muestre cuál de ellas ocupa más.
autor: jose luis mosquera losada
fecha: 10-02-2022 */
package JLMLt10;


public class JLMLt10e07 {
    
       public static void main(String[] args) {
        Esfera_v3 esfera = new Esfera_v3(1);
        PrismaRectangular_v3 prismaRectangular = new PrismaRectangular_v3(5,10,12);
        double esf = esfera.volumen();
        double prisr = prismaRectangular.volumen();
        if (esf> prisr)
        System.out.printf("El volumen mayor es el de la ESFERA:%.2f",esf );
        else System.out.printf("El volumen mayor es el del PRISMA RECTANGULAR:%.2f",prisr);
    }

}
