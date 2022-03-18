package cat.itb.naimgomez7e5.dam.m03.uf1.lists

// Bubble sort implementation
import java.util.*

fun main()
{
    val scan = Scanner(System.`in`);
    
    var list = mutableListOf<Int>();
    var iSize = scan.nextInt();

    for (i in 0 until iSize step  1)
    {
        list.add(i, scan.nextInt())
    }

    var aux = 0;
    for (i in 0 until list.size step 1)
    {
        for (j in (i + 1) until list.size step 1) // j target to the follow item
        {
            if(list[j] < list[i])
            {
                aux = list[i];
                list[i] = list[j];
                list[j] = aux;
            }
        }
    }

    for (i in list.indices)
        print(list[i])
}