/* Realizar un programa que muestre el nombre de todos los libros con su alto, ancho y
número de páginas. (Algunos puede que no tengan toda o parte de esa información, mostrar
una interrogación en sus valores, por ejemplo: "el perfume -> Dimensiones ?cm x ?cm. ? páginas.
autor: jose luis mosquera losada
fecha: 07-06-2022 */
package JLMLt17;

import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.xml.sax.InputSource;

public class JLMLt17e07 {

    public static void main(String[] args) {

        File file = new File("." + File.separator + "archivos" + File.separator + "libreria.xml");
        try (FileInputStream fis = new FileInputStream(file); InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = factory.newDocumentBuilder();
            Document doc = dB.parse(new InputSource(isr));
            NodeList listaLibros = doc.getElementsByTagName("libro");
            for (int i = 0; i < listaLibros.getLength(); i++) {
                Element libro = (Element) listaLibros.item(i);
                String titulo = libro.getElementsByTagName("titulo").item(0).getTextContent();
                System.out.println("Titulo del libro: " + titulo);
                NodeList listaDimensiones = libro.getElementsByTagName("dimensiones");
                Element dimension = (Element) listaDimensiones.item(0);
                String alto = dimension.getAttribute("alto:");
                String ancho = dimension.getAttribute("ancho:");
                String paginas = dimension.getAttribute("paginas");
                System.out.println("   alto: ?" + alto);
                System.out.println("   ancho: ?" + ancho);
                System.out.println("   páginas: " + paginas);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
