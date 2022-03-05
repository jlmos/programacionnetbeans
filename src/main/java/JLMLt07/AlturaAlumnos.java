/*ArrayList con AlturaAlumnos manteniendo una lista con las alturas de los alumnos,
con valores positivos entre 0,50 y 2,50 redondeados a dos decimales. Con las 
siguientes funciones a traves de un menú: Añadir altura, mostrar lista actual con,
número de posición, eliminar posición, eliminar por valor, ordenar lista y vaciar lista. 
autor: jose luis mosquera losada
fecha: 14-1-2022 */
package JLMLt07;

import java.util.ArrayList;
import java.util.Collections;

public class AlturaAlumnos {
private final ArrayList <Double>altura;

AlturaAlumnos(){
    altura=new ArrayList<>();
}
public boolean añadirAltura (double a){
    if(a>=0.5 && a<=2.5){
        altura.add(a);
        Collections.sort(altura);
        return true;
    }
    return false;
}
public ArrayList<Double>mostrarLista(){
    return this.altura;
}
public boolean eliminarPosicion(int p){
    Double res;
    if(p>=0 && p<altura.size()){
        res=altura.remove(p);
        if(res!=null)return true;
    }
    return false;
}
public boolean eliminarValor(Double v){
    boolean res=false;
    while (altura.remove(v)){res=true;}
return res;
} public void vaciarLista(){
altura.clear();
}}
