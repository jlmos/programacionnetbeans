/* Realizar un programa que muestre el título de todos los libros presentes en'librería.xml'
con su precio de aquellos libros que cuesten menos de 10 euros.
autor: jose luis mosquera losada
fecha: 07-06-2022 */

package JLMLt17;
import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.xml.sax.InputSource;


public class JLMLt17e05 {

    
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
                if(Double.valueOf(precio)<10){
                   System.out.println("Titulo libro: " + titulo + "  precio: " + precio ); 
                }               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    





    
    

