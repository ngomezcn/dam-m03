package cat.itb.naimgomez7e5.dam.m03.uf3.exercices
import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.jsonArray
import java.util.*
import kotlin.io.path.Path
import kotlin.io.path.*
import kotlin.io.path.exists

@Serializable
data class BuyList(val quantity:Int, val product:String, val price:Float) {

}

fun main() {

    val myBuyList = mutableListOf<BuyList>()
    val fileList = Path("").absolute().resolve("BuyListInFile.json");

    println(fileList)
    if(fileList.exists()){

        // Load data
        val text = fileList.readText();
        if(text.isNotEmpty()) {
            val jsonList = Json.parseToJsonElement(fileList.readText())
            for (item in jsonList.jsonArray) {
                val loadedItem = Json.decodeFromJsonElement<BuyList>(item);
                myBuyList.add(loadedItem)
            }
        }

        // Get new item
        val rawNewItem = Scanner(System.`in`).nextLine().split(" ");
        val newItem = BuyList(rawNewItem[0].toInt(), rawNewItem[1], rawNewItem[2].toFloat())
        myBuyList.add(newItem)

        // Write data
        fileList.writeText(Json.encodeToString(myBuyList))
    } else {
        fileList.createFile()
    }


    var totalPrice = 0F;
    println("-------- Compra --------")
    for (item in myBuyList) {

        println("${item.quantity} ${item.product} (${item.price}€) - ${item.price*item.quantity}€")
        totalPrice += item.price*item.quantity;
    }
    println("-------------------------")
    println("Total: $totalPrice€")
    println("-------------------------")
}