import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class escrever {
    public static void main(String[] args) {
        Random random = new Random();
        int valor;
        int cod;
        int counter = 0;
        while (counter < 10000) {
            valor = random.nextInt(999) + 1;
            String linha = valor + "";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("./src/10000dados.txt", true))) {
                bw.write(linha);
                bw.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            counter++;
        }
    }
}
