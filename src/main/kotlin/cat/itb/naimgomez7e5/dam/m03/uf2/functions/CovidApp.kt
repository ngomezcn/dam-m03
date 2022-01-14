package cat.itb.naimgomez7e5.dam.m03.uf2.functions

import java.util.*

fun readDailyCasesFromScanner(scanner: Scanner): List<Int>? {
    val result: MutableList<Int> = mutableListOf()
    var value = scanner.nextInt()
    while (value != -1) {
        result.add(value)
        value = scanner.nextInt()
    }
    return result
}

/**
 * Given a list of daily cases, returns the total number of cases (sum of cases)
 * @param dailyCases list of daily cases
 * @return total cases
 */
fun countTotalCases(dailyCases: List<Int>): Int {
    var total = 0
    for (cases in dailyCases) {
        total += cases
    }
    return total
}


/**
 * Given a list of daily cases, returns growth between each consecutive day.
 * @param dailyCases list of daily cases
 * @return list of growths
 */
fun growthRates(dailyCases: List<Int>): List<Double> {
    val growths: MutableList<Double> = ArrayList()
    for (i in 0 until dailyCases.lastIndex) {
        val growth = (dailyCases[i + 1].toDouble() - dailyCases[i]) / dailyCases[i]
        growths.add(growth)
    }
    return growths
}

fun averageGrowthRates(dailyCases: List<Int>): Float {
    var sum = 0;

    for (i in dailyCases.iterator())
    {
        sum += i;
    }

    return  (sum.toFloat()/dailyCases.size);
}

fun main() {
    val scan = Scanner(System.`in`);
    val arr = readDailyCasesFromScanner(scan) ?: return;

    println("Hi ha hagut " + countTotalCases(arr).toString() + " casos en total.")
    println("L'útlim creixement és de " + growthRates(arr)[growthRates(arr).size-1].toString())
    println("La mitjana de creixement és de " + averageGrowthRates(arr))
}