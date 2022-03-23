package cat.itb.naimgomez7e5.dam.m03.uf3.exercices


import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.serialization.*

@Serializable
data class BcnTree(
    @SerialName("nom_cientific") val scientificName : String,
    @SerialName("nom_catala") val name: String?,
    @SerialName("adreca") val adress: String
)



suspend fun main(){
    val client = HttpClient(CIO){
        install(JsonFeature) {
            serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                ignoreUnknownKeys = true
            })
        }
    }
    val trees : List<BcnTree> = client.get("https://opendata-ajuntament.barcelona.cat/resources/bcn/Arbrat/OD_Arbrat_Zona_BCN.json")
    println("There are ${trees.size} in Barcelona")
}