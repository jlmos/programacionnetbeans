/*Hacer una clase abstracta llamada Figura3D_v1 con método abstracto volumen(). 
Crea subclases Esfera_v1 y PrismaRectangular_v1 que implemente el método de la 
superclase. Incorpora los atributos que creas necesarios a las tres clases. Haz un 
programa que cree una instancia de cada una de las 2 figuras y muestre cuál de ellas ocupa más
autor: jose luis mosquera losada
fecha: 8-02-2022 */
package JLMLt10;

/**
 *
 * @author ESTUDIOS
 */
public class PrismaRectangular_v2 extends Figura3D_v2 {
   private int base;
   private int altura;
   private int profundidad;
   
   public PrismaRectangular_v2 (int base, int altura, int profundidad){
       this.base=base;
       this.altura=altura;
       this.profundidad=profundidad;
   }
    
    @Override
   public double volumen(){
     
       return base * altura * profundidad;
   }

    @Override
    public double superficie() {
        return 2 * (base * altura + altura * profundidad + profundidad * base);
    }
}

