package cat.itb.naimgomez7e5.dam.m03.uf1.seleccio

import java.lang.System.`in`
import java.util.*

fun main()
{
    val scan = Scanner(System.`in`)
    //var a = scan.nextInt()
    //var b = scan.nextInt()
    var a = 61
    var b = 24

    var r = 0;

    while (b!=0) {
        r = a%b
        a = b
        b = r
        println(b)
    }

    print(a)
}


