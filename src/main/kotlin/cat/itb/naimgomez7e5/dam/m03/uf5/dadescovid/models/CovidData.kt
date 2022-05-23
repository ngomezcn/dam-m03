package cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid.models

import kotlinx.serialization.*

@Serializable
data class CovidData (

    @SerialName("ID"        ) var ID        : String?              = null,
    @SerialName("Message"   ) var message   : String?              = null,
    @SerialName("Global"    ) var global    : Global?              = Global(),
    @SerialName("Countries" ) var countries : ArrayList<Countries> = arrayListOf(),
    @SerialName("Date"      ) var date      : String?              = null

)