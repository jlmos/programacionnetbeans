/*Programa con una función a la que se le pasa un ArrayList de enteros como parámetros y nos devuelva true si los dos
ArrayList tienen los mismos elementos aunque sean en otro orden y devuelva false en caso contrario (suponemos sin valores repetidos) 
 autor: jose luis mosquera losada
fecha: 15-1-2022
 */
package JLMLt07;

import java.util.ArrayList;
import java.util.Arrays;

public class JLMLt07e24 {

    
    public static void main(String[] args) {
        
    ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(7, 5, 3, 1));
        System.out.println("lista1 y lista2: " + tienenMismosElementos(lista1, lista2));

        ArrayList<Integer> lista3 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        ArrayList<Integer> lista4 = new ArrayList<>(Arrays.asList(1, 3, 5, 6));
        System.out.println("lista3 y lista4: " + tienenMismosElementos(lista3, lista4));

    }

    public static boolean tienenMismosElementos(ArrayList lista1, ArrayList lista2) {
        if(lista1.size() != lista2.size()) return false;
        for (Object o : lista1) {
            if(!lista2.contains(o)) return false;
        }
        return true;
    }
}