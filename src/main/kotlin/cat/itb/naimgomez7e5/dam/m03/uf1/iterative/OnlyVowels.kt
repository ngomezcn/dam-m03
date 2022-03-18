package cat.itb.naimgomez7e5.dam.m03.uf1.iterative

import java.util.*

fun main()
{
    val scan = Scanner(System.`in`)
    val size = scan.nextInt()

    repeat(size)
    {
        when(val input = scan.next().single())
        {
            'a','e','i','o','u' -> print("$input ")
        }
    }
}




