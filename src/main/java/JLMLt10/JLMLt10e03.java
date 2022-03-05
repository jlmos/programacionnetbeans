/*Hacer una nueva versión de las clases del ejercicio anterior (con _v2). Añadir a la
clase base el método abastracto superfici(). Crea una nueva clase Cilindro y hacer que 
implemente los métodos de la superclase. Hacer un programa que permita crear una instancia
de cada una de las 3 figuras y nos muestre cuál tiene más superficie.
autor: jose luis mosquera losada
fecha: 8-02-2022 */
package JLMLt10;


public class JLMLt10e03 {
    
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro(10, 10);
        Esfera_v2 esfera = new Esfera_v2(10);
        PrismaRectangular_v2 prismaRectangular = new PrismaRectangular_v2(10, 10, 10);
        
        if(cilindro.superficie() > esfera.superficie() && cilindro.superficie() > prismaRectangular.superficie()) {
            System.out.printf("El cilindro tiene mayor superficie: %.2f", cilindro.superficie());
        } else if(esfera.superficie() > prismaRectangular.superficie()) {
            System.out.printf("La esfera tiene mayor superficie: %.2f", esfera.superficie());
        } else {
            System.out.printf("El prisma tiene mayor superficie: %.2f", prismaRectangular.superficie());
        }
    }
    
}
