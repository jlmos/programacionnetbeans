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


 public class Producto {

    private String codigo;
    private String descripcion;
    private double precio;
    private int cantidad;
    private double precioTotal;

    public Producto(String codigo, String descripcion, double precio, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.precioTotal = this.precio * this.cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", precioTotal=" + precioTotal +
                '}';
    }
}   

