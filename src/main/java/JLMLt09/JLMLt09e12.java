/* Teniendo en cuenta la clase Bicicleta, hacer un programa que defina una o dos
instancias de bicicletas y use los métodos creados valorando que: a) dos bicicletas 
son iguales si tienen la misma marca y modelo. b) si se fija un descuento, se elimina 
el descuento que pudiera haber anteriormente. c) Pensar si es necesario incorporar 
algún atributo más, para que cuando ejecutemos el método de ver el precio final con descuento,
sepa si tiene que aplicar algún descuento o no.
autor: jose luis mosquera losada
fecha: 4-02-2022  
 */
package JLMLt09;


public class JLMLt09e12 {

    
    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Bicicleta();
        bicicleta1.setMarca("Marca");
        bicicleta1.setModelo("Modelo");
        bicicleta1.setPrecio(100);

        Bicicleta bicicleta2 = new Bicicleta();
        bicicleta2.setMarca("Marca");
        bicicleta2.setModelo("Modelo");
        bicicleta2.setPrecio(100);
        bicicleta2.fijarDescuento(0.25, 3);

        System.out.println("Las bicicletas son iguales? " + bicicleta1.equals(bicicleta2)); // Deberían ser iguales, porque el ejercicio especifica que sólo se ha de comparar marca y modelo
        System.out.println("Precio final bici1: " + bicicleta1.precioConDescuento());
        System.out.println("Precio final bici2: " + bicicleta2.precioConDescuento());
    }

}
