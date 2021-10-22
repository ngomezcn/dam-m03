package cat.itb.naimgomez7e5.dam.m03.uf1.seleccio
import java.lang.Math.pow
import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main()
{
    val scan = Scanner(System.`in`)
    val x = scan.nextInt().toDouble()
    val y = scan.nextInt().toDouble()

    val a = scan.nextInt().toDouble()
    val b = scan.nextInt().toDouble()
    val r = scan.nextInt()

    /*val x : Double = 1.0
    val y : Double= 2.0

    val a : Double = 7.0
    val b : Double = 4.0
    val r : Double = 10.0*/



    val distance = sqrt((x - a).pow(2.0) + (y-b).pow(2.0));

    if(distance < r)
    {
        println("el punt és dins de la circumferència")
    }
    else
    {
        println("el punt és fora")
    }
}


