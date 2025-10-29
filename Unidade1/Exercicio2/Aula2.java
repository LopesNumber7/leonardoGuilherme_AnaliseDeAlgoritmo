package Unidade1.Exercicio2;

public class Aula2 {
    public static void main(String[] args) {

        int tamanho = 10_000_000;
        int[] vetor = new int[tamanho];
        int numeroProcurado = 9999999;
        boolean encontrado = false;

        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i;
        }

        long inicio = System.currentTimeMillis();

        
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroProcurado) {
                encontrado = true;
                break;
            }
        }

        long fim = System.currentTimeMillis();

        if (encontrado) {
            System.out.println("Número encontrado!");
        } else {
            System.out.println("Número não encontrado!");
        }

        System.out.println("Tempo de busca: " + (fim - inicio) + " ms");
    }
}

