
package cat.itb.naimgomez7e5.dam.m03.uf1.iterative

import kotlin.math.*
fun main() {
    val start = 7
    val end = 1252
    var tempValue1 = 1548
    var tempValue2 = -457
    var tempValue3 = 254
    for (i in start..end) {
        tempValue1 = tempValue1 - tempValue2
        tempValue2 += Math.sqrt(tempValue1.toDouble()).toInt()
        tempValue3 -= i
    }

    println("tempValue1 = $tempValue1")
    println("tempValue2 = $tempValue2")
    println("tempValue3 = $tempValue3")
}