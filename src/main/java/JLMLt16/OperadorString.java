/* Crea una clase (no genérica) llamada OperadorString que implemente la interfaz anterior
con Strings. La suma de Strings es la concatenación de la primera cadena pasada como
parámetro con la segunda. La resta de String será eliminar todas las ocurrencias de la
cadena segundo operando que se encuentren en la cadena primer operando, por
ejemplo, resta (“AbcDDxxDD”,”DD”) devolvería “Abcxx”.
autor: jose luis mosquera losada
fecha: 08-06-2022*/

package JLMLt16;


public class OperadorString extends Operable<String> {

    @Override
    public String suma(String d1, String d2) {
        return d1 + d2;
    }

    @Override
    public String resta(String d1, String d2) {
        return d1.replace(d2,"");
    }

}



