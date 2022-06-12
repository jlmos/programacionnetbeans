/* Modificar el archivo XML 'librería.xml' pasando el alto y  el ancho a pulgadas.
Guardarlo con el nombre 'libreríaPulgadas.xml'
autor: jose luis mosquera losada
fecha: 11-06-2022 */

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

public class JLMLt17e11 {

    public static void main(String[] args) {

        File file = new File("." + File.separator + "archivos" + File.separator + "libreria.xml");
        File copia = new File("." + File.separator + "archivos" + File.separator + "libreriaPulgadas.xml");

        try {
            if (copia.exists()) {
                copia.delete();
            }
            Files.copy(file.toPath(), copia.toPath());
        } catch (IOException ex) {
            System.err.printf("Error:%s", ex.getMessage());
        }

        try (FileInputStream fis = new FileInputStream(copia); InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = factory.newDocumentBuilder();
            Document doc = dB.parse(new InputSource(isr));
            NodeList listaDimensiones = doc.getElementsByTagName("dimensiones");
            for (int i = 0; i < listaDimensiones.getLength(); i++) {
                Element dimension = (Element) listaDimensiones.item(i);
                if (dimension.hasAttribute("alto") && dimension.hasAttribute("ancho")) {
                    Float d = Float.valueOf(dimension.getAttribute("alto")) * 0.3937f;
                    dimension.setAttribute("alto", d.toString());
                    d = Float.valueOf(dimension.getAttribute("alto")) * 0.3937f;
                                    System.out.println(d+ " pulgadas" );

                    dimension.setAttribute("ancho", d.toString());
                }
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
