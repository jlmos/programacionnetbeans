/*crear un main para saber que muestra por pantalla
autor: jose luis mosquera losada
fecha: 28-12-2021*/
package JLMLt06;

public class JLMLt06CuestionesProductoC {

    public static void main(String[] args) {
        JLMLt06CuestionesProductoA p3 = new JLMLt06CuestionesProductoA ("impresora",50d,0.21);
        JLMLt06CuestionesProductoA p4 = p3;
        p3.precio=60;
        System.out.println(p4.precio);
    } /*al hacer la asiganción p4=p3 ambas variables referencian al mismo objeto en memoria,
    por lo tanto al modificar p3 el valor de la variable precio de p4 también se verá modificado*/

}
