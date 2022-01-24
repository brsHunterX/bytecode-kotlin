package br.com.alura.bytebank.models

import br.com.alura.bytebank.exceptions.InsufficientFundsException

class CheckingAccount(
  user: User,
  number: Int
) : Account(
  user = user,
  number = number
) {
  
  override fun withdraw(valor: Double) {
    val valueWithTax: Double = valor + 0.1;

    if (this.balance < valueWithTax) {
      throw InsufficientFundsException();
    }

    this.balance -= valueWithTax;
  }
}