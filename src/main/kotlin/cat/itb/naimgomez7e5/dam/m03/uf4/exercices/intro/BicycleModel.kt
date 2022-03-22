package cat.itb.naimgomez7e5.dam.m03.uf4.exercices.intro

data class BicycleModel(val name: String, val gears: Int, val brand: BycicleBrand) {
}

data class BycicleBrand(val name: String, val country: String) {
}

fun main() {
    val specialized = BycicleBrand(name="Specialized", country="USA")

    val jett = BicycleModel(name="Jett 24", gears=5, brand=specialized);
    val hotwalk = BicycleModel(name="Hotwalk", gears=7, brand=specialized);

    println(jett)
    println(hotwalk)
}
