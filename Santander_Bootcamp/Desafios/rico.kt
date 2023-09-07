fun main() {
  // Entrada de dados
  val saldoTotal = readLine() !!.toInt()
  val valorSaque = readLine() !!.toInt()

  //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
  //val saque:Int = 0;
  //val saldo:Int = 0;
  
  val saldo = saldoTotal - valorSaque;
  
  if (saldoTotal >= valorSaque){
    println("Saque realizado com sucesso. Novo saldo: $saldo ")
  }else{
    println("Saldo insuficiente. Saque nao realizado!")
  }

}