package br.com.alura.bytebank.models

abstract class Account(
  val user: User,
  protected val number: Int,
  protected var balance: Double = 0.0,
) {

  companion object {
    var total: Int = 0
        private set;
  }

  init {
    total++;
  }

  abstract fun withdraw(valor: Double)

  fun extract() {
    println("Nome do títular: ${user.name}");
    println("CPF do títular: ${user.cpf}");
    println("Endereço: ${user.address}");
    println("Número: $number");
    println("Saldo: $balance");
    println();
  }

  fun deposit(value: Double): Boolean {
    if (value > 0.0) {
      this.balance += value;
      return true;
    }
    return false;
  }

  fun transfer(value: Double, receiver: Account) {
    withdraw(value);
    receiver.deposit(value);
  }
}