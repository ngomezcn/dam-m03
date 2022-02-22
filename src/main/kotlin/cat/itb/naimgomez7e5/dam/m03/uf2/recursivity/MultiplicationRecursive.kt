package cat.itb.naimgomez7e5.dam.m03.uf2.recursivity

fun multiplicationRecurise(n: Int, m: Int) : Int
{
    if(m == 0)
        return 0
    return n + multiplicationRecurise(n,m-1)
}

fun main() {
    print(multiplicationRecurise(5,3))
}