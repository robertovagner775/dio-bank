package one.digitalinovation

data  class Banco(
    val nome: String,
    val numero: Int
) {
    fun info() = "$nome $numero"
}
