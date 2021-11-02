package cat.itb.naimgomez7e5.dam.m03.uf1.iterative

import java.util.*

fun main()
{
    val scan = Scanner(System.`in`)
    val final = scan.nextInt()
    val salt = scan.nextInt()

    var i = 1
    while (i<= final)
    {
        println(i)
        i += salt
    }
}


