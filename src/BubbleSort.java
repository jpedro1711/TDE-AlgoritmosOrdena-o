public class BubbleSort {
    private Integer trocas = 0;
    private Integer iteracoes = 0;;
    public void ordenar(int[] vetor) {
        int tamanho = getTamanho(vetor);
        for (int i = 0; i < tamanho; i++) {
            iteracoes++;
            int menor;
            int posMenor;
            for (int j = i + 1; j < tamanho; j++) {
                iteracoes++;
                if (vetor[i] > vetor[j]) {
                    menor = vetor[j];
                    posMenor = j;
                    vetor[posMenor] = vetor[i];
                    vetor[i] = menor;
                    trocas++;
                }
            }
        }
    }

    public int getTamanho(int[] vetor) {
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

    public Integer getTrocas() {
        return trocas;
    }

    public Integer getIteracoes() {
        return iteracoes;
    }
}
