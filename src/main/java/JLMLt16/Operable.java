/* Define una interfaz llamada Operable, que sea genérica de tipo ‘T’. Tiene que declarar los
métodos llamados: suma y resta. Ambos métodos recibirán dos parámetros de tipo genérico ‘T’ y
devolverán un genérico del mismo tipo.
autor: jose luis mosquera losada
fecha: 08-06-2022*/

package JLMLt16;


public abstract class Operable <T> {
    
    public abstract T suma(T d1,T d2);
    public abstract T resta(T d1,T d2);
}



