public class ShellSort {
    private Integer trocas = 0;
    private Integer iteracoes = 0;
    public void ordenar(int[] vetor) {
        int tamanho = getTamanho(vetor);
        int intervalo = tamanho / 2;
        while (intervalo > 0) {
            for (int i = 0; i < tamanho; i += intervalo) {
                iteracoes++;
                if (i + intervalo < tamanho) {
                    if (vetor[i] > vetor[i + intervalo]) {
                        int posMaior = i;
                        int valorMaior = vetor[i];
                        int posMenor = i + intervalo;
                        int valorMenor = vetor[i + intervalo];
                        vetor[posMaior] = valorMenor;
                        vetor[posMenor] = valorMaior;
                        trocas++;
                        for (int j = posMenor; j >= 0; j -= intervalo) {
                            iteracoes++;
                            if (j> 0 &&vetor[j - intervalo] > vetor[j] ) {
                                valorMaior = vetor[j - intervalo];
                                valorMenor = vetor[j];
                                posMaior = j - intervalo;
                                posMenor = j;
                                vetor[posMaior] = valorMenor;
                                vetor[posMenor] = valorMaior;
                                trocas++;
                            }
                        }
                    }
                }
            }
            intervalo = intervalo / 2;
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
