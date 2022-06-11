/* Realizar un programa que muestre el título de todos los libros presentes en'librería.xml'
con su temática (puede que algún libro no tenga temática, en ese caso mostrará: " Temática desconocida"
autor: jose luis mosquera losada
fecha: 05-06-2022 */

package JLMLt17;
import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.xml.sax.InputSource;


public class JLMLt17e04 {

    
    public static void main(String[] args) {
       
        String titulo, precio, tematica;
        File file = new File("." + File.separator + "archivos" + File.separator + "libreria.xml");

        try ( FileInputStream fis = new FileInputStream(file);  InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = factory.newDocumentBuilder();
            Document doc = dB.parse(new InputSource(isr));
            NodeList listaLibros = doc.getElementsByTagName("libro");
            for (int i = 0; i < listaLibros.getLength(); i++) {
                Element element = (Element) listaLibros.item(i);
                titulo = element.getElementsByTagName("titulo").item(0).getTextContent();
                precio = element.getElementsByTagName("precio").item(0).getTextContent();
                if (element.getElementsByTagName("tematica").item(0) != null) {
                    tematica = element.getElementsByTagName("tematica").item(0).getTextContent();
                } else {
                    tematica = "Temática desconocida";
                }
                System.out.println("Titulo del libro: " + titulo + " ; precio: " + precio + " ; temática: " + tematica);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




    
    

