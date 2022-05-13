package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.tads

import java.util.*

class Empleat(val name: String) {

}

fun main() {
    val scanner = Scanner(System.`in`)

    val a = mutableMapOf<String, Empleat>(
        "87654321T" to Empleat("Mar"),
        "12345678Z" to Empleat("Puig"),
        "87654311T" to Empleat("Pi"),
        "12345678Z" to Empleat("Ot"))

    println(a[scanner.nextLine()]?.name)
}