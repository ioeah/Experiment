package abstractFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.*;
import java.io.File;

/**
 * @author ioeah
 * @version 1.0
 * @date 2023/3/2 11:00
 */
public class XMLUtil {

    public static Object getBean() {

        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            File file = new File("D:\\Study\\Design Pattern\\Experiment\\target\\classes\\config.xml");
            doc = builder.parse(file);

            NodeList nl = doc.getElementsByTagName("abstractFactory");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            Class<?> c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

}
