package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.tads

fun main() {
    val a = listOf("Mar",
            "Mar",
            "Ot",
            "Iu",
            "Ona",
            "Iu",
            "Mar",
            "Mar")


    val b = a.groupingBy { it }.eachCount()
    println(b)
}