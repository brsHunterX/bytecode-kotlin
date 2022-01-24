package br.com.alura.bytebank.models

class Client(
  name: String,
  cpf: String,
  address: Address,
  email: String,
  password: String,
): User(
  name = name,
  cpf = cpf,
  address = address,
  email = email,
  password = password,
) {
}