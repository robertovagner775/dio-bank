package one.digitalinovation
import  one.digitalinovation.Pessoa
import java.math.BigDecimal

abstract class Funcionario(

    override val nome:String,
    override val cpf:String,
    val salario: Double


) : Pessoa(nome, cpf) {


    protected abstract fun calculoAuxilio(): Double
}