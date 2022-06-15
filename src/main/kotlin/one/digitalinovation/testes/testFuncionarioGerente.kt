package one.digitalinovation.testes

import one.digitalinovation.Analista
import one.digitalinovation.Gerente

fun main(){

    //instanciando
    val Ricardo = Gerente(nome = "Ricardo Lucas", cpf = "222-222-222-22" ,salario = 1220.00, senha = "teste")

    println(imprimeRelatorioFuncionario.imprime(Ricardo))

    testAutenticacao().autentica(Ricardo)

}