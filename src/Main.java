public class Main {
    public static void main(String[] args) {

        int[] vetor1 = {4, 2, 8, 7, 1, 5, 3, 6, -10, 6};
        // 0 1 2 5 8 7
        int[] vetor2 = {4, 2, 8, 7, 1, 5, 3, 6, -10, 6};
        int[] vetor3 = {4, 2, 8, 7, 1, 5, 3, 6, -10, 6};
        int[] vetor4 = {4, 2, 8, 7, 1, 5, 3, 6, -10, 6};
        int tamVet1 = getTamanho(vetor1);
        int tamVet2 = getTamanho(vetor2);
        int tamVet3 = getTamanho(vetor3);
        int tamVet4 = getTamanho(vetor4);

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.ordenar(vetor4);
        System.out.println("Vetor ordenado com bubbleSort");
        for (int i = 0; i < tamVet4; i++) {
            System.out.print(vetor4[i] + " ");
        }
        System.out.println();

        mergeSort mergeSort = new mergeSort();
        vetor3 = mergeSort.ordenar(vetor3);
        System.out.println("Vetor ordenado com mergeSort");
        for (int i = 0; i < tamVet3; i++) {
            System.out.print(vetor3[i] + " ");
        }
        System.out.println();

        InsertionSort insertionSort = new InsertionSort();
        ShellSort shellSort = new ShellSort();

        shellSort.ordenar(vetor2);
        System.out.println("Vetor ordenado com shellSort");
        for (int i = 0; i < tamVet2; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println("trocas shell: " + shellSort.getTrocas());

        insertionSort.ordenar(vetor1);
        System.out.println("Vetor ordenado com insertionSort");
        for (int i = 0; i < tamVet1; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println("trocas insertion: " +insertionSort.getTrocas());
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
