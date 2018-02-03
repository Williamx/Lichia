
package lichia;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import lichia.LichiaHTTP;
import java.util.List;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
/**
 *
 * @author SONY
 */
public class Lichia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        LichiaHTTP conectar = new LichiaHTTP();
        conectar.setMetodo("GET");
        conectar.setEndereco("http://url.com/stringxml");
        try{
        LichiaXML lerxml = new LichiaXML();
        lerxml.setXMLTag("*");
        lerxml.setXMLString(conectar.Conecta());
        
        for (int i = 0; i < lerxml.LerXML().getLength(); i++) {
              System.out.println(lerxml.LerXML().item(i).getNodeName()+"--->"+
                                 lerxml.LerXML().item(i).getTextContent()
              );
        
        }
        }catch(Exception e )
        {
         e.getMessage();
       
        }
    }
    
}
