/* Modificar el archivo XML 'librería.xml' pasando el precio a dólares (1 dolar 0 0,91eur).
Guardarlo con el nombre 'libreríaDolar.xml'
autor: jose luis mosquera losada
fecha: 07-06-2022 */

package JLMLt17;

import java.io.*;
import org.w3c.dom.*;
import java.nio.file.Files;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.InputSource;



public class JLMLt17e10 {

    public static void main(String[] args) {

        File file = new File("." + File.separator + "archivos" + File.separator + "libreria.xml");
        File copia = new File("." + File.separator + "archivos" + File.separator + "libreriaDolar.xml");

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
            NodeList listaPrecios = doc.getElementsByTagName("precio");
            for (int i = 0; i < listaPrecios.getLength(); i++) {
                Element precio = (Element) listaPrecios.item(i);
                String p = precio.getTextContent();
                Float dolares = Float.valueOf(p) * 0.91f;
                System.out.println(p+ " euros" + " - " + dolares + " dolares");
                precio.setTextContent(dolares.toString());               
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


