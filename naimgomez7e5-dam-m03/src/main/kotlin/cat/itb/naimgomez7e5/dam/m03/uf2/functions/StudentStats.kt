package cat.itb.naimgomez7e5.dam.m03.uf2.functions

import java.util.*
import kotlin.collections.*
import kotlin.*

class NotesClasse(val list: List<Int>)
{
    fun minimum() : Int?
    {
        return this.list.minOrNull();
    }
    fun max() : Int?
    {
        return this.list.maxOrNull();
    }
    fun avg() : Double
    {
        return this.list.average();
    }
}

fun main() {
    val scan = Scanner(System.`in`);
    val arr = mutableListOf<Int>();
    var input = scan.next().toInt();

    while(input != -1)
    {
        arr.add(input);
        input = scan.next().toInt();
    }
    val ob = NotesClasse(arr);


    println("Nota mínima: " + ob.minimum())
    println("Nota màxima: " + ob.max())
    println("Nota mitjana: " + ob.avg())

}