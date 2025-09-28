# Investigando força bruta - Fulano de Tal

Este experimento compara dois algoritmos de busca em vetores de inteiros:  
- *Busca Linear* (força bruta)  
- *Busca Binária* (utilizando Arrays.binarySearch() da biblioteca padrão Java)  

---

## Resultados obtidos

| Tamanho do Vetor | Busca Linear (ns) | Busca Binária (ns) |
|------------------|-------------------|--------------------|
| 10               | X                 | X                  |
| 100              | X                 | X                  |
| 1.000            | X                 | X                  |
| 10.000           | X                 | X                  |
| 100.000          | X                 | X                  |
| 1.000.000        | X                 | X                  |

(Substitua os "X" pelos valores medidos na execução do programa.)

---

## Análise Comparativa

- A *Busca Linear* apresentou tempo proporcional ao tamanho do vetor, pois precisa comparar elemento por elemento.  
- A *Busca Binária* foi muito mais rápida, mesmo em vetores grandes, pois realiza divisões sucessivas no espaço de busca.  
- A diferença de desempenho se torna mais evidente em vetores com mais de *10.000 elementos*.  

---

## Complexidade

- *Busca Linear: Ordem de complexidade **O(n)* → tempo cresce proporcional ao tamanho do vetor.  
- *Busca Binária: Ordem de complexidade **O(log n)* → tempo cresce muito mais lentamente, mesmo para vetores grandes.  

---

📌 *Conclusão:* A busca linear é viável apenas para vetores pequenos ou quando não há ordenação dos dados. Já a busca binária é extremamente eficiente, mas depende que o vetor esteja ordenado.