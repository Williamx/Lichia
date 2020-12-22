/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lichia;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author SONY
 */
public class LichiaHTTP {
    
    //Metodo GET OU POST
    public String Metodo;
    public void setMetodo(String Metodo){this.Metodo = Metodo;}
    public String getMetodo(){return Metodo;}
    
    //Codigo de Status
    public String CodigoStatus;
    public void setCodigoStatus(String CodigoStatus){this.CodigoStatus = CodigoStatus;}
    public String getCodigoStatus(){return CodigoStatus;}  
    
    //Linha e separador
    String Linha;
    
    private void setLinha(String Linha){this.Linha = Linha;}
    private String getLinha(){return Linha;}  
    
     //Linha e separador
    String Endereco;
    public void setEndereco(String Endereco){this.Endereco = Endereco;}
    public String getEndereco(){return Endereco;}  
   
    public String Conecta()throws MalformedURLException,
            ProtocolException, IOException {
        
    URL url = new URL(getEndereco());
    HttpURLConnection Conexao = (HttpURLConnection) url.openConnection();
    Conexao.setRequestMethod(getMetodo());
    Conexao.getInputStream();
    
    StringBuilder Conteudo = new StringBuilder();
    BufferedReader Leitor = new BufferedReader(new InputStreamReader(Conexao.getInputStream()));
   
    
    try
    {
        while((Linha = Leitor.readLine()) != null)
        {
        Conteudo.append(Linha);
        //Conteudo.append(System.lineSeparator());
        }
    }
    finally
    {
      Conexao.disconnect();
    }
       return Conteudo.toString();
    }
}
