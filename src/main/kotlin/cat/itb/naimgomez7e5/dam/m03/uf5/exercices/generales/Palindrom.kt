package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.generales

import java.util.*

fun main() {
    var text = listOf('r','o','t','o','r')
    val pila = Stack<Char>()
    val cua = mutableListOf<Char>()
    for ( myCaracter in text) {
        pila.push(myCaracter);
        cua.add(myCaracter);
    }

    val b: Boolean = esPalindrom(pila, cua);
    println(b)
}

fun esPalindrom(p : Stack<Char>, c : List<Char> ) : Boolean  {
    if(p == c.reversed()) {
        return true
    }
    return false
}