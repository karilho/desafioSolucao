import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Leitor {

    // METODO 1 - > LER TEXT E PRINTAR NA TELA.
    public List<String> LerTXT() {

        List<String> listaDePerguntas = new ArrayList<>();

        // Tente este bloco de código
        try {
            BufferedReader leitorDePerguntas = new BufferedReader(new FileReader("formulario.txt"));
            System.out.println("DEU BOM, o arquivo foi encontrado e lido!");

            String linhaAserLida;

            while ((linhaAserLida = leitorDePerguntas.readLine()) != null) {
                // Adicionada cada pergunta por vez no loop ao array listaDePerguntas
                listaDePerguntas.add(linhaAserLida);

            }
        } catch (Exception e) {
            // SE DER MERDA FAÇA ISSO
            e.printStackTrace();
        }

        return listaDePerguntas;
    }
}