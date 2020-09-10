# sortArrayTypes
Complexidade dos algoritmos de ordenação

## Checklist
| Sort Type | DONE? |
| ------ | ----- |
| InsertionSort | YES |
| MergeSort | ERRO |
| HeapSort | YES |
| QuickSort | YES |

## Relatório
### InsertionSort
| Caso | Tempo (milissegundos) |
| ------ | ----- |
| Melhor | 11 O(n) | -> Números crescentes
| Médio | 192 O(n²) | -> Números aleatórios
| Pior | 172 O(n²) | -> Números decrescentes

### MergeSort
| Caso | Tempo (milissegundos) |
| ------ | ----- |
| Melhor | ?? n log² n | -> ??
| Médio | ?? n log² n | -> ??
| Pior | ?? n log² n| -> ??

### HeapSort
| Caso | Tempo (milissegundos) |
| ------ | ----- |
| Melhor | 14 O(n lg n)| -> Números decrescentes
| Médio | 27 O(n lg n) | -> Números aleatórios
| Pior | 33 O(n lg n) | -> Números crescentes

### QuickSort
| Caso | Tempo (milissegundos) |
| ------ | ----- |
| Melhor | 223 O(n lg n)| -> Números crescentes
| Médio | 22 (n lg n) | -> Números aleatórios
| Pior | 347 O(n²) | -> Números decrescentes

## Conclusão
O insertion sort, por mais que seja simples, pode exigir demais do computador. O caso médio é a situação que acontece mais frequentemente e, no caso do insertion sort, poderia ser um problema. É bom ser usado somente quando o vetor estiver "quase" ordenado.
O heap sort compete com o quick sort, mas está em vantagem por o quick sort possuir seu pior caso em O(n²), o que pode prejudicar códigos que trabalhem com muitos dados. Pelo que vi, ambos (quick e heap) perdem para o merge sort em questão de estabilidade. 
Umas das desvantagens do merge sort é o uso de recursão e, devido ao mesmo fazer uma várias cópias de vetores, o excesso de memória que é usado.
Não consegui reproduzir o merge sort em java...