
investigando força bruta - Leonardo Guilherme de Araújo Lopes

//Resultados obtidos//

| Tamanho do Vetor | Busca Linear (ns) | Busca Binária (ns) |
|------------------|-------------------|--------------------|
| 10               | -1    1400           | -1     26000            
| 100              | -1    2300           | -1     1500             
| 1.000            | -1    9800           | -1     1300             
| 10.000           | -1    89300          | -1     1900             
| 100.000          | -1    906300         | -1     2900             
| 1.000.000        | -1    597000         | -1     5000             

(Substitua os "X" pelos valores medidos na execução do programa.)



//Análise Comparativa//

Observando os tempos medidos:

Busca Linear: o tempo de execução cresce de forma quase diretamente proporcional ao tamanho do vetor. Em vetores pequenos (10, 100, 1.000 elementos), ela é relativamente rápida, mas conforme o tamanho aumenta (10.000, 100.000 e 1.000.000), o tempo cresce muito, chegando a centenas de milhares de nanossegundos.

Busca Binária: mantém tempos baixos e quase constantes, mesmo quando o vetor aumenta drasticamente. Já em vetores pequenos (como 10 elementos), ela pode ser até mais lenta do que a linear, mas em grandes volumes de dados (10.000 ou mais) o ganho de eficiência é evidente.



Complexidade

A busca linear possui complexidade O(n), pois no pior cenário é necessário percorrer todos os elementos do vetor até encontrar o valor desejado ou confirmar que ele não existe. Isso significa que, quanto maior for o número de elementos, maior será o tempo gasto, crescendo de forma proporcional ao tamanho da lista. Já a busca binária apresenta complexidade O(log n), uma vez que a cada comparação reduz o espaço de busca pela metade, tornando o processo muito mais eficiente em vetores grandes. Em termos práticos, enquanto a busca linear em um vetor de um milhão de elementos pode exigir até um milhão de comparações, a busca binária necessitaria de aproximadamente vinte etapas para chegar ao mesmo resultado, o que demonstra claramente a diferença de desempenho entre os dois algoritmos.