package cat.itb.naimgomez7e5.dam.m03.uf1.hackerrank

fun factorial(n: Int): Int {

    val t =     n * factorial(n-1);
    println(t)
    return t;
}

fun main()
{
    println(factorial(11))
}