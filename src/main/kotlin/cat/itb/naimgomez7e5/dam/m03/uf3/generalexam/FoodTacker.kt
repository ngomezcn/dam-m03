package cat.itb.naimgomez7e5.dam.m03.uf3.generalexam

import kotlinx.serialization.*
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.jsonArray
import java.util.*
import kotlin.io.path.*
import kotlin.io.path.exists
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.nio.file.Path

/**
 * Is a plate of food eaten
 * @param foodName, grams eaten, calorie per gram
 */
@Serializable
data class Food(val foodName:String, val grams:Int, val kcalPerGram:Float) {
    val totalKcal get() = grams*kcalPerGram;
}

/**
 * FoodTacker manages data persistence and logic of the app
 * @param absolute path of the file where to save/load the data
 */
class FoodTacker(private val filePath: Path) {

    private val foodList = mutableListOf<Food>()

    /**
     * On create the tracker load the data from file.
     */
    init {
        this.loadData();
    }

    /**
     * Load data from the indicated file and save it to an array
     */
    private fun loadData() {
        if(filePath.exists()) {
            val fileText = filePath.readText();
            if(fileText.isNotEmpty()) {
                val fileAsJsonArray = Json.parseToJsonElement(fileText).jsonArray
                for (item in fileAsJsonArray) {
                    foodList.add(Json.decodeFromJsonElement(item))
                }
            }
        }
    }

    /**
     * Add new food plate to the array
     */
    fun addFood(foodName:String, grams:Int, kcalPerGram:Float) {
        val newItem = Food(foodName, grams, kcalPerGram);
        foodList.add(newItem);
    }

    /**
     * Save the array of food to the indicated file
     */
    fun saveData() {
        if(filePath.notExists()){
            filePath.createFile()
        }
        filePath.writeText(Json.encodeToString(foodList));
    }

    /**
     * Return the list of food with their information.
     */
    fun getTotalKcalInfo():String {
        var kcalInfo = "";

        for (item in foodList) {
            kcalInfo += "${item.foodName} ${item.grams}g, ${item.totalKcal} kcal\n";
        }
        return kcalInfo;
    }
}

fun main() {
    val scanner = Scanner(System.`in`);

    // Initialize the food tracker
    val filePath = Path(System.getProperty("user.home")).resolve("food.json");
    val foodTracker = FoodTacker(filePath)

    // Adding new food plate to the tracker
    val food = scanner.nextLine().split(" ");
    foodTracker.addFood(food[0], food[1].toInt(),food[2].toFloat());

    // Print and save data
    print(foodTracker.getTotalKcalInfo());
    foodTracker.saveData();
}