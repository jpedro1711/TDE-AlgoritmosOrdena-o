import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class lerDados {
    public static void main(String[] args) {
        File file = new File("./src/50dados.txt");
        ShellSort shellSort = new ShellSort();
        InsertionSort insertionSort = new InsertionSort();
        mergeSort mergeSort = new mergeSort();
        BubbleSort bubbleSort = new BubbleSort();
        int[] dados= new int[50];
        int tam = getTamanho(dados);
        int i = 0;
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                if (linha != "") {
                    String num = linha;
                    dados[i] = Integer.parseInt(num);
                    i++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("tamanho: " + tam);
        long tempoInicial = System.currentTimeMillis();
        dados = mergeSort.ordenar(dados);
        long tempoFinal = System.currentTimeMillis() - tempoInicial;
        System.out.println("tempo de execução " + tempoFinal + " ms");
        System.out.println("iterações: " + mergeSort.getIteracoes());
        System.out.println("trocas: " + mergeSort.getTrocas());
        for (int j = 0; j < tam; j++) {
            System.out.print(dados[j] + " ");
        }
    }

    public static int getTamanho(int[] vetor) {
        int contador = 0;
        while (true) {
            try {
                if (vetor[contador] > 0 || vetor[contador] <= 0) {
                    contador++;
                } else {
                    return contador;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return contador;
            }
        }
    }
}
