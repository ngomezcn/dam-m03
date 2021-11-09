package cat.itb.naimgomez7e5.dam.m03.uf1.iterative

import java.lang.System.`in`
import java.util.*

class PLa

fun main()
{
    var counter = 0;
    var line = ""
    val scan = Scanner(System.`in`)

    var winner: String = ""
    var maxScore: Int = 0
    while (true)
    {
        val name = scan.nextLine();
        if(name == "END")
        {
            break
        }
        val score = scan.nextLine().toInt();

        if(score > maxScore)
        {
            winner = name;
            maxScore = score;
        }
    }
    println("$winner: $maxScore")
}


