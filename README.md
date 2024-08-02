
## Desafio: Dada uma matriz binária 2D de tamanho MxN preenchida com '0' (zero) e '1' (um), encontre o retângulo de maior área contendo apenas '1' e retorne o valor de sua área.

Exemplo:
 
Entrada:
[
  ['1','0','1','0','0'],
  ['1','0','1','1','1'],
  ['1','1','1','1','1'],
  ['1','0','0','1','0']
]
Saída: 6



### Sobre o desenvolvimento do algoritmo

#### O algoritmo foi desenvolvido pensando-se nos possíveis retângulos que podem ser formados com os dados de entrada da matriz MxN. Sendo assim, utilizaram-se laços de repetição (for loop) para percorrer a matriz e decidir se cada retângulo deve ou não entrar na lista de áreas de retângulos elegíveis (ou seja, se não possui nenhum zero). Depois de percorrer toda a matriz, a lista final é ordenada de forma descendente (do maior para menor) e é retornado como saída o valor do primeiro elemento dessa lista (maior área).
 



