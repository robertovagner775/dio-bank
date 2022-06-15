package one.digitalinovation

class Cliente(

    override val nome: String,
    override val cpf: String,
    val clienteTipo: clienteTipo,
    val senha:String


) : Pessoa(nome , cpf), Logavel {

    override fun login(): Boolean = "senhaCliente" == senha

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Tipo de Cliente: $clienteTipo
        
    """.trimIndent()




}