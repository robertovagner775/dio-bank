package one.digitalinovation.testes

import one.digitalinovation.Analista
import one.digitalinovation.Funcionario
import one.digitalinovation.Pessoa
import java.math.BigDecimal

fun main(){

    //instanciando
    val luiz = Analista(nome = "Luiz Garcia", cpf = "222-222-222-22" ,salario = 1220.00)

    println(imprimeRelatorio(luiz))

}


