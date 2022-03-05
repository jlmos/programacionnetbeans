/*Crear dos productos p1 ordenador y p2 barra de pan.
autor: jose luis mosquera losada
fecha: 28-12-2021 */
package JLMLt06;

public class JLMLt06CuestionesProductoB {

    public static void main(String[] args) {// creación de los dos productos
        JLMLt06CuestionesProductoA bp = new JLMLt06CuestionesProductoA("barra de pan", 1d, 0.04d);
        JLMLt06CuestionesProductoA or = new JLMLt06CuestionesProductoA("ordenador", 1000d, 0.21d);
        double pfb = bp.calcularPrecioFinal();
        double pfo = or.calcularPrecioFinal();
        System.out.println("precio final barra de pan: " + pfb);
        System.out.println("precio final ordenador: " + pfo);// precio final por pantalla.
        or.descuento = 0.10;//descuento 10%
        pfo = or.calcularPrecioFinal() + or.descuento;
        System.out.println("precio final del ordenador con descuesto es: " + pfo);
        bp.nombre = "chapata"; //cambiar nombre a la barra de pan
        System.out.println(bp.nombre);
        or.IVA=bp.IVA; //i)que le asigna el 4% al precio del ordenador
        or.descuento = bp.descuento; // j)lo mismo pero no aplica el descuento que la barra de pan no lo tiene
        or = bp; //k) referencia la posición de memoria.
        System.out.println(or);
        if (or == bp) {/*m) como anteriormente había asignación de bp a or, al final si que son iguales
            por lo que entra dentro del bucle */
            System.out.println("iguales");
        }

        System.out.println("precio final ordenador con descuento: " + or.calcularPrecioFinal());
        System.out.println("precio final barra de pan con descuento: " + bp.calcularPrecioFinal());
    }

}
