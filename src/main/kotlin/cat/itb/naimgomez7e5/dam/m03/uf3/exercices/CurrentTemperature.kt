package cat.itb.naimgomez7e5.dam.m03.uf3.exercices

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.jsonObject

@Serializable
data class Conditions (
    @SerialName("temp") var temp : Float,
    @SerialName("humidity") var humidity : Float)

@Serializable
data class Weather(
    @SerialName("name") var city : String,
    @SerialName("main") var conditions : Conditions) {}

suspend fun getJson(url : String) : String {
    val client = HttpClient(CIO){
        install(JsonFeature) {

        }
    }
    return client.get(url);
}

suspend fun main() {
    val strignJson:String = getJson("http://api.openweathermap.org/data/2.5/weather?lat=41.390205&lon=2.154007&appid=d662e754d0671e1384f22d2d9023795d");
    println(strignJson)

    val serializer = Json{
        ignoreUnknownKeys = true
    }
    val weather = serializer.decodeFromString<Weather>(strignJson);
   println("Bon dia,\nAvui fa ${weather.conditions.temp/100}º a la ciutat de ${weather.city} amb una humitat del ${weather.conditions.humidity}%.")
}