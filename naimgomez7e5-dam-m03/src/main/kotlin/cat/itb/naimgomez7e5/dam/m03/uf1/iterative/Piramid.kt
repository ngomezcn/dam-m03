package cat.itb.naimgomez7e5.dam.m03.uf1.seleccio

import java.lang.System.`in`
import java.util.*

fun main()
{
    val size =  Scanner(System.`in`).nextInt()
    for (i in 1..size step 1) {
        for (j in 1..i step 1) {
            print("*")
        }
        print("\n")
    }
}


