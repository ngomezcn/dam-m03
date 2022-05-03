package cat.itb.naimgomez7e5.dam.m03.uf4.exercices.motto

open class Team(val name: String, val motto: String) {
    open fun shoutMotto() {
        println(motto)
    }
}

class BasketballTeam(name: String, motto: String): Team(name, motto) {
    override fun shoutMotto() {
        println("1,2,3 $motto")
    }
}

class VolleyballTeam(name: String, motto: String, val color: String): Team(name, motto) {
    override fun shoutMotto() {
        println("$motto $color")
    }
}

class GolfTeam(name: String, motto: String, val personName: String): Team(name, motto) {
    override fun shoutMotto() {
        println("$personName $motto")
    }
}

