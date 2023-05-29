# Conversor de Números Romanos para Decimais
Este programa converte um número romano em seu equivalente decimal. Ele solicita ao usuário que insira um número romano e exibe o resultado convertido.<br>

## Utilização
* Insira um número romano válido quando solicitado pelo programa.
* O programa converterá o número romano em sua representação decimal e exibirá o resultado.
## Funcionalidade
* O programa solicita ao usuário que insira um número romano.
* Utiliza um mapa que associa os algarismos romanos aos seus equivalentes decimais.
* Itera por cada caractere do número romano fornecido.
* Para cada caractere, obtém o valor decimal correspondente no mapa.
* Verifica se há um próximo caractere e se o seu valor é maior que o atual.
* Se houver um próximo caractere com valor maior, subtrai o valor atual do próximo valor e adiciona ao resultado.
* Caso contrário, adiciona o valor atual ao resultado.
* Após percorrer todos os caracteres, exibe o resultado da conversão.
## Considerações adicionais
* O programa trata o caso de um número romano inválido, exibindo uma mensagem de erro apropriada.
* Certifique-se de inserir um número romano válido, seguindo as regras corretas para a formação dos algarismos romanos.
* O programa não tem suporte para números romanos maiores que 3999, uma vez que excedem a representação tradicional com os algarismos I, V, X, L, C, D e M.
#
Dev. Caio B. Zamana
