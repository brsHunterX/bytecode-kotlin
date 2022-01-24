package br.com.alura.bytebank.models

class Address(
  var number: Int = 0,
  var postalCode: String = "",
  var neighborhood: String = "",
  var city: String = "",
  var state: String = "",
  var street: String = "",
  var complement: String = "",
) {
  override fun toString(): String {
    return "$street, $number - $neighborhood, $city - $state, $postalCode - ${complement ?: null}"
  }
}