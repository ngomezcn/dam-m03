package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.lists

fun main() {
    val a : List<Country> = listOf(
        Country("Peru", "Lima", 1285216, 24),
        Country("Australia", "Canberra", 7702466, 3),
        Country("Marroc", "Casablanca", 446650, 66),
        Country("Russia", "Moscou", 17098242, 8),
        Country("Islandia", "Reikiavik", 102800, 3))

    a.forEach() { it.name = it.name.uppercase() }
    println(a)
}