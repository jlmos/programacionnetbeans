/*implementar una clase llamada DEjemplarLibro que se va a usar en un biblioteca
y que tiene 4 atributos y 5 métodos, hacer un main que cree 4 libros (probando
ambos constructores), que realice algún préstamo y devolución y finalmente
muestre los libros con toSting().
autor: jose luis mosquera losada
fecha: 28-12-2021 */
package JLMLt06;


public class JLMLt06e08 {

    public static void main(String[] args) {

  // Creación de libros
        DEjemplarLibro libro1 = new DEjemplarLibro("Ejemplo libro 1");
        DEjemplarLibro libro2 = new DEjemplarLibro("Ejemplo libro 2");
        DEjemplarLibro libro3 = new DEjemplarLibro(libro1);
        DEjemplarLibro libro4 = new DEjemplarLibro("Ejemplo libro 4");

        // Préstamos y devoluciones
        libro1.prestar();
        libro2.prestar();
        libro2.devolver();

        // Sacar por pantalla
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println(libro4.toString());


    }

}

 
    
