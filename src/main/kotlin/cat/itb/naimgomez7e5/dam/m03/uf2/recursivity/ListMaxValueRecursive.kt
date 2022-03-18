package cat.itb.naimgomez7e5.dam.m03.uf2.recursivity

fun maxValue(list : MutableList<Int>, i: Int) : Int {

    return if(i == list.size-1) {
        list[i]
    }
    else {
        if(list[i] > maxValue(list, i+1)){
            list[i]
        }
        else
        {
            maxValue(list, i+1)
        }
    }
}

fun main() {

    val a = mutableListOf<Int>(3,43,5,6,4,8);
    println(maxValue(a, 1));
}