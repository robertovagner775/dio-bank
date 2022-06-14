package one.digitalinovation.testes

import one.digitalinovation.clienteTipo

fun main() {

    clienteTipo.values().forEach { elemento ->
        println("${elemento.name}  ${elemento.toString()}")
    }

    val pf = clienteTipo.PF
    println("${pf.name}  - ${pf.descricao}")


    val pj = clienteTipo.PJ
    println("${pj.name}  - ${pj.descricao}")
}