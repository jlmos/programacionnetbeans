/* Crea un archivo XML desde cero que solo contenga un elemento raíz llamado <agenda>
y elementos hijo de tipo texto como los que muestra la siguiente figura. No hace falta
que el usuario introduzca los valores, puedes meterlos en el código "a mano"
autor: jose luis mosquera losada
fecha: 11-06-2022 */

package JLMLt17;

import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


public class JLMLt17e14 {

    public static void main(String[] args) {

                File file = new File("." + File.separator + "archivos" + File.separator + "agenda.xml");

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = factory.newDocumentBuilder();
            Document doc = dB.newDocument();
            Element raiz = doc.createElement("agenda");
            doc.appendChild(raiz);
            Element nuevoElemento = doc.createElement("contacto");
            nuevoElemento.appendChild(doc.createTextNode("Pepe Pérez"));
            raiz.appendChild(nuevoElemento);
            nuevoElemento = doc.createElement("contacto");
            nuevoElemento.appendChild(doc.createTextNode("Ana López"));
            raiz.appendChild(nuevoElemento);
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.transform(new DOMSource(doc), new StreamResult(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



