/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

/**
 *
 * @author MQS
 */
public class TesteXml {
        public static void main(String[] args) throws Exception{
            DocumentBuilderFactory doc = DocumentBuilderFactory.newInstance();
            DocumentBuilder parserDoc = doc.newDocumentBuilder();
            Document docXml = parserDoc.parse("prolog.xml");
            Element listaLinha, listaFatos, predicadoXml;
            NodeList listaTagLinha, listaPredicadoXml;
            NamedNodeMap predicados;
            int tamanho;
            
            listaLinha = docXml.getDocumentElement();
            
            try{
                    
                 listaTagLinha = listaLinha.getElementsByTagName("parente");
                 tamanho = listaTagLinha.getLength();
                 for(int i = 0; i < tamanho; i++){
                     predicadoXml = (Element) listaTagLinha.item(i);
                     listaPredicadoXml = predicadoXml.getElementsByTagName("relacao");
                     predicados = listaPredicadoXml.item(0).getAttributes();
                     System.out.println("Pessoa: "+predicados.item(0).getNodeValue());
                     predicados = listaPredicadoXml.item(1).getAttributes();
                     System.out.println("Irmao: "+predicados.item(0).getNodeValue());
                 }
            }catch(Exception e){
                
            }
           
            
            
        }
    
}
