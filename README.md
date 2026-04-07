📌 README – Busca Binária com Ordenação em Java
📖 Descrição

Este programa em Java permite ao usuário:

Inserir um vetor de números inteiros desordenado
Visualizar o vetor antes da ordenação
Ordenar o vetor utilizando Arrays.sort()
Visualizar o vetor ordenado
Realizar buscas utilizando o algoritmo de busca binária
Repetir buscas até decidir sair

⚙️ Funcionamento do Programa

🔹 Entrada de dados
O usuário informa a quantidade de elementos do vetor
Em seguida, digita os valores inteiros
🔹 Exibição inicial
O vetor é exibido antes da ordenação
🔹 Ordenação
O vetor é ordenado usando:
Arrays.sort(vetor);
🔹 Exibição após ordenação
O vetor já ordenado é exibido na tela

🔍 Busca Binária
O usuário informa um valor que deseja buscar
O programa utiliza:
Arrays.binarySearch(vetor, valor);

📌 Resultado:
Se o número for encontrado:
Mostra a posição (índice)
Se não for encontrado:
Informa que o elemento não existe no vetor
🔁 Repetição da busca

Após cada busca, o programa pergunta:

Deseja buscar novamente? 
1 - Sim
2 - Não
Se escolher 1, o programa permite nova busca
Se escolher 2, o programa encerra
🧠 Observação Importante

A busca binária só funciona corretamente em vetores ordenados, por isso o uso do Arrays.sort() antes das buscas.

▶️ Como executar
Compile o programa:
javac BuscaBinariaExemplo.java
Execute:
java BuscaBinariaExemplo
💡 Exemplo de uso

Entrada:

Quantidade: 5
Valores: 10 3 7 1 9

Saída:

[10, 3, 7, 1, 9]
[1, 3, 7, 9, 10]

Busca:

Digite o número: 7
Elemento encontrado na posição: 2
