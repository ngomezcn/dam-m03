package cat.itb.naimgomez7e5.dam.m03.uf3.exercices

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.serialization.*

@Serializable
data class Quote(
    val author : String,
    val content: String
)

suspend fun getQuote(url : String) : Quote {
    val client = HttpClient(CIO){
        install(JsonFeature) {
            serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                ignoreUnknownKeys = true
            })
        }
    }
    return client.get(url);
}

suspend fun main(){
    val quote: Quote = getQuote("https://api.quotable.io/random")
    println(quote.author)
    println(quote.content)
}