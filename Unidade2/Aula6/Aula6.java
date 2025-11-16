package Aula6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;


public class Aula6 {
    public static void main(String[] args) {
        System.out.println("Diretório atual: " + new File(".").getAbsolutePath());
        Map<String, Integer> contagem = new HashMap<>();

        String arquivo = "C:\\Users\\leona\\Documents\\GitHub\\leonardoGuilherme_AnaliseDeAlgoritmo\\Unidade2\\Aula6\\MOCK_DATA.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            while ((linha = reader.readLine()) != null) {
                if (linha.trim().isEmpty()) {
                    continue;
                }

                String[] nomes = linha.split(",");

                for (String nome : nomes) {
                    if (nome == null) continue;

                    nome = nome.trim();
                    if (nome.isEmpty()) continue;


                    contagem.put(nome, contagem.getOrDefault(nome, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
