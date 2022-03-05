/* Hacer una nueva versión de la interfaz del ejercicio anterior (con _v4). Añádele
a la interfaz el método superficie(). Crea una nueva clase Cilindro_v4 y haz que implemente
los métodos de la interfaz. Haz un programa que permita crear una instancia de cad una de
las 3 figuras y nos muestre cuál tiene más superficie.
1. Al añadir el nuevo método a la interfaz, si no modificamos las clases que la  implementan
 se produce error? xq? Cómo lo evitamos?
2. Suponer que se añade a la interfaz un nuevo método llamado ocupaMasque que va a ser igual
para todas las clases que implementen la interfaz, ya que es una comparción del volumen,tenga
la forma que tenga. Qué opciones tenemos para no tener que implementarlo en todas las clases?
autor: jose luis mosquera losada
fecha: 11-02-2022 */

package JLMLt10;


public class Cilindro_v4 implements Figura3D_v4 {

    private int radio;
    private int altura;

    public Cilindro_v4(int radio, int altura) {
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
