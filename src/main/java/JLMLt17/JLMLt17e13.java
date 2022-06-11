/* Modificar el archivo XML 'librería.xml' eliminando las etiquetas 'isbn', 'dimensiones',
'temática' y 'precio'.Guárdarlo con el nombre 'libreríaResumen.xml'.
autor: jose luis mosquera losada
fecha: 07-06-2022 */

package JLMLt17;

import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import org.xml.sax.InputSource;
import java.nio.file.Files;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


public class JLMLt17e13 {

    public static void main(String[] args) {

                File file = new File("." + File.separator + "archivos" + File.separator + "libreria.xml");
        File copia = new File("." + File.separator + "archivos" + File.separator + "libreriaResumen.xml");

        try {
            if (copia.exists()) {
                copia.delete();
            }
            Files.copy(file.toPath(), copia.toPath());
        } catch (IOException ex) {
            System.err.printf("Error:%s", ex.getMessage());
        }

        try ( FileInputStream fis = new FileInputStream(copia);  InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = factory.newDocumentBuilder();
            Document doc = dB.parse(new InputSource(isr));
            Element raiz = doc.getDocumentElement();
            NodeList listaLibros = doc.getElementsByTagName("libro");
            for (int i = 0; i < listaLibros.getLength(); i++) {
                Element libro = (Element) listaLibros.item(i);
                Element elementoHijo = (Element) libro.getElementsByTagName("isbn").item(0);
                libro.removeChild(elementoHijo);
                elementoHijo = (Element) libro.getElementsByTagName("dimensiones").item(0);
                libro.removeChild(elementoHijo);
                if (libro.hasAttribute("tematica")) {
                    elementoHijo = (Element) libro.getElementsByTagName("tematica").item(0);
                    libro.removeChild(elementoHijo);
                }
                elementoHijo = (Element) libro.getElementsByTagName("precio").item(0);
                libro.removeChild(elementoHijo);
            }
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.transform(new DOMSource(doc), new StreamResult(copia));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


