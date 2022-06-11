/* Diseña una clase llamada libro, que sea capaz de mantener para un libro su ISBN,
nombre,precio y autores. Crea un programa que cargue en un ArrayList de "Libro" la 
información correspondiente que viene en el archivo 'librería.xml'. A continuación,
ordenará el ArrayList por título de libro y mostrará por pantalla el contenido 
completo de ese ArrayList.
autor: jose luis mosquera losada
fecha: 07-06-2022 */
package JLMLt17;

public class Libro {

    private String isbn;
    private String titulo;
    private String[] dimensiones;
    private String[] autores;
    private String tematica;
    private String precio;

    public Libro() {
        dimensiones = new String[3];
        autores = new String[3];
    }

    public Libro(String isbn, String titulo, String[] dimensiones, String[] autores, String tematica, String precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.dimensiones = dimensiones;
        this.autores = autores;
        this.tematica = tematica;
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String[] dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String[] getAutores() {
        return autores;
    }

    public void setAutores(String[] autores) {
        this.autores = autores;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        String texto = " Titulo: " + this.titulo + "  isbn: " + this.isbn
                + "\n\tautores: " + this.autores[0]
                + "\n\ttematica: " + tematica + " , precio: " + precio
                + "\n\tdimensiones: " + "alto: " + this.dimensiones[0] + " , ancho: " + this.dimensiones[1] + " , paginas: " + this.dimensiones[2];
        return texto;
    }
}


