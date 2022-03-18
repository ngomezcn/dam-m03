package cat.itb.naimgomez7e5.dam.m03.uf1.lists

import java.util.*

fun main()
{

    val scan = Scanner(System.`in`)

   val lock = listOf(1,2,3,4,5,6,7,8)
   val key = mutableListOf<Int>();

    var input = 0
    while (input!=-1)
    {
        input = scan.nextInt()
        key.add(key.size, input)

    }

    for (i in 0 until key.size-1)
    {
        if(lock[i] == key[i])
        {
            print(true)
        }
        else
        {
            print(false)
        }

        print(" ")
    }
}


