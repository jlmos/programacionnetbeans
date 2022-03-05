/*Realiza una clase carritoCompra que mantenga las compras realizadas por un cliente en un Array.
Cada posición del Array contendrá el código del producto, la descrpición, el precio unitario y la cantidad de
unidades compradas y el precio total de ese producto. Compra máxima 100 artículos diferentes. Además de la lista
de productos, la clase tiene el importe total de la compra, que debe estar siempre actualizado.Necesitamos los métodos:
a) mostrar por consola el estado actual y b) añadir producto. 
Hacer un programa con un menú que permita al usuario operar con el carrito de la compra.
Pensar en un método .toString para cada producto comprado
autor: jose luis mosquera losada
fecha: 17-1-2022 */

package JLMLt07;

public class CarritoCompra {
 private final int MAX_ARTICULOS = 100;

    private Producto[] contenido;
    private double total;

    public CarritoCompra() {
        total = 0;
        contenido = new Producto[MAX_ARTICULOS];
    }

    public Producto[] getContenido() {
        return contenido;
    }

    public String addProducto(Producto producto) {
        for(int i=0; i< contenido.length; i++) {
            if (contenido[i] == null) {
                contenido[i] = producto;
                total += producto.getPrecioTotal();
                return "Producto añadido correctamente";
            }
        }
        return "No hay más espacio en la cesta";
    }

    public double getTotal() {
        return total;
    }
}   

