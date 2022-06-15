package one.digitalinovation



import java.math.BigDecimal

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
    ) : Funcionario(nome, cpf, salario) , Logavel
{

    override fun calculoAuxilio(): Double = salario * 0.5

    override fun login(): Boolean = "senha123" == senha

    fun infoAnalista() = "$nome $cpf $salario"



}