package br.com.alura.bytebank.models

class Director (
  name: String,
  cpf: String,
  address: Address = Address(),
  email: String,
  password: String,
  wage: Double,
  private var plr: Double,
) : Employee(
  name = name,
  cpf = cpf,
  address = address,
  email = email,
  password = password,
  wage = wage,
) {

  override val bonus: Double get() = this.wage + this.plr * 0.3
}