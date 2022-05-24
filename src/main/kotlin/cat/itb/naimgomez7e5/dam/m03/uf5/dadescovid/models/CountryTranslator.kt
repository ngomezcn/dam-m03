package cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid.models

import kotlinx.serialization.*

@Serializable
data class CountryTranslator(
    @SerialName("short" ) var shortCode : String? = null,
    @SerialName("long"  ) var longCode  : String? = null
) {
}