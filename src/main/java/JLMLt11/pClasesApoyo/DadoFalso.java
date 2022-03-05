/* En el paquete pClasesApoyo crear una clase con acceso default DadoFalso con un método público lanzar(int n)
que devuelva el resultado aleatorio de lanzar un dado, pero trucado, de forma que el número 'n' pasado como
parámetro tiene el doble de posibilidades de salir que el resto
autor: jose luis mosquera losada
fecha: 20-02-2022 */
package JLMLt11.pClasesApoyo;

import java.util.Random;

class DadoFalso {

    public int lanzar(int n) {
        int result = new Random().nextInt(7) + 1;
        if (result == 7) return n; else return result;
  }

}