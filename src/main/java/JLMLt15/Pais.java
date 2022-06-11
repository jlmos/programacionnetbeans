/*Crear una aplicación gráfica con Swing, con una colección que se cargue desde el archivo
paises2019.csv(línea por pais, con nombre de pais, capital y población, separados por punto y coma)
El programa tendrá una lista desplegada con los paises, ordenada alfabéticamente. Cuando se elija
un país, en una caja de texto se mostrará su capital y en otra su población. Elige la colección
más adecuada pensando que la interfaz con el usuario podría ser otra(consola, web) que queremos que la 
lista de países esté ordenada y que el texto de capital y población se actualiza a partir del nombre 
seleccionado en la lista.
autor: jose luis mosquera losada
fecha: 6-06-2022 */
package JLMLt15;


public class Pais {

    
    public String capital;
    public String poblacion;

    public Pais() {
    }

    public Pais(String capital, String poblacion) {
        this.capital = capital;
        this.poblacion = poblacion;
    }

}



