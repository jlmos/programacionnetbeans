/* Modificar la clase PiezaAjedrez (versión _v2) par incluir métodos estáticos? para que 
el usuario introduzca la columna como letra(a-h) y la fila (entre 1-8) y los convierta en
valores usados previamente (entre 0 y 7). Obligando a generar una nueva versión del programa 
anterior, para que el usuario introduzca a-h y 1-8 como valores destino del movimiento.
autor: jose luis mosquera losada
fecha: 10-02-2022 */
package JLMLt10;

public abstract class PiezaAjedrez_v2 {

    private int fila;
    private int columna;

    public boolean moverV2(int fila, char columna) {
        int filaV1 = fila-1;
        int columnaV1 = 0;
        switch (columna) {
            case 'a': columnaV1 = 0; break;
            case 'b': columnaV1 = 1; break;
            case 'c': columnaV1 = 2; break;
            case 'd': columnaV1 = 3; break;
            case 'e': columnaV1 = 4; break;
            case 'f': columnaV1 = 5; break;
            case 'g': columnaV1 = 6; break;
            case 'h': columnaV1 = 7; break;
        }
        return mover(filaV1, columnaV1);
    }

    
    public abstract boolean mover(int fila, int columna);

    public void efectuarMovimiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }



}
