package cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CountryPopulation(
    @SerialName("code" ) var code : String? = null,
    @SerialName("population" ) var population: Long? = null
) {
}