/* En el paquete pMates crea una clase pública Calculadora que tiene definido un ArrayList
público de enteros, con métodos: private sumar(), protected menor() y public media ()que
operan sobre el ArrayList de la clase devolviendo la suma, el menor y la media respectivamente.
autor: jose luis mosquera losada
fecha: 22-02-2022 */
package JLMLt11.pClasesApoyo.pMates;

import java.util.ArrayList;

public class Calculadora {

    public ArrayList<Integer> enteros;

    private int sumar() {
        int suma = 0;
        for (Integer entero : enteros) {
            suma += entero;
        }
        return suma;
    }

    protected int menor() {
        int menor = enteros.get(0);
        for (Integer entero : enteros) {
            if(entero < menor) menor = entero;
        }
        return menor;
    }

    public double media() {
        return sumar() / enteros.size();
    }

}
