package br.com.alura.bytebank.interfaces

interface Authenticatable {
  fun authenticate(email: String, password: String): Boolean;
}