/**
 * Lichia Library XML
 * @author William
 * @version 0.0.1
 *
  */
package lichia;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 *
 * @author SONY
 */
public class LichiaXML {
        
    public String XMLString;
    public void setXMLString(String XMLString){this.XMLString = XMLString;}
    public String getXMLString(){return XMLString;}
    
    public String XMLTag;
    public void setXMLTag(String XMLTag){this.XMLTag = XMLTag;}
    public String getXMLTag(){return XMLTag;}
    /**
     * @param 
     * @return NodeList
     * @throws Exception 
     */
    public NodeList LerXML()throws Exception{
    
    DocumentBuilderFactory Fabrica = DocumentBuilderFactory.newInstance();
    DocumentBuilder Constroi = Fabrica.newDocumentBuilder();
    StringReader LerString = new StringReader(this.getXMLString());
    InputSource Fonte = new InputSource(LerString);
    Document CriaDocumento = Constroi.parse(Fonte);
    return CriaDocumento.getElementsByTagName(this.getXMLTag());    
    }
    
}
