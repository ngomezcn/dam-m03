package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.generales


data class Player(val nom: String, val cognom : String)   {


}

val join = mapOf(
    10 to Player("a", "a"),
    5 to Player("b", "b"),
    20 to Player("c", "c"),
    25 to Player("d", "d"),
    21 to Player("e", "e"),
    13 to Player("f", "f"))

fun getPlayerByID(id : Int) : Player? {
    return join[id]
}

fun main () {

    println(getPlayerByID(5))
}