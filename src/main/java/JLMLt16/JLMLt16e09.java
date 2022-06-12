/*Define una interfaz llamada Operable, que sea genérica de tipo ‘T’. Tiene que declarar los
métodos llamados: suma y resta. Ambos métodos recibirán dos parámetros de tipo genérico ‘T’ y
devolverán un genérico del mismo tipo.
• Crea una clase (no genérica) llamada OperadorEntero que implemente la interfaz anterior
con Integer (ya sabemos cómo es la suma y resta de enteros)
• Crea una clase (no genérica) llamada OperadorString que implemente la interfaz anterior
con Strings. La suma de Strings es la concatenación de la primera cadena pasada como
parámetro con la segunda. La resta de String será eliminar todas las ocurrencias de la
cadena segundo operando que se encuentren en la cadena primer operando, por
ejemplo, resta (“AbcDDxxDD”,”DD”) devolvería “Abcxx”.
• Finalmente, haz un programa que instancie ambas clases creadas y opere con ellas.
autor: jose luis mosquera losada
fecha: 08-06-2022 */

package JLMLt16;


public class JLMLt16e09 {

   
    public static void main(String[] args) {
    OperadorEntero numeros = new OperadorEntero();
        System.out.println("La suma de dos numeros 12 y 17 es: " + numeros.suma(12,17));
        System.out.println("La resta de dos numeros 5 y 3 es: " + numeros.resta(5,3));
        
        OperadorString palabras = new OperadorString();
        System.out.println("La suma de dos palabras casa y mar es: " + palabras.suma("casa","mar"));
        System.out.println("La resta de dos palabras amuleto y suerte es: " + palabras.resta("amuleto","suerte"));
    
    }
    
}




