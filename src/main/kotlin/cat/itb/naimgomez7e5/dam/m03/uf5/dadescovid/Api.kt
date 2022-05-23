package cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid

import cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid.models.CovidData
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*

class Api {
    suspend fun loadSummaryData() : CovidData {
        val client = HttpClient(CIO){
            install(JsonFeature){
                serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                    ignoreUnknownKeys = true
                })
            }
        }
        return client.get("https://api.covid19api.com/summary")
    }

    suspend fun loadEuCountryCodes() : CovidData {
        val client = HttpClient(CIO){
            install(JsonFeature){
                serializer = KotlinxSerializer(kotlinx.serialization.json.Json {
                    ignoreUnknownKeys = true
                })
            }
        }
        return client.get("https://centellas.gitlab.io/teachingSite/DAM-M03/UF5/exercicis/files/country_codes.json")
    }
}