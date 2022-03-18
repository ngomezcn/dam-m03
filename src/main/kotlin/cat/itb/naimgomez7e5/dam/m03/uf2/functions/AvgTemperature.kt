package cat.itb.naimgomez7e5.dam.m03.uf2.functions

import java.util.*

fun avg(list: List<Int>): Float
{
    var sum = 0;

    for (i in list.iterator())
    {
        sum += i;
    }

    return  (sum.toFloat()/list.size);             ;
}

fun main()
{

    val scan = Scanner(System.`in`);
    val arr = mutableListOf<Int>();
    var input = scan.next().toInt();

    while(input != -1)
    {
        arr.add(input);
        input = scan.next().toInt();
    }
    println("Ha fet: " + avg(arr).toString() + " graus de mitjana");

}