package cat.itb.naimgomez7e5.dam.m03.uf1.seleccio.exam
// z
import java.util.*

fun main()
{
    // vedell: menor de 2, else adult
    // adults: vala si femella, toro/bou si mascle
    // diff: bou capat, toro no

    val scan = Scanner(System.`in`)
    val age = scan.nextInt()
    val gender = scan.nextInt()
    val capat = scan.nextInt()

    // Vedell
    if(age<2)
    {
        println("vedell")
    }
    else if(gender == 2)
    {
        println("vaca")
    }
    else
    {
        if(capat == 1)
        {
            println("bou")
        }
        else if(capat == 2)
        {
            println("toro")
        }
    }
}