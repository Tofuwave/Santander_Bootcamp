fun main() {
    val saldoAtual = readLine()!!.toFloat()
    val valorDeposito = readLine()!!.toFloat()
    val valorRetirada = readLine()!!.toFloat()
    val novoSaldo = saldoAtual + valorDeposito - valorRetirada
    //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
    
    println("Saldo atualizado na conta: $novoSaldo")
  //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).

}