package br.com.alura.bytebank

import br.com.alura.bytebank.interfaces.Authenticatable

class App {
  fun login(email: String, password: String, user: Authenticatable) {
    if (user.authenticate(email, password)) {
      println("Bem vindo, ao ByteBank");
      println();
    } else {
      println("Não foi possível entrar com o usuário");
      println();
    }
  }
}