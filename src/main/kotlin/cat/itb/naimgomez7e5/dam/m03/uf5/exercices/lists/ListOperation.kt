package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.lists

fun main() {
    val list = listOf(43, 65, 2, 75, 1, 54, 73, 23, 33, 65, 25, 73, 425432, 65, 34, 2);

    var xd = list.sortedByDescending { it }
    println(xd)

}