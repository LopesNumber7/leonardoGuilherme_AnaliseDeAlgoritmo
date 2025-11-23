QUESTÃO 25

A sequência de Fibonacci é uma sequência de números inteiros que começa em 1, a que se segue 1, e na qual cada elemento subsequente é a soma dos dois elementos anteriores. A função fib a seguir calcula o n-ésimo elemento da sequência de Fibonacci:

unsigned int fib (unsigned int n)

{

}

if (n < 2)

return 1;

return fib (n 2) + fib (n 1);

Considerando a implementação acima, avalie as afirmações a seguir.

1. A complexidade de tempo da função fib é exponencial no valor de n.

II. A complexidade de espaço da função fib é exponencial no valor de n.

III. É possível implementar uma versão iterativa

da função fib com complexidade de tempo linear no valor de ne complexidade de espaço constante.

É correto o que se afirma em

A)I, apenas.

B)II, apenas.

C)I e III, apenas.

D)II e III, apenas.

E)I, II e III.



alternativa correta: C