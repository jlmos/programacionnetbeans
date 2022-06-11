/* Realizar un programa que muestre el título de todos los libros presentes 'librería.xml'
con su precio.(todos los libros tienen precio)
autor: jose luis mosquera losada
fecha: 05-06-2022 */

package JLMLt17;
import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.xml.sax.InputSource;


public class JLMLt17e03 {

    
    public static void main(String[] args) {
       
        File file = new File("." + File.separator + "archivos" + File.separator + "libreria.xml");
        try ( FileInputStream fis = new FileInputStream(file);  InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = factory.newDocumentBuilder();
            Document doc = dB.parse(new InputSource(isr));
            NodeList listaLibros = doc.getElementsByTagName("libro");
            for (int i = 0; i < listaLibros.getLength(); i++) {
                Element element = (Element) listaLibros.item(i);
                String titulo = element.getElementsByTagName("titulo").item(0).getTextContent();
                String precio = element.getElementsByTagName("precio").item(0).getTextContent();
                System.out.println("Titulo del libro: " + titulo + "  precio: " + precio );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



    
    

