package cat.itb.naimgomez7e5.dam.m03.uf1.seleccio

import java.util.*

fun main()
{
    val number = Scanner(System.`in`).nextInt()
    var divider = 10;
    var result = 0;

    while(true){
        val digit = (number%divider)/(divider/10) // funciona.jpg
        if(digit == 0)
        {
            break
        }
        result += digit
        divider *= 10
    }

    println("$result")
}


