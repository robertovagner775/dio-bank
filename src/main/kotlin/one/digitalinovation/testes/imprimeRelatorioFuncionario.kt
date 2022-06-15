package one.digitalinovation.testes

import one.digitalinovation.Funcionario

class imprimeRelatorioFuncionario {

    companion object {

        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}