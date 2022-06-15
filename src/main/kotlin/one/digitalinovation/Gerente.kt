package one.digitalinovation



import java.math.BigDecimal

class Gerente(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario) {

    override fun calculoAuxilio(): Double = salario + (salario * 0.5)

    fun infoAnalista() = "$nome $cpf $salario"



}