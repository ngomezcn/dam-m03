package cat.itb.naimgomez7e5.dam.m03.uf2.recursivity

fun factorial(n:Int): Int {

    if(n <= 0)
        return 1

    return n * factorial(n-1)
}

fun main() {
    println(factorial(5))
}