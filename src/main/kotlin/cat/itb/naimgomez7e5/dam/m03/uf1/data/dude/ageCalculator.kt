package cat.itb.naimgomez7e5.dam.m03.uf1.data

import java.time.Year
import java.util.*

fun main()
{
    var age = (Year.now().value)-Scanner(System.`in`).nextInt()

    while (true) {

        if (age>0 || age>120)  {
            break
        }
        else
        {
            print("Age is not real!\n")
            age = (Year.now().value)-Scanner(System.`in`).nextInt()
        }
    }

    print("You are between " + age + " - " + (age+1) + " years old. That's a good age for practicing sport.")
}