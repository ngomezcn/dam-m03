package cat.itb.naimgomez7e5.dam.m03.uf2.recursivity

import java.util.*

fun DotLineRecursive(n: Int) : String {

    if(n == 0)
        return ""
    return DotLineRecursive(n-1) + "."
}

fun main() {
    val a = Scanner(System.`in`).nextInt();
    print(DotLineRecursive(a))
}