package cat.itb.naimgomez7e5.dam.m03.uf2.recursivity

fun power(a:Int, b:Int) : Int {

    if(b == 0)
        return 1

    return a * (power(a, b-1))
}

fun main() {
    println(power(5,5))
}