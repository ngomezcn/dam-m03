package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.lists.CarpentryShop

import java.util.*

abstract class Product(val unitPrice : Int, val lenght :Int) {
    abstract val size: Int
    val totalPrice get() = size * unitPrice
}

class Taulell(unitPrice: Int, lenght: Int, val width: Int)
    :Product(unitPrice, lenght){
    override val size = lenght*width
}

class Llisto(unitPrice: Int, lenght: Int)
    :Product(unitPrice, lenght){

    override val size = lenght
}
