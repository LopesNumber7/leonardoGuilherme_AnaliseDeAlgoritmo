package Unidade1.Exercicio3;

public class Aula3 {
    public static void main(String[] args) {

        int[] cedulasDisponiveis = {100, 50, 20, 10, 5, 2, 1}; 
        int trocoPara = 186;
        int[] cedulasUsadas = new int[cedulasDisponiveis.length];

        for (int i = 0; i < cedulasDisponiveis.length; i++) {
            cedulasUsadas[i] = trocoPara / cedulasDisponiveis[i];
            trocoPara = trocoPara % cedulasDisponiveis[i];
        }

        System.out.println("Cédulas usadas:");
        for (int i = 0; i < cedulasDisponiveis.length; i++) {
            if (cedulasUsadas[i] > 0) {
                System.out.println("R$ " + cedulasDisponiveis[i] + ",00 → " + cedulasUsadas[i] + " cédula(s)");
            }
        }
    }
}
