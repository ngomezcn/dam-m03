package cat.itb.naimgomez7e5.dam.m03.uf6.beachapp.models

class Beach(val id: Int, val name: String, val cityName: String, waterQuality: Int = 0) {

    init {
        if (waterQuality !in 1..5) {
            throw IllegalArgumentException("Water quality must be between 1 and 5")
        }
    }

    var waterQuality: Int = waterQuality
    set(value) {
        field = if (isQualityInRange(value)) value else throw IllegalArgumentException("Water quality must be between 1 and 5")
    }

    private fun isQualityInRange(value: Int) : Boolean {
        return value in 1..5
    }

    override fun toString(): String {
        return "Beach(id=${id}, name=${name}, city=${cityName}, quality=${waterQuality})"
    }
}

