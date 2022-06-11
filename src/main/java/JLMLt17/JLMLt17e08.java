/* Diseña una clase llamada libro, que sea capaz de mantener para un libro su ISBN,
nombre,precio y autores. Crea un programa que cargue en un ArrayList de "Libro" la 
información correspondiente que viene en el archivo 'librería.xml'. A continuación,
ordenará el ArrayList por título de libro y mostrará por pantalla el contenido 
completo de ese ArrayList.
autor: jose luis mosquera losada
fecha: 07-06-2022 */
package JLMLt17;

import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import java.util.ArrayList;

public class JLMLt17e08 {

    public static void main(String[] args) {

        ArrayList<Libro> biblioteca = new ArrayList<>();
        
        File file = new File("." + File.separator + "archivos" + File.separator + "libreria.xml");
        try ( FileInputStream fis = new FileInputStream(file);  InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = factory.newDocumentBuilder();
            Document doc = dB.parse(new InputSource(isr));
            NodeList listaLibros = doc.getElementsByTagName("libro");
            for (int i = 0; i < listaLibros.getLength(); i++) {
                Libro book = new Libro();
                Element libro = (Element) listaLibros.item(i);
                book.setIsbn(libro.getElementsByTagName("isbn").item(0).getTextContent());
                book.setTitulo(libro.getElementsByTagName("titulo").item(0).getTextContent());
                NodeList listaDimensiones = libro.getElementsByTagName("dimensiones");
                Element dimension = (Element) listaDimensiones.item(0);
                String[] dimensiones = new String[3];
                dimensiones[0] = dimension.getAttribute("alto");
                dimensiones[1] = dimension.getAttribute("ancho");
                dimensiones[2] = dimension.getAttribute("paginas");   
                book.setDimensiones(dimensiones);
                NodeList listaAutores = libro.getElementsByTagName("autores");
                String[] autores = new String[3];
                for (int j = 0; j < listaAutores.getLength(); j++) {
                    autores[0] = listaAutores.item(j).getTextContent();
                }
                book.setAutores(autores);
                book.setPrecio(libro.getElementsByTagName("precio").item(0).getTextContent());
                biblioteca.add(book);
            }
            for (int i = 0; i < biblioteca.size(); i++) {
               System.out.println(biblioteca.get(i).toString());
               System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

