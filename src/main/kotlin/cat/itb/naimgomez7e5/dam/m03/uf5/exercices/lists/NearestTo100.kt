package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.lists

import java.lang.Math.abs

fun main() {
    val a = listOf(971, 6, 4878, 1354, 102, 302154, -2)
   val mesProper = a.sortedBy { abs(it-100) }.first()

    // 1,2,3,4,5,6,7,
}