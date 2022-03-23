package cat.itb.naimgomez7e5.dam.m03.uf1.seleccio.exam
// z

import java.util.*

/*
Trio: 3 cartes del mateix número |
Escala: 3 cartes amb números consecutius
Parella: 2 cartes del mateix número
Número alt:  cap de les anteriors
 */

fun main()
{
    val scan = Scanner(System.`in`)
    val c1 = scan.nextInt()
    val c2 = scan.nextInt()
    val c3 = scan.nextInt()

    if(c1 == c2 && c1 == c3 && c2 == c3)
    {
        println("Trio")
    }
    else if (c1 == c2 || c1 == c3 || c2 == c3)
    {
        println("Parella")
    }
    else if(c2 in (c1 + 1) until c3) // No sé que fa això, originalment tenia (c3 > c2 && c2 > c1) però em donava warning
    {
        println("Escala")
    }
    else
    {
        println("Número alt")
    }



}