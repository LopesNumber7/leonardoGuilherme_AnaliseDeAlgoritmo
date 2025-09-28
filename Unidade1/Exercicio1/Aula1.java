import java.util.Arrays;

    public class Aula1 {
    
        public static int buscaLinear(int[] vetor, int alvoBuscado) {
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] == alvoBuscado) {
                    return i;
                }
            }
            return -1;
        }
    
        public static int buscaBinaria(int[] vetor, int alvoBuscado) {
            return Arrays.binarySearch(vetor, alvoBuscado);
        }
    
        public static void main(String[] args) {
            int[] tamanhos = {10, 100, 1000, 10000, 100000, 1000000};
            for (int tamanho : tamanhos) {
                int[] vetor = new int[tamanho];
                for (int i = 0; i < tamanho; i++) {
                    vetor[i] = i * 2; 
                }
                int alvoBuscado = -1; 
    
                long inicioBuscaLinear = System.nanoTime();
                int posicaoBuscaLinear = buscaLinear(vetor, alvoBuscado);
                long tempoBuscaLinear = System.nanoTime() - inicioBuscaLinear;
    
                long inicioBuscaBinaria = System.nanoTime();
                int posicaoBuscaBinaria = buscaBinaria(vetor, alvoBuscado);
                long tempoBuscaBinaria = System.nanoTime() - inicioBuscaBinaria;
    
                System.out.printf("Tamanho %d -> Linear: índice %d, tempo %d ns | Binária: índice %d, tempo %d ns%n",
                        tamanho, posicaoBuscaLinear, tempoBuscaLinear, posicaoBuscaBinaria, tempoBuscaBinaria);
            }
        }
    }

