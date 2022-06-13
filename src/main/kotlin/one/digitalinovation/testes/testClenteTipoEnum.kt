package one.digitalinovation.testes

import one.digitalinovation.clienteTipo

fun main() {

    clienteTipo.values().forEach { elemento ->
        println("${elemento.name}  ${elemento.toString()}")
    }
}