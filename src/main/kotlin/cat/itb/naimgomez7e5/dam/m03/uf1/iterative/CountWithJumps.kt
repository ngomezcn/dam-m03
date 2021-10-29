package cat.itb.naimgomez7e5.dam.m03.uf1.iterative

import java.util.*

fun main()
{
    var input = Scanner(System.`in`).nextInt()

    while (input < 1 || input > 5)
    {
        input = Scanner(System.`in`).nextInt()
        print("El número introduït: $input, substituint el $input pel número.\n")
    }
    print("El número introduït: $input")
}


