package cat.itb.naimgomez7e5.dam.m03.uf1.iterative

import java.util.*

fun main()
{
    var counter = 0;
    var line = ""

    while (!line.equals("END"))
    {
        counter += 1
        line = Scanner(System.`in`).nextLine();
    }

    print(counter-1)
}


