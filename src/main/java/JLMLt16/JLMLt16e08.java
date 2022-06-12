/*Crea una clase de tipo genérica (cualquier tipo que herede de Number) que describa un
cuadrado.
• Tiene un único atributo llamado “lado” de tipo genérico.
• Tiene un constructor al que se le pasa también un valor genérico y lo asigna a lado.
• Tiene un método que calcule el área del cuadrado, multiplicando lado.doubleValue() *
lado.doubleValue() y devolviendo un tipo de dato Number.
Haz un programa que instancie cuadrados de tipo Integer, Long y Double de distintos tamaños
y muestra el área de todos ellos.
autor: jose luis mosquera losada
fecha: 08-06-2022 */

package JLMLt16;


public class JLMLt16e08 {

   
    public static void main(String[] args) {
    int ladoInt = 4;
        long ladoLong = 6;
        double ladoDouble = 8.2;

        Numerico cuadradoInt = new Numerico(ladoInt);
        Numerico cuadradoLong = new Numerico(ladoLong);
        Numerico cuadradoDouble = new Numerico(ladoDouble);

        System.out.println("Área del cuadrado (int) es: " + cuadradoInt.areaCuadrado());
        System.out.println("Área del cuadrado (long) es: " + cuadradoLong.areaCuadrado());
        System.out.println("Área del cuadrado (double) es: " + cuadradoDouble.areaCuadrado());

    }

}



