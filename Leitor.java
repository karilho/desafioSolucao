import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {

    // METODO 1 - > LER TEXT E PRINTAR NA TELA.
    public void LerTXT () throws IOException {
        BufferedReader leitorDePerguntas = new BufferedReader(new FileReader("formulario.txt"));
        System.out.println("DEU BOM, o arquivo foi encontrado e lido!");

        String linhaAserLida;

        while ((linhaAserLida = leitorDePerguntas.readLine()) != null ) {
            System.out.println(linhaAserLida);
        }
    }
    // METODO 2 -> LER CSV

    // METODO 3 -> LER IMAGEM



}
