package cat.itb.naimgomez7e5.dam.m03.uf5.dadescovid.models

import kotlinx.serialization.*

@Serializable
data class Countries  (
    @SerialName("ID"             ) var ID             : String?  = null,
    @SerialName("Country"        ) var country        : String?  = null,
    @SerialName("CountryCode"    ) var countryCode    : String?  = null,
    @SerialName("Slug"           ) var slug           : String?  = null,
    @SerialName("NewConfirmed"   ) var newConfirmed   : Int?     = null,
    @SerialName("TotalConfirmed" ) var totalConfirmed : Int?     = null,
    @SerialName("NewDeaths"      ) var newDeaths      : Int?     = null,
    @SerialName("TotalDeaths"    ) var totalDeaths    : Int?     = null,
    @SerialName("NewRecovered"   ) var newRecovered   : Int?     = null,
    @SerialName("TotalRecovered" ) var totalRecovered : Int?     = null,
    @SerialName("Date"           ) var date           : String?  = null,

    )  : Comparator<Countries> {
    override fun compare(p0: Countries, p1: Countries): Int {
        return p0.totalDeaths!! - p1.totalDeaths!!
    }
}