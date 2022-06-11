/* Modificar el archivo XML 'librería.xml' añadiendo a cada libro una etiquetaa <editorial>.
Al usuario se le dirá el título del libro y él introducirá el nombre de la editorial. Guarda el 
archivo con el nombre "libreríaconEditorial.xml'.
autor: jose luis mosquera losada
fecha: 07-06-2022 */

package JLMLt17;

import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.Scanner;

public class JLMLt17e12 {

    public static void main(String[] args) {

        String entrada;
        Scanner teclado = new Scanner(System.in);
        File file = new File("." + File.separator + "archivos" + File.separator + "libreria.xml");

        try ( FileInputStream fis = new FileInputStream(file);  InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = factory.newDocumentBuilder();
            Document doc = dB.parse(new InputSource(isr));
            NodeList listaLibros = doc.getElementsByTagName("libro");
            for (int i = 0; i < listaLibros.getLength(); i++) {
                Element libro = (Element) listaLibros.item(i);
                Element nuevoElemento = doc.createElement("editorial");
                System.out.println("Introduce la editorial del libro: ''" + libro.getElementsByTagName("titulo").item(0).getTextContent()+"'':" );
                entrada = teclado.nextLine();
                nuevoElemento.appendChild(doc.createTextNode(entrada));
                libro.appendChild(nuevoElemento);
            }
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.transform(new DOMSource(doc), new StreamResult(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

