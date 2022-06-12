/*Crea una clase de tipo genérica llamada ListaPequeña que tendrá como atributos privados un
ArrayList de tipo genérico llamado valores y un entero (qué será final, piensa el porqué) con el
tamaño de la lista, llamado tamañoMax.
• Al constructor de esta clase le pasaremos un entero positivo que se asignará a
tamañoMax. El constructor instanciará también el ArrayList valores.
• Tendrá un método llamado añadir que se le pasa un objeto de tipo genérico y si el arraylist
aún tiene un tamaño menor que tamañoMax, lo añadirá, pero si el arraylist ha llegado a
ese tamaño, añadirá objeto pasado en la última posición del ArrayList, sustituyendo el
elemento que allí hubiera (así conseguimos que el ArrayList no crezca por encima del
tamaño máximo)
• Tiene un método llamado clear(), que simplemente hace un clear() del ArrayList valores.
• Tiene un método llamado getValores() que devuelve el ArrayList privado valores.
Haz un programa que cree una ListaPequeña de tipo String de 5 elementos. Añádele 6 ó 7 String
a la lista y muestra su contenido, para ver si ha crecido por encima de esos 5 elementos.
Crea otro programa similar al anterior, pero en vez de trabajar con String trabaje con una clase
que hayas creado previamente, por ejemplo: Persona_v4. 
autor: jose luis mosquera losada
fecha: 08-06-2022*/

package JLMLt16;

import java.util.ArrayList;


public class ListaPequeña {
    
private ArrayList<Dato> valores = new ArrayList<>();
    private int tamañoMax;

    public ListaPequeña(int tamañoMax) {
        this.tamañoMax = tamañoMax;
        valores = new ArrayList<>(tamañoMax);
    }

    public int getTamañoMax() {
        return tamañoMax;
    }

    public ArrayList<Dato> getValores() {
        return valores;
    }

    public void setTamañoMax(int tamañoMax) {
        this.tamañoMax = tamañoMax;
    }

    public void añadir(Dato d) {
        if (valores.size() < (tamañoMax - 1)) {
            valores.add(d);
        } else {
            valores.add(tamañoMax - 1, d);
        }
    }

    public void clear() {
        valores.clear();
    }

    void añadir(String matricula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void añadir(Persona_v4 persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Dato {

        public Dato() {
        }
    }

}

