/**
 * Este programa converte um número romano em um número decimal.
 * Ele solicita ao usuário que insira um número romano e exibe o resultado da conversão.
 *
 * @author Caio Zamana
 * @version 1.0
 */

fun main() {
    // Solicita ao usuário que insira um número romano.
    val numeroRomano: String? = readLine()

    // Mapa com valores correspondentes aos algarismos romanos e seus equivalentes decimais.
    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    // Variável que armazenará o resultado da conversão.
    var resultado = 0

    // Loop pelos algarismos romanos.
    for (i in numeroRomano!!.indices) {
        // Valor correspondente ao algarismo romano atual.
        val atual = numerosRomanos.getValue(numeroRomano[i])

        // Valor correspondente ao algarismo romano seguinte, caso exista.
        val proximo = when (i + 1) {
            numeroRomano.length -> 0 // Se não houver próximo, atribui 0.
            else -> numerosRomanos.getValue(numeroRomano[i + 1])
        }

        // Adiciona ou subtrai o valor correspondente ao algarismo romano atual,
        // dependendo se o próximo valor é maior ou menor.
        resultado += if (atual < proximo) -atual else atual
    }

    // Imprime o resultado da conversão.
    print(resultado)
}
