package cat.itb.naimgomez7e5.dam.m03.uf1.lists.exam

import java.util.*

fun main()
{
    var list = mutableListOf<Int>(0,0,0,0,0,0,0,0,0,0);

    val scan = Scanner(System.`in`)
    var input = 0;
    var index = 0;
    while (true)
    {
        input = scan.nextInt();
        if(input == -1)
            break;

        list[input] = scan.nextInt();

        index++;
    }

    println(list)
}