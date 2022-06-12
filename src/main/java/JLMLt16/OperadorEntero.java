/* Crea una clase (no genérica) llamada OperadorEntero que implemente la interfaz anterior
con Integer (ya sabemos cómo es la suma y resta de enteros)
autor: jose luis mosquera losada
fecha: 08-06-2022*/

package JLMLt16;


public class OperadorEntero extends Operable<Integer> {
    
    @Override
    public Integer suma(Integer d1, Integer d2) {
        return d1+d2;
    }

    @Override
    public Integer resta(Integer d1, Integer d2) {
        return d1-d2;
    }
    
}






