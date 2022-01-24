package br.com.alura.bytebank.models

abstract class Employee(
  name: String,
  cpf: String,
  address: Address,
  email: String,
  password: String,
  protected val wage: Double,
): User(
  name = name,
  cpf = cpf,
  address = address,
  email = email,
  password = password,
) {

  abstract val bonus: Double;
}