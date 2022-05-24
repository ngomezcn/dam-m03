package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.generales

import kotlin.math.min

class Mine {

}
fun countMatches(string: String, pattern: String): Int {
    return string.split(pattern)
        .dropLastWhile { it.isEmpty() }
        .toTypedArray().size - 1
}

abstract class Diamond(open val counter : Int = 0) {
}

class Black(override var counter: Int = 0) : Diamond(counter) {
    val match = listOf(Match("[(][)]", 1), Match("<>[(]<>[)]<[(]<[)]", 1))
}

class White(override var counter: Int = 0) : Diamond(counter) {
    val match = listOf(Match("<>", 1), Match("«»", 2), Match("<>«»<[(]<[)]", 3), Match("<>[(]<>[)]<[(]<[)]", 3))
}

class Match(val reg : String, val score : Int) {

}

fun main() {
    var mine = "<>(<>)<(<)"

    val whiteDiamond = White();
    val blackDiamond = Black()

    whiteDiamond.counter

    for (i in whiteDiamond.match) {
        val ocurr = i.reg.toRegex().findAll(mine).count()
        if(ocurr > 0) {
            repeat(ocurr) {
                whiteDiamond.counter += i.score
            }
        }
        mine = mine.replace(i.reg, "")
    }
    for (i in blackDiamond.match) {
        val ocurr = i.reg.toRegex().findAll(mine).count()
        if(ocurr > 0) {
            repeat(ocurr) {
                blackDiamond.counter += i.score

            }
        }
        mine = mine.replace("()", "")
    }

    println("White: ${whiteDiamond.counter}")
    println("Black: ${blackDiamond.counter}")
}