/* Realizar un programa que muestre el nombre de todos los libros con su autor o autores.
autor: jose luis mosquera losada
fecha: 07-06-2022 */

package JLMLt17;
import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.xml.sax.InputSource;


public class JLMLt17e06 {

    
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
                System.out.print("Titulo del libro: " + titulo);
                System.out.print("\n-------------------------Autor/es: ");
                NodeList listaAutores = element.getElementsByTagName("autores");
                for (int j = 0; j < listaAutores.getLength(); j++) {
                    String a = listaAutores.item(j).getTextContent();
                    System.out.print(a);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






    
    

