/* Hacer una nueva versión de la interfaz del ejercicio anterior (con _v4). Añádele
a la interfaz el método superficie(). Crea una nueva clase Cilindro_v4 y haz que implemente
los métodos de la interfaz. Haz un programa que permita crear una instancia de cad una de
las 3 figuras y nos muestre cuál tiene más superficie.
autor: jose luis mosquera losada
fecha: 11-02-2022 */
package JLMLt10;

public class PrismaRectangular_v4 implements Figura3D_v4 {
   private int base;
   private int altura;
   private int profundidad;

   public PrismaRectangular_v4(int base, int altura, int profundidad){
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

