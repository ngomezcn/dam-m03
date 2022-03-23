package cat.itb.naimgomez7e5.dam.m03.uf2.functions

import java.util.*


class IntegerLists()
{
    fun min(list: List<Int>): Int
    {

        var lower = list[0];
        for(i in 1 until list.size)
        {
            if(list[i] < lower)
            {
                lower = list[i];
            }
        }

        return lower;
    }
}



fun main()
{

    val scan = Scanner(System.`in`);
    val arr = mutableListOf<Int>();
    var input = scan.next().toInt();
    val integers = IntegerLists();

    while(input != -1)
    {
        input = scan.next().toInt();
        arr.add(input);
    }
    println("El producte més econòmic val: " + integers.min(arr).toString() + "€");

}