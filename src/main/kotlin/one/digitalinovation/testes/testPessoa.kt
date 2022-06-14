package one.digitalinovation.testes

import one.digitalinovation.Funcionario
import one.digitalinovation.Pessoa
import java.math.BigDecimal

fun main(){

    //instanciando
    val roberto = Pessoa(nome = "Roberto Vagner", cpf = "111-111-111-11")
    val luiz = Funcionario(nome = "Luiz Garcia", cpf = "222-222-222-22",cargo = "Programador" ,salario = BigDecimal.valueOf(1200.00))

    println(luiz.info())

}