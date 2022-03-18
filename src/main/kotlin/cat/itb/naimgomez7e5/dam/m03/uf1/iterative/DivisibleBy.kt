package cat.itb.naimgomez7e5.dam.m03.uf1.seleccio

import java.lang.System.`in`
import java.util.*

fun main()
{
    val scan = Scanner(System.`in`)
    val A = scan.nextInt()
    val B = scan.nextInt()
    for (i in A..B step 1) {
        if(i%3 == 0)
        {
            println(i)
        }
    }
}


