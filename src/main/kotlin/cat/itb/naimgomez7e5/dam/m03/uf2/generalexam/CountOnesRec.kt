package cat.itb.naimgomez7e5.dam.m03.uf2.generalexam

import java.util.*


fun countOnesRec(n: Int): Int {

    val digit = n % 10
    val target = 1;

    if (n == 0) {
        return 0
    }

    return if(digit == target)
    {
        1 + countOnesRec(n/10)
    } else {
        countOnesRec(n/10)
    }
}

fun main() {
    val scanner = Scanner(System.`in`);
    println(countOnesRec(scanner.nextLine().toInt()))
}