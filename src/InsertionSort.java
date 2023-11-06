public class InsertionSort {
    private Integer trocas = 0;
    private Integer iteracoes = 0;
    public void ordenar(int[] vetor) {
        int tamanho = getTamanho(vetor);
        for (int i = 0; i < tamanho; i++) {
            iteracoes++;
            if (i + 1 == tamanho){
                return;
            }
            if (i + 1 <= tamanho) {
                if (vetor[i] > vetor[i + 1]) {
                    int posMaior = i;
                    int valorMaior = vetor[i];
                    int posMenor = i + 1;
                    int valorMenor = vetor[i + 1];
                    vetor[posMaior] = valorMenor;
                    vetor[posMenor] = valorMaior;
                    trocas++;
                    for (int j = i - 1; j >= 0; j--) {
                        iteracoes++;
                        if (vetor[j] > vetor[i]) {
                            valorMaior = vetor[j];
                            posMaior = j;
                            valorMenor = vetor[i];
                            posMenor = i;
                            vetor[posMaior] = valorMenor;
                            vetor[posMenor] = valorMaior;
                            i--;
                            trocas++;
                        }
                    }
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
