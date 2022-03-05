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

import java.util.Scanner;


public class JLMLt07e08 {

    
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
        CarritoCompra carritoCompra = new CarritoCompra();

        do {
            System.out.println("--------------------------------------");
            System.out.println("Menú:");
            System.out.println("1. Mostrar contenido del carrito");
            System.out.println("2. Añadir producto");
            System.out.println("3. Mostrar total");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if(carritoCompra.getContenido()[0] == null) {
                        System.out.println("Carrito vacío");
                    } else {
                        System.out.println("El contenido del carrito es el siguiente: ");
                        for(Producto producto : carritoCompra.getContenido()) {
                            if(producto == null) break;
                            System.out.println(producto.toString());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Introduce código: ");
                    String codigo = scanner.next();
                    System.out.print("Introduce descripción: ");
                    String descripcion = scanner.next();
                    System.out.print("Introduce cantidad: ");
                    int cantidad = scanner.nextInt();
                    System.out.print("Introduce precio: ");
                    double precio = scanner.nextDouble();
                    Producto producto = new Producto(codigo, descripcion, precio, cantidad);
                    carritoCompra.addProducto(producto);
                    break;
                case 3:
                    System.out.println("Total: " + carritoCompra.getTotal());
                    break;
                case 4: return;
            }
        } while (true);



    }

}
