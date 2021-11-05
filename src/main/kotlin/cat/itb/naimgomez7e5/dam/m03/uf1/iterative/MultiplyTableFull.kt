package cat.itb.naimgomez7e5.dam.m03.uf1.seleccio

import java.lang.System.`in`
import java.util.*

fun main()
{
    for (i in 1..9 step 1) {
        for (j in 1..9 step 1) {

            val out = i * j;
            if(out<=9)
            {
                print(" $out ")
            }
            else
            {
                print("$out ")
            }
        }
        print("\n")
    }
}


