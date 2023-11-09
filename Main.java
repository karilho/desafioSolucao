import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("TESTE");
        Leitor leitorArquivo = new Leitor();

        List<String> perguntasLidasDoTXT = leitorArquivo.LerTXT();

        //   CONTADOR        ENQUANTO                   FAÇA ISSO
        for (int i = 0; i < perguntasLidasDoTXT.size();   i++  )
        {
            System.out.println(perguntasLidasDoTXT.get(i));
        }
        // PARA CADA PERGUNTA DO PERGUNTASLIDAS DO TXT
        for (String pergunta : perguntasLidasDoTXT){
            //FACA ISSO.
            System.out.println(pergunta);
        }
    }
}
