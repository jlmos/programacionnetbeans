/*Implementar el juego de ajedrez para dos jugadores, crear una clase abstracta llamada
PiezaAjedrez, con dos atributos enteros llamados fila y columna que representan sus
coordenadas en el tablero (valores entre 0 y 7) y un método abstracto llamdo mover() al
que se le pasan como parámetro la fila y la columna destino de un movimiento erróneo. El método
devolver true si el movimiento se puede realizar o false si es un movimiento erróneo. Implementar
esa clase y sus subclases AlfilAjedres y TorreAjedrez. Pensar en movimientos de un tablero vacío, solo
con una pieza, la que se está moviendo.
a) programa que permita al usuario mover una sola pieza (elegir entre alfin o torre) por el tablero
partiendo de la posición 0,0, indicando las coordenadas destino del movimiento que quiere hacer cada
vez, teminando el programa cuando introduzca -1.
b) el programa tendrá una función que presente por pantalla la situación del tablero.
autor: jose luis mosquera losada
fecha: 8-02-2022 */
package JLMLt10;

public class TorreAjedrez extends PiezaAjedrez {

    @Override
    public boolean mover(int fila, int columna) {
        if(fila > 7 || fila < 0) return false;
        if(columna > 7 || columna < 0) return false;
        if(columna != this.getColumna() && fila != this.getFila()) return false;
        efectuarMovimiento(fila, columna);
        return true;
    }

    @Override
    public String toString() {
        return "T";
    }
  }
