/**
 * Este programa converte um numero romano em um numero decimal.
 * Ele solicita ao usuario que insira um numero romano e exibe o resultado da conversao.
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
    if (numeroRomano != null) {
        var i = 0
        while (i < numeroRomano.length) {
            val atual = numerosRomanos[numeroRomano[i]]
            if (atual != null) {
                if (i + 1 < numeroRomano.length) {
                    val proximo = numerosRomanos[numeroRomano[i + 1]]
                    if (proximo != null && proximo > atual) {
                        resultado += proximo - atual
                        i += 2
                        continue
                    }
                }
                resultado += atual
                i++
            } else {
                println("Número romano inválido.")
                return
            }
        }
        // Exibe o resultado da conversão.
        println("$resultado")
    } else {
        println("Número romano inválido.")
    }
}