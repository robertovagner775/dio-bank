package one.digitalinovation
import  one.digitalinovation.Pessoa
import java.math.BigDecimal

class Funcionario(

    override val nome:String,
    override val cpf:String,
    val salario: BigDecimal,
    val cargo: String

) : Pessoa(nome, cpf) {

    fun info() = "Nome: $nome cargo: $cargo salario: $salario cpf: $cpf"
}