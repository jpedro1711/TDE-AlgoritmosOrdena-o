public class mergeSort {
    private static Integer iteracoes = 0;
    private static Integer trocas = 0;
    public int[] ordenar(int[] vetor) {
        int tamanho = getTamanho(vetor);
        if (tamanho == 1) {
            return vetor;
        }

        int metade = tamanho/2;
        int[] primeiroVetor = new int[metade];

        for (int i = 0; i < metade; i++) {
            iteracoes++;
            primeiroVetor[i] = vetor[i];
        }

        int[] segundoVetor = new int[tamanho - metade];
        int indice = 0;
        for (int j = metade; j < tamanho; j++) {
            iteracoes++;
            segundoVetor[indice] = vetor[j];
            indice++;
        }

        primeiroVetor = ordenar(primeiroVetor);
        segundoVetor = ordenar(segundoVetor);

        int tam1 = getTamanho(primeiroVetor);
        int tam2 = getTamanho(segundoVetor);
        int[] juncao = new int[tam2 + tam1];

        int indexVetor1 = 0;
        int indexVetor2 = 0;
        int indiceNovoVetor = 0;
        while (indexVetor1 < tam1 && indexVetor2 < tam2) {
            iteracoes++;
            if (primeiroVetor[indexVetor1] < segundoVetor[indexVetor2]) {
                juncao[indiceNovoVetor] = primeiroVetor[indexVetor1];
                indexVetor1++;
                indiceNovoVetor++;
                trocas++;
            }
            else if (segundoVetor[indexVetor2] <= primeiroVetor[indexVetor1]) {
                juncao[indiceNovoVetor] = segundoVetor[indexVetor2];
                indexVetor2++;
                indiceNovoVetor++;
                trocas++;
            }
        }
        if (indexVetor1 < tam1) {
            for (int i = indexVetor1; i < tam1; i++) {
                iteracoes++;
                trocas++;
                juncao[indiceNovoVetor] = primeiroVetor[i];
                indexVetor1++;
                indiceNovoVetor++;
            }
        }
        if (indexVetor2 < tam2) {
            for (int i = indexVetor2; i < tam2; i++) {
                iteracoes++;
                trocas++;
                juncao[indiceNovoVetor] = segundoVetor[i];
                indexVetor2++;
                indiceNovoVetor++;
            }
        }
        for (int i = 0; i < tam1 + tam2; i++) {
            iteracoes++;
            trocas++;
            vetor[i] = juncao[i];
        }
        return vetor;
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

    public static Integer getIteracoes() {
        return iteracoes;
    }

    public static Integer getTrocas() {
        return trocas;
    }
}
