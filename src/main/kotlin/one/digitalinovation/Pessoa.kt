package one.digitalinovation

class Pessoa {

      var nome:String = "Roberto"
      var cpf:String = "111.111.111-11"
      private set

      constructor()

      fun uniNomeCpf() = "$nome  $cpf"
}
fun main(){

    var roberto = Pessoa()


    println(roberto.uniNomeCpf())
    println(roberto.nome)
    println(roberto.cpf)

}