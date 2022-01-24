package br.com.alura.bytebank.models

class Manager (
  name: String,
  cpf: String,
  address: Address = Address(),
  email: String,
  password: String,
  wage: Double,
) : Employee(
  name = name,
  cpf = cpf,
  address = address,
  email = email,
  password = password,
  wage = wage,
) {

  override val bonus: Double get() = this.wage * 0.2;
}