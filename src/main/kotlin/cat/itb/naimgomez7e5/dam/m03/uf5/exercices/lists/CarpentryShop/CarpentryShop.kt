package cat.itb.naimgomez7e5.dam.m03.uf5.exercices.lists.CarpentryShop

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var products = readProducts(scanner)

    val totalPrice = products.sumOf {  it.unitPrice }
    val sellCounter = products.count {  it.totalPrice > 100 }
    val expensive = products.maxByOrNull { it.totalPrice }


    if (expensive != null) {
        println(expensive.lenght)
    }
    println(sellCounter)
}

fun sumPrices(products: List<Product>): Int {
    var sum = 0
    for(product in products)
        sum += product.totalPrice
    return sum
}

fun readProduct(scanner: Scanner) : Product{
    val type = scanner.next()
    return when(type){
        "Taulell" -> readTaulell(scanner)
        else -> readLlisto(scanner)
    }
}
fun readProducts(scanner: Scanner): List<Product> {
    val count = scanner.nextInt()
    val products = List(count){
        readProduct(scanner)
    }
    return products
}

fun readLlisto(scanner: Scanner) =
    Llisto(scanner.nextInt(), scanner.nextInt())

fun readTaulell(scanner: Scanner) =
    Taulell(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
