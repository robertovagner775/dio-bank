package one.digitalinovation.testes

import one.digitalinovation.Cliente
import one.digitalinovation.clienteTipo

fun main() {
    val maria = Cliente(
        nome = "Maria das dores",
        cpf = "333-333-333-33",
        clienteTipo = clienteTipo.PF,
        senha = "3214"


    )
    println(maria)

    testAutenticacao().autentica(maria)

}
class testCliente {


}