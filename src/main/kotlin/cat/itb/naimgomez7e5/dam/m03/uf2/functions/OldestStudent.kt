package cat.itb.naimgomez7e5.dam.m03.uf2.functions

import java.util.*

fun max(list: List<Int>): Int
{
    var high = list[0];
    for(i in 2 until list.size)
    {
        if(list[i] > high)
        {
            high = list[i];
        }
    }
     return high;
}

fun main()
{

    val scan = Scanner(System.`in`);
    val arr = mutableListOf<Int>();
    var input = scan.next().toInt();

    while(input != -1)
    {
        input = scan.next().toInt();
        arr.add(input);
    }
    println("L'alumne més gran té: " + max(arr).toString() + " anys");

}