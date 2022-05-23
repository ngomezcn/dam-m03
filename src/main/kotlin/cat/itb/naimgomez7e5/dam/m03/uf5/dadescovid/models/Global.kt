package cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid.models

import kotlinx.serialization.*

@Serializable
data class Global (

    @SerialName("NewConfirmed"   ) var NewConfirmed   : Int?    = null,
    @SerialName("TotalConfirmed" ) var TotalConfirmed : Int?    = null,
    @SerialName("NewDeaths"      ) var NewDeaths      : Int?    = null,
    @SerialName("TotalDeaths"    ) var TotalDeaths    : Int?    = null,
    @SerialName("NewRecovered"   ) var NewRecovered   : Int?    = null,
    @SerialName("TotalRecovered" ) var TotalRecovered : Int?    = null,
    @SerialName("Date"           ) var Date           : String? = null)