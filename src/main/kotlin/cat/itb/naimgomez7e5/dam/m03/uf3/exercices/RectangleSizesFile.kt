package cat.itb.naimgomez7e5.dam.m03.uf3.exercices

import kotlin.io.path.*
import kotlinx.serialization.*
import kotlinx.serialization.json.Json

@Serializable
data class Color(val name: String) {

}

@Serializable
data class Rectangle(val width:Float, val height:Float, val color:Color){
    init {
        println("Un rectangle de $width x $height té ${width*height} d'area.")
    }
}


fun main() {
    val rectanglesFile = Path("").absolute().resolve("rectangle.json");

    if(rectanglesFile.exists()) {
        val myRectangles = Json.decodeFromString<List<Rectangle>>(rectanglesFile.readText())

    } else {
        rectanglesFile.createFile()
    }
}