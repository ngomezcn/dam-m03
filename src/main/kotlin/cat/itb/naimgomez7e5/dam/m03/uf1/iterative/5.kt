package cat.itb.naimgomez7e5.dam.m03.uf1.iterative

fun main() {
    val list = mutableListOf(7,5,8,81,8,2,8,48,84,848,9489,48,48,84,4,6,846,8468,46,48,408,48,44,4,353,463
        ,4,486,48,4984,64,60,84,684,687,684,64,8,498,489,498,894,498,40,14,40,640,846,40,684,4,84
        ,66,40,8640,68408,6406,48,4068,4,684,6840,684,6,46,4,8)
    list[4] = 45
    list[9] = list[7]-list[11]
    if(list[1]>9)
        list[3] = 2

    for(i in 0 until list.size)
        println(list[i])}