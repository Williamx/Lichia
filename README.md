Lichia
Biblioteca Java para abstracao de dados apartir de uma String XML 

<h7>Importamos as classes JAVA</h7>
<code><pre>
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
</pre></code>

<h7>Instanciamos as classes</h7>

<code><pre>
public class Lichia {
         public static void main(String[] args) throws Exception{ 
          LichiaHTTP conectar = new LichiaHTTP();        
          conectar.setMetodo("GET");        
          conectar.setEndereco("http://url.com/xmlString");        
            try{       
                 LichiaXML lerxml = new LichiaXML();        
                 lerxml.setXMLTag("*");        
                 lerxml.setXMLString(conectar.Conecta());                
                       for (int i = 0; i < lerxml.LerXML().getLength(); i++) 
                                  {              
                                     System.out.println(
                              lerxml.LerXML().item(i).getNodeName()+"--->"+
                              lerxml.LerXML().item(i).getTextContent() 
                                      );                
                                   } 
                }
               catch(Exception e ) 
               {         
                 e.getMessage();               
                 }   
              }    
     }
</pre></code>
          
<h7>Entendendo o Codigo...</h7><BR>
<B>Instanciamos a classe HTTP responsavel pela conexao.</B>
<code><pre>
              LichiaHTTP conectar = new LichiaHTTP(); 
              conectar.setMetodo("GET");
              conectar.setEndereco("http://url.com/StringXML");
 </pre></code>
<h7>Entendendo o Codigo...</h7><BR>
<B>Instanciamos a classe HTTP responsavel pela Abstracao de dados da String oriunda da conexaO HTTP.</B>
<code><pre>
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
 </pre></code>
