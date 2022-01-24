package br.com.alura.bytebank.models

import br.com.alura.bytebank.exceptions.InsufficientFundsException

class SavingAccount(
  user: User,
  number: Int
) : Account(
  user = user,
  number = number
) {

  override fun withdraw(value: Double) {
    if (this.balance < value) {
      throw InsufficientFundsException();
    }

    this.balance -= value;
  }
}