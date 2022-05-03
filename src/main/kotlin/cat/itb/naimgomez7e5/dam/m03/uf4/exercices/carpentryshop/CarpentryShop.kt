package cat.itb.naimgomez7e5.dam.m03.uf4.carpentryshop


import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()
    val products = List(count){
        readProduct(scanner)
    }
    val price = sumPrices(products)
    println("El preu total és: $price€")
}

fun sumPrices(products: List<Product>): Int {
    var sum = 0
    for(product in products)
        sum += product.totalPrice
    return sum
}

fun readProduct(scanner: Scanner) : Product {
    val type = scanner.next()
    return when(type){
        "Taulell" -> Llisto(scanner.nextInt(), scanner.nextInt())
        else -> Taulell(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
    }
}
