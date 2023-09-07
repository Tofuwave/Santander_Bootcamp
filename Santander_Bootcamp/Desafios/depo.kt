import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val valor = scanner.nextDouble()

    if (valor > 0) {
        val saldoFormatado = String.format("%.2f", valor)
        println("Deposito realizado com sucesso!")
        println("Saldo atual: R$ $saldoFormatado")
    } else if (valor == 0.0) {
        println("Encerrando o programa...")
    } else {
        println("Valor invalido! Digite um valor maior que zero.")
    }

    scanner.close()
}
