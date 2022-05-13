package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.tads

import java.util.*

class Car(val model: String, val color: String) {

}

fun main() {
    val scanner = Scanner(System.`in`)

    val a = mutableMapOf<String, Car>(
        "2322UUY" to Car("Opel", "blue"),
        "4738URP" to Car("Seat", "green"),
        "3798YHT" to Car("Opel", "red"))

    println(a[scanner.nextLine()]?.model)
}