/* 
autor: jose luis mosquera losada
fecha: 08-06-2022*/

package JLMLt16;


public class Numerico<Dato extends Number> {
    
    Dato lado;
    
    public Numerico(Dato lado){
        this.lado = lado;
    }
    
    public Number areaCuadrado(){
        return  lado.doubleValue() * lado.doubleValue();
    }
    
}


