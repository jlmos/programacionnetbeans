/*  Crear una nueva clase hija de Figura2D_v8 llamada Rectangulo_v8 con constructor con tres
parámetros (alto, ancho, nombre), constructor con un dos parámetros (alto igual a ancho y
nombre) y un método que devuelve boolean llamado esCuadrado(). 
autor: jose luis mosquera losada
fecha: 21-01-2022 */
package JLMLt08;

public class Rectangulo_v8 extends Figura2D_v8 {

    public Rectangulo_v8(double ancho, double alto, String nombre) {
        super(ancho, alto, nombre);
    }

    public Rectangulo_v8(double altoancho, String nombre) {
        super(altoancho, nombre);
    }

    public boolean esCuadrado() {
        return getAncho() == getAlto();
    }
}