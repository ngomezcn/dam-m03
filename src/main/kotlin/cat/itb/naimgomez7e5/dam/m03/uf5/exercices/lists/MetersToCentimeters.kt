package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.lists

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    var list = listOf(43,3,57,4,13,56,123,61)

    val xd = list.map() { it * 1000 }

    println(xd)

}