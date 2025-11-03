import java.util.*;

public class Exercicio1 {

    static class Item {
        int peso, valor;
        double dens; 
        Item(int p, int v){ peso=p; valor=v; dens = (double)v/p; }
        public String toString(){ return String.format("(%dkg, R$%d, dens=%.2f)", peso, valor, dens); }
    }

    static class Resultado {
        double valorTotal;
        List<String> usados = new ArrayList<>();
    }

    static Resultado resolver(List<Item> itens, double capacidade, Comparator<Item> estrategia){
        itens.sort(estrategia); 
        Resultado r = new Resultado();
        double cap = capacidade;

        for(Item it : itens){
            if(cap <= 0) break;
            if(it.peso <= cap){         
                cap -= it.peso;
                r.valorTotal += it.valor;
                r.usados.add(String.format("100%% de %s", it));
            }else{                        
                double frac = cap / it.peso;
                r.valorTotal += it.valor * frac;
                r.usados.add(String.format("%.1f%% de %s", frac*100, it));
                cap = 0;
            }
        }
        return r;
    }

    public static void main(String[] args) {

        double capacidade = 50;                
        int[] pesos   = {10, 20, 30};
        int[] valores = {60, 100, 120};

        List<Item> base = new ArrayList<>();
        for(int i=0;i<pesos.length;i++) base.add(new Item(pesos[i], valores[i]));

        Resultado rDens = resolver(new ArrayList<>(base), capacidade,
                (a,b) -> Double.compare(b.dens, a.dens));

        Resultado rValor = resolver(new ArrayList<>(base), capacidade,
                (a,b) -> Integer.compare(b.valor, a.valor));

        Resultado rPeso = resolver(new ArrayList<>(base), capacidade,
                (a,b) -> Integer.compare(a.peso, b.peso));

        System.out.println("Capacidade = " + capacidade + " kg");
        System.out.println("\nItens: " + base + "\n");

        System.out.println("[1] Estratégia: maior valor/peso (greedy clássico)");
        rDens.usados.forEach(s -> System.out.println("  - " + s));
        System.out.printf("=> Valor máximo obtido: R$ %.2f%n%n", rDens.valorTotal);

        System.out.println("[2] Estratégia: maior valor absoluto");
        rValor.usados.forEach(s -> System.out.println("  - " + s));
        System.out.printf("=> Valor obtido: R$ %.2f%n%n", rValor.valorTotal);

        System.out.println("[3] Estratégia: menor peso primeiro");
        rPeso.usados.forEach(s -> System.out.println("  - " + s));
        System.out.printf("=> Valor obtido: R$ %.2f%n", rPeso.valorTotal);
    }
}
