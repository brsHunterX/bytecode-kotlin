package br.com.alura.bytebank.models

import br.com.alura.bytebank.interfaces.Authenticatable

abstract class User(
  val name: String,
  val cpf: String,
  var address: Address = Address(),
  protected val email: String,
  protected val password: String,
) : Authenticatable {

  override fun authenticate(email: String, password: String): Boolean {
    if (this.email == email && this.password == password) {
      return true;
    }

    return false;
  }
}