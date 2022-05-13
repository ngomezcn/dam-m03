package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.lists

data class Country(var name: String, val capital: String, val superficie: Int, val densitat: Int) {

}

fun main() {

    val a : List<Country> = listOf(
        Country("Peru", "Lima", 1285216, 24),
        Country("Australia", "Canberra", 7702466, 3),
        Country("Marroc", "Casablanca", 446650, 66),
        Country("Russia", "Moscou", 17098242, 8),
        Country("Islandia", "Reikiavik", 102800, 3))


    val b : List<Country> = a.filter { it.densitat > 5 }.filter { it.superficie > 1000 }.sortedBy { it.capital }

    for (c in b) {
        println(c.name)
    }
}