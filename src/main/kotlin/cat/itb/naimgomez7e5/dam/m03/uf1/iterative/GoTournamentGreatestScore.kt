package cat.itb.naimgomez7e5.dam.m03.uf1.iterative

import java.lang.System.`in`
import java.util.*

fun main()
{
    var counter = 0;
    var line = ""
    val scan = Scanner(System.`in`)

    var winner: String = ""
    var maxScore: Int = 0
    while (true)
    {
        println("name")
        val name = scan.nextLine();
        if(name == "END")
        {
            break
        }
        println("SCORE")
        val score = scan.nextInt();

        if(score > maxScore)
        {
            //winner = name;
            //maxScore = score;
        }
    }
    println("$winner: $maxScore")
}


