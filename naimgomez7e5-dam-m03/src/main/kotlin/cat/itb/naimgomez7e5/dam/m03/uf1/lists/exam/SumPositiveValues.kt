package cat.itb.naimgomez7e5.dam.m03.uf1.lists.exam

import java.util.*

fun main()
{
    val scan = Scanner(System.`in`)
    var result = 0;


    repeat(scan.nextInt())
    {
        var n = scan.nextInt();
        if(n >= 0)
        {
            result += n;
        }
    }
    println(result);
}