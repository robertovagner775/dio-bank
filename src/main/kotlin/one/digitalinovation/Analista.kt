package one.digitalinovation

import java.math.BigDecimal

class Analista(nome: String, cpf: String, salario: Double) : Funcionario(nome, cpf, salario) {

    override fun calculoAuxilio(): Double = salario + (salario * 0.1)

    fun infoAnalista() = "$nome $cpf $salario"



}