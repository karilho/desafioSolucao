import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("TESTE");
        Leitor perguntasLidas = new Leitor();
        perguntasLidas.LerTXT();
    }
}
