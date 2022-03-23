package cat.itb.naimgomez7e5.dam.m03.uf1.lists

import java.util.*
import kotlin.collections.ArrayList

fun main()
{
    val scan = Scanner(System.`in`);

  //  val x = scan.nextInt();
   // val y = scan.nextInt();
    val x = 3;
    val y = 3;

    val m = mutableListOf<List<Int>>(
        listOf(1,0,4),
        listOf(0,5,0),
        listOf(6,0,-9),
    );

        /*for (i in 0 until x step  1)
    {
        var tempList = mutableListOf<Int>();
        for (j in 0 until y step 1)
        {
            tempList.add(0, scan.nextInt());

        }
        m.add(i, tempList);
        //print(tempList)
    }*/

    println("Print matrix")

    val transpuesta = mutableListOf<List<Int>>();
    for (i in 0 until x step  1)
    {
        for (j in 0 until y step 1)
        {
            print(m[j][i])
        }
        println("")
    }
    println("===")

    for (i in 0 until x step  1)
    {
        for (j in 0 until y step 1)
        {
            print(m[i][j])

        }
        println("")
    }
}