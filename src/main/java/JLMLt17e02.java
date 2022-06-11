/* Realizar un programa que muestre el nombre del documento raíz del archivo 'librería.xml'.
autor: jose luis mosquera losada
fecha: 05-06-2022
 */

import JLMLt17.*;
import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;


public class JLMLt17e02 {

    
    public static void main(String[] args) {
       File file = new File("." + File.separator + "archivos" + File.separator + "libreria.xml");
        try ( FileInputStream fis = new FileInputStream(file);  InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = factory.newDocumentBuilder();
            Document doc = dB.parse(new InputSource(isr));
            Element raiz = doc.getDocumentElement();
            System.out.println("Rai­z: " + doc.getDocumentElement().getNodeName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    
    

