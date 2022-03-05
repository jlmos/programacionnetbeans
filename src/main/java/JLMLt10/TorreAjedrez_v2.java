/*Modificar la clase PiezaAjedrez (versión _v2) par incluir métodos estáticos? para que 
el usuario introduzca la columna como letra(a-h) y la fila (entre 1-8) y los convierta en
valores usados previamente (entre 0 y 7). Obligando a generar una nueva versión del programa 
anterior, para que el usuario introduzca a-h y 1-8 como valores destino del movimiento.
autor: jose luis mosquera losada
fecha: 10-02-2022 */
package JLMLt10;

public class TorreAjedrez_v2 extends PiezaAjedrez_v2 {

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
