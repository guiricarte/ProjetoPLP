package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {
    public static void ler(String verifica_sexo, String verifica_sexo_parente) {
        File arq = new File("src/files/banco_de_dados.txt");
 
        try {
            //Indicamos o arquivo que será lido
            FileReader fileReader = new FileReader(arq);
 
            //Criamos o objeto bufferReader que nos
            // oferece o método de leitura readLine()
            BufferedReader bufferedReader = new BufferedReader(fileReader);
 
            //String que irá receber cada linha do arquivo
            String linha = "";
 
            //Fazemos um loop linha a linha no arquivo,
            // enquanto ele seja diferente de null.
            //O método readLine() devolve a linha na
            // posicao do loop para a variavel linha.
            while ( ( linha = bufferedReader.readLine() ) != null) {
                //Aqui imprimimos a linha
                if (linha.equals(verifica_sexo) || linha.equals(verifica_sexo_parente)){
                    System.out.println("Igual");
                }else {
                    System.out.println("Diferente");
                }
            }
 
            //liberamos o fluxo dos objetos ou fechamos o arquivo
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
        }
    }

}
