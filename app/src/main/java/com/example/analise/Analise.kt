package com.example.analise

fun main(args: Array<String>) {
    val dadosProblema = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19,-1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
    )

    val idadeMedia =  dadosProblema.flatMap { it.value }
        .filter { it > 0}
        .average()

    val dadosIncompletos = dadosProblema.filter { it.value.any{ it < 0} }
        .map { it.key }

    val qteDadosIncompletos = dadosProblema.flatMap { it.value }
        .filter { it < 0 }
        .count()
}