package cat.itb.naimgomez7e5.dam.m03.uf1.lists.exam

import java.util.*

fun main()
{
    val scan = Scanner(System.`in`)
    var list = mutableListOf<Int>();
    var change = false;
    var slope_counter = 0;

    repeat(scan.nextInt()) // Fill list
    {
        list.add(scan.nextInt());
    }

    for (i in 1 until list.size) // Determinate first slope direction
    {
        if(list[i] < list[0])
        {
            change = true;
            break;
        }
        if(list[i] > list[0])
        {
            change = false;
            break;
        }
    }

    for (i in 2 until list.size) // Logic
    {
        if(list[i] < list[i-1] && !change)
        {
            //println("check " + list[i-1])
            slope_counter++;
            change = true;
        }
        if(list[i] > list[i-1] && change)
        {
            //println("check " + list[i-1])
            slope_counter++;
            change = false;
        }
    }

    println("Té $slope_counter canvis de pendents. \n")
}
