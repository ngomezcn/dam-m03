package cat.itb.naimgomez7e5.dam.m03.uf2.recursivity

fun figures(n:Int, x:Int) : Int {

    if(n%x == n)
        return n.toString().length

    return figures(n-1, x*x);
}

fun fig(num: Int): Int{
    if(num != 0){
        return 1 + fig(num/10)
    }
    return 0
}

fun main() {
    println(figures(14, 10))
    println(fig(14))
}