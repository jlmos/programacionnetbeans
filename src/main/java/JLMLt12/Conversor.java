/*Realizar un programa como el de la imagen dada, que permita convertir entre grados Celsius a Fahrenheit.
Implementa una clase Conversor con métodos estáticos para pasar de Celsius a Fahrenheit y
viceversa. Ponle título a la ventana.
autor: jose luis mosquera losada
fecha: 28-03-2022 */
package JLMLt12;


public class Conversor {
    
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
}
